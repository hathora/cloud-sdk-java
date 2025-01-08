/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_sdk.utils;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.http.HttpRequest.BodyPublishers;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Pattern;

import org.apache.hc.client5.http.entity.UrlEncodedFormEntity;
import org.apache.hc.client5.http.entity.mime.HttpMultipartMode;
import org.apache.hc.client5.http.entity.mime.MultipartEntityBuilder;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.NameValuePair;
import org.apache.hc.core5.http.message.BasicNameValuePair;
import org.openapitools.jackson.nullable.JsonNullable;

import com.fasterxml.jackson.databind.ObjectMapper;

public final class RequestBody {
    private static final Map<String, String> SERIALIZATION_METHOD_TO_CONTENT_TYPE = Map.of(
            "json", "application/json",
            "form", "application/x-www-form-urlencoded",
            "multipart", "multipart/form-data",
            "raw", "application/octet-stream",
            "string", "text/plain");

    private RequestBody() {
        // prevent instantiation
    }

    public static SerializedBody serialize(Object request, String requestField, String serializationMethod, boolean nullable)
            throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException,
            UnsupportedOperationException, IOException {
        if (request == null) {
            return null;
        }
        
        if (!nullable && (request instanceof Optional) && ((Optional<?>) request).isEmpty()) {
            request = JsonNullable.undefined();
        }

        if (Types.getType(request.getClass()) != Types.OBJECT) {
            return serializeContentType(requestField, SERIALIZATION_METHOD_TO_CONTENT_TYPE.get(serializationMethod),
                    request);
        }

        Field reqField = null;

        try {
            reqField = request.getClass().getDeclaredField(requestField);
            reqField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            // ignore
        }
        if (reqField == null) {
            return serializeContentType(requestField, SERIALIZATION_METHOD_TO_CONTENT_TYPE.get(serializationMethod),
                    request);
        }

        Object requestValue = reqField.get(request);
        requestValue = Utils.resolveOptionals(requestValue);
        if (requestValue == null) {
            return null;
        }

        RequestMetadata requestMetadata = RequestMetadata.parse(reqField);
        if (requestMetadata == null) {
            throw new RuntimeException("Missing request metadata on request field");
        }

        return serializeContentType(requestField, requestMetadata.mediaType, requestValue);
    }

    private static SerializedBody serializeContentType(String fieldName, String contentType, Object value)
            throws IllegalArgumentException, IllegalAccessException, UnsupportedOperationException, IOException {
        Pattern jsonPattern = Pattern.compile("(application|text)\\/.*?\\+*json.*");
        Pattern multipartPattern = Pattern.compile("multipart\\/.*");
        Pattern formPattern = Pattern.compile("application\\/x-www-form-urlencoded.*");
        Pattern textPattern = Pattern.compile("text\\/plain");

        final SerializedBody body;

        if (textPattern.matcher(contentType).matches()) {
            body = new SerializedBody(contentType, BodyPublishers.ofString(value.toString()));
        } else if (jsonPattern.matcher(contentType).matches()) {
            ObjectMapper mapper = JSON.getMapper();
            if (value instanceof JsonNullable && !((JsonNullable<?>) value).isPresent()) {
                body = new SerializedBody(contentType, BodyPublishers.noBody());
            } else {
                body = new SerializedBody(contentType, 
                        BodyPublishers.ofString(mapper.writeValueAsString(value)));
            }
        } else if (multipartPattern.matcher(contentType).matches()) {
            body = serializeMultipart(value);
        } else if (formPattern.matcher(contentType).matches()) {
            body = serializeFormData(value);
        } else {
            if (value instanceof String) {
                body = new SerializedBody(contentType, BodyPublishers.ofString((String) value));
            } else if (value instanceof byte[]) {
                body = new SerializedBody(contentType, BodyPublishers.ofByteArray((byte[]) value));
            } else {
                throw new RuntimeException("Unsupported content type " + contentType + " for field " + fieldName);
            }
        }
        return body;
    }

    private static SerializedBody serializeMultipart(Object value)
            throws IllegalArgumentException, IllegalAccessException, UnsupportedOperationException, IOException {
        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        builder.setMode(HttpMultipartMode.EXTENDED);
        String boundary = "-------------" + System.currentTimeMillis();
        builder.setBoundary(boundary);

        Field[] fields = value.getClass().getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            if (Modifier.isStatic(field.getModifiers())) {
                continue;
            }
            Object val = Utils.resolveOptionals(field.get(value));
            
            if (val == null) {
                continue;
            }

            MultipartFormMetadata metadata = MultipartFormMetadata.parse(field);
            if (metadata == null) {
                throw new RuntimeException("Missing multipart form metadata on field " + field.getName());
            }

            if (metadata.file) {
                serializeMultipartFile(metadata.name, builder, val);
            } else if (metadata.json) {
                ObjectMapper mapper = JSON.getMapper();
                String json = mapper.writeValueAsString(val);
                builder.addTextBody(metadata.name, json, ContentType.APPLICATION_JSON);
            } else {
                if (val instanceof List || val.getClass().isArray()) {
                    List<?> arr = Utils.toList(val);
                    for (Object item : arr) {
                        builder.addTextBody(metadata.name + "[]", Utils.valToString(item));
                    }
                } else {
                    builder.addTextBody(metadata.name, Utils.valToString(val));
                }
            }
        }

        HttpEntity entity = builder.build();
        String ct = builder.build().getContentType();
        return new SerializedBody(ct, BodyPublishers.ofInputStream(() -> {
            try {
                return entity.getContent();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }));
    }

    private static void serializeMultipartFile(String fieldName, MultipartEntityBuilder builder, Object file)
            throws IllegalArgumentException, IllegalAccessException {
        if (Types.getType(file.getClass()) != Types.OBJECT) {
            throw new RuntimeException("Invalid type for multipart file");
        }

        String fileName = "";
        byte[] content = null;

        Field[] fields = file.getClass().getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            Object val = field.get(file);

            if (val == null) {
                continue;
            }

            MultipartFormMetadata metadata = MultipartFormMetadata.parse(field);
            if (metadata == null || (!metadata.content && (metadata.name == null || metadata.name.isBlank()))) {
                continue;
            }

            if (metadata.content) {
                content = (byte[]) val;
            } else {
                fileName = Utils.valToString(val);
            }
        }

        if (fileName.isBlank() || content == null) {
            throw new RuntimeException("Invalid multipart file");
        }

        builder.addBinaryBody(fieldName, content, ContentType.APPLICATION_OCTET_STREAM, fileName);
    }

    public static SerializedBody serializeFormData(Object value)
            throws IOException, IllegalArgumentException, IllegalAccessException {
        List<NameValuePair> params = new ArrayList<>();

        switch (Types.getType(value.getClass())) {
            case MAP:
                Map<?, ?> map = (Map<?, ?>) value;

                for (Map.Entry<?, ?> entry : map.entrySet()) {
                    params.add(
                            new BasicNameValuePair(Utils.valToString(entry.getKey()),
                                    Utils.valToString(entry.getValue())));
                }
                break;
            case OBJECT:
                if (!Utils.allowIntrospection(value.getClass())) {
                    throw new RuntimeException("Invalid type for form data");
                }
                Field[] fields = value.getClass().getDeclaredFields();

                for (Field field : fields) {
                    field.setAccessible(true);
                    Object val = Utils.resolveOptionals(field.get(value));
                    
                    if (val == null) {
                        continue;
                    }

                    FormMetadata metadata = FormMetadata.parse(field);
                    if (metadata == null) {
                        continue;
                    }

                    if (metadata.json) {
                        ObjectMapper mapper = JSON.getMapper();
                        String json = mapper.writeValueAsString(val);
                        params.add(new BasicNameValuePair(metadata.name, json));
                    } else {
                        switch (Types.getType(val.getClass())) {
                            case OBJECT: {
                                if (!Utils.allowIntrospection(val.getClass())) {
                                    params.add(new BasicNameValuePair(metadata.name, String.valueOf(val)));
                                } else {

                                    Field[] valFields = val.getClass().getDeclaredFields();

                                    List<String> items = new ArrayList<>();

                                    for (Field valField : valFields) {
                                        valField.setAccessible(true);
                                        Object v = Utils.resolveOptionals(valField.get(val));
                                        if (v == null) {
                                            continue;
                                        }

                                        FormMetadata valMetadata = FormMetadata.parse(valField);
                                        if (valMetadata == null) {
                                            continue;
                                        }

                                        if (metadata.explode) {
                                            params.add(new BasicNameValuePair(valMetadata.name,
                                                    Utils.valToString(v)));
                                        } else {
                                            items.add(String.format("%s,%s", valMetadata.name,
                                                    Utils.valToString(v)));
                                        }
                                    }

                                    if (items.size() > 0) {
                                        params.add(new BasicNameValuePair(metadata.name, String.join(",", items)));
                                    }
                                }
                                break;
                            }
                            case MAP: {
                                Map<?, ?> valMap = (Map<?, ?>) val;

                                List<String> items = new ArrayList<>();

                                for (Map.Entry<?, ?> entry : valMap.entrySet()) {
                                    if (metadata.explode) {
                                        params.add(new BasicNameValuePair(Utils.valToString(entry.getKey()),
                                                Utils.valToString(entry.getValue())));
                                    } else {
                                        items.add(String.format("%s,%s", entry.getKey(), entry.getValue()));
                                    }
                                }

                                if (items.size() > 0) {
                                    params.add(new BasicNameValuePair(metadata.name, String.join(",", items)));
                                }

                                break;
                            }
                            case ARRAY: {
                                final List<?> array = Utils.toList(val);

                                List<String> items = new ArrayList<>();

                                for (Object item : array) {
                                    if (metadata.explode) {
                                        params.add(new BasicNameValuePair(metadata.name, Utils.valToString(item)));
                                    } else {
                                        items.add(Utils.valToString(item));
                                    }
                                }

                                if (items.size() > 0) {
                                    params.add(new BasicNameValuePair(metadata.name, String.join(",", items)));
                                }

                                break;
                            }
                            default:
                                params.add(new BasicNameValuePair(metadata.name, Utils.valToString(val)));
                                break;
                        }
                    }
                }
                break;
            default:
                throw new RuntimeException("Invalid type for form data");
        }

        @SuppressWarnings("resource")
        UrlEncodedFormEntity entity = new UrlEncodedFormEntity(params);
        String ct = entity.getContentType();
        // ensure that a fresh open input stream is provided every time
        // by the BodyPublisher 
        return new SerializedBody(ct, BodyPublishers.ofInputStream(() -> {
            try {
                return entity.getContent();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }));
    }
}