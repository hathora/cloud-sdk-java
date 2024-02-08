/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.utils;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class OneOfDeserializer<T> extends StdDeserializer<T> {

    private static final long serialVersionUID = -1;

    private final List<TypeReference<?>> typeReferences; // oneOf subschemas 
    private final Class<T> cls;
    private final ObjectMapper mapper;

    protected OneOfDeserializer(Class<T> cls, TypeReference<?>... typeReferences) {
        super(cls);
        this.typeReferences= Arrays.asList(typeReferences);
        this.cls = cls;
        this.mapper = JSON.getMapper();
    }

    @Override
    public T deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        return deserializeOneOf(mapper, p, ctxt, typeReferences, cls);
    }

    private static <T> T deserializeOneOf(ObjectMapper mapper, JsonParser p, DeserializationContext ctxt,
            List<TypeReference<?>> typeReferences, Class<T> cls) throws IOException {
        TreeNode tree = p.getCodec().readTree(p);
        // TODO don't have to generate json because can use tree.traverse to get a
        // parser to read value, perf advantage and can stop plugging in ObjectMapper
        String json = mapper.writeValueAsString(tree);
        return deserializeOneOf(mapper, json, typeReferences, cls, ctxt);
    }

    private static <T> T deserializeOneOf(ObjectMapper mapper, String json, List<TypeReference<?>> typeReferences, Class<T> cls,
            DeserializationContext ctxt) throws JsonProcessingException {
        List<Match<T>> matches = new ArrayList<>();
        for (TypeReference<?> c : typeReferences) {
            // try to deserialize with each of the member classes
            // @formatter:off
            try {
                // Jackson very permissive with readValue so we will tighten things up a bit
                if (matchPossible(c.getType(), json)) {
                    Object o = mapper.readValue(json, c);
                    T v = newInstance(cls, o);
                    matches.add(new Match<>(c, v));
                }
            } catch (DatabindException e) {} // NOPMD
            // @formatter:on
        }
        matches = applyMatchPreferences(matches, json);
        if (matches.size() == 1) {
            return matches.get(0).value;
        } else if (matches.size() > 1) {
            throw JsonMappingException.from(ctxt,
                    "json matched more than one of the possible type references, matches are: " + typeNames(matches) + " - json=\n" + json);
        } else {
            throw JsonMappingException.from(ctxt,
                "json did not match any of the possible type references: " + typeReferenceNames(typeReferences) + ", json=\n" + json);
        }
    }
    
    private static final class Match<T> {
        final TypeReference<?> typeReference;
        final T value;
        
        Match(TypeReference<?> typeReference, T value) {
            this.typeReference = typeReference;
            this.value = value;
        }
    }
    
    private static final Set<String> NUMERIC_CLASSES = Set.of(
            Integer.class.getCanonicalName(),
            Long.class.getCanonicalName(),
            BigInteger.class.getCanonicalName(),
            Float.class.getCanonicalName(),
            Double.class.getCanonicalName(),
            BigDecimal.class.getCanonicalName());

    private static final Set<String> DECIMAL_CLASSES = Set.of(
            Float.class.getCanonicalName(),
            Double.class.getCanonicalName(),
            BigDecimal.class.getCanonicalName());
    
    private static final Set<String> INTEGER_CLASSES = Set.of(
            Integer.class.getCanonicalName(),
            Long.class.getCanonicalName(),
            BigInteger.class.getCanonicalName());
    
    private static final Set<String> DATE_TIME_CLASSES = Set.of(
            OffsetDateTime.class.getCanonicalName(),
            LocalDate.class.getCanonicalName());
    
    // VisibleForTesting
    public static boolean matchPossible(Type type, String json) {
        // situations we want to AVOID that can happen with Jackson ObjectMapper:
        // * json numeric considered as valid for deserialization to OffsetDateTime, LocalDate
        // * non-double-quoted json string considered as valid string
        // * json numeric can be parsed as a Boolean
        // * double-quoted numerics can be parsed as numerics
        
        // We make important assumptions about matching json with types
        if (typeIs(type, String.class)) {
            // string must be double quoted
            return isDoubleQuoted(json);
        } else if (typeIs(type, Boolean.class)) {
            // boolean can only have false or true values
            return json.equals("true") || json.equals("false");
        } else if (NUMERIC_CLASSES.contains(type.getTypeName())) {
            return !json.contains("\"");
        } else if (typeIs(type, OffsetDateTime.class) || typeIs(type, LocalDate.class)) {
            // only json schema datetime format accepted, not epoch ms/s etc.
            return isDoubleQuoted(json) && !isNumeric(json.substring(1, json.length() - 1));
        } else {
            return true;
        }
    }
    
    private static boolean isDoubleQuoted(String s) {
        return s.length() >=2 && s.startsWith("\"") && s.endsWith("\"");
    }

    // VisibleForTesting
    public static <T> List<Match<T>> applyMatchPreferences(List<Match<T>> matches, String json) {
        if (matches.size() <= 1) {
            return matches;
        } else if (allNumeric(matches)) {
            List<Match<T>> decimalMatches = decimalMatches(matches);
            List<Match<T>> integerMatches = integerMatches(matches);
            if (!decimalMatches.isEmpty() && !integerMatches.isEmpty()) {
                if (json.contains("e")|| json.contains(".")) {
                    return decimalMatches;
                } else {
                    return integerMatches;
                }
            } else if (!decimalMatches.isEmpty()) {
                return decimalMatches;
            } else {
                return integerMatches;
            }
        } if (allDateTime(matches)) {
            if (json.contains("T")) {
                return filter(matches, OffsetDateTime.class);
            } else {
                return filter(matches, LocalDate.class);
            }
        } else {
            return matches;
        }
    }

    private static <T> List<Match<T>> filter(List<Match<T>> matches, Class<?> filterByClass) {
        return matches //
                .stream() //
                .filter(x -> x.typeReference.getType().getTypeName().equals(filterByClass.getCanonicalName())) //
                .collect(Collectors.toList());
    }
    
    private static <T> boolean allDateTime(List<Match<T>> matches) {
        return matches.stream().allMatch(x -> DATE_TIME_CLASSES.contains(x.typeReference.getType().getTypeName()));
    }
    
    private static <T> boolean allNumeric(List<Match<T>> matches) {
        return matches.stream().allMatch(x -> NUMERIC_CLASSES.contains(x.typeReference.getType().getTypeName()));
    }
    
    private static <T> List<Match<T>> decimalMatches(List<Match<T>> matches) {
        return matches //
                .stream() //
                .filter(x -> DECIMAL_CLASSES.contains(x.typeReference.getType().getTypeName())) //
                .collect(Collectors.toList());
    }
    
    private static <T> List<Match<T>> integerMatches(List<Match<T>> matches) {
        return matches //
                .stream() //
                .filter(x -> INTEGER_CLASSES.contains(x.typeReference.getType().getTypeName())) //
                .collect(Collectors.toList());
    }
    
    private static boolean isNumeric(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    private static boolean typeIs(Type type, Class<?> cls) {
        return type.getTypeName().equals(cls.getCanonicalName());
    }
    
    private static <T> String typeNames(List<Match<T>> matches) {
        return "[" + matches
                .stream()
                .map(x -> x.typeReference.getType().getTypeName())
                .collect(Collectors.joining(", ")) + "]";
    }
    
    private static String typeReferenceNames(List<TypeReference<?>> list) {
        return "[" + list
                .stream()
                .map(x -> x.getType().getTypeName())
                .collect(Collectors.joining(", ")) + "]";
    }

    private static <T> T newInstance(Class<T> cls, Object parameter) {
        try {
            Constructor<T> con = cls.getDeclaredConstructor(Object.class);
            con.setAccessible(true);
            return con.newInstance(parameter);
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            throw new RuntimeException(e);
        }
    }
}