/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package dev.hathora.cloud_api.utils;

import java.io.InputStream;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

import dev.hathora.cloud_api.utils.Hook.AfterError;
import dev.hathora.cloud_api.utils.Hook.AfterErrorContext;
import dev.hathora.cloud_api.utils.Hook.AfterSuccess;
import dev.hathora.cloud_api.utils.Hook.AfterSuccessContext;
import dev.hathora.cloud_api.utils.Hook.BeforeRequest;
import dev.hathora.cloud_api.utils.Hook.BeforeRequestContext;
import dev.hathora.cloud_api.utils.Hook.SdkInit;
import dev.hathora.cloud_api.utils.Hook.SdkInitData;

/**
 * Registers hooks for use at runtime by an end-user or for use by a customer
 * that may edit the SDKHooks.java file.
 * 
 * <p>
 * For example, this code will add a transaction id header to every request:
 * 
 * <pre>
 * hooks.registerBeforeRequest((context, request) -> {
 *     request.headers().map().put("acme-transaction-id", nextTransactionId());
 *     return request;
 * });
 * </pre>
 */
// ThreadSafe
public class Hooks implements BeforeRequest, AfterSuccess, AfterError, SdkInit {

    // we use CopyOnWriteArrayList for thread safety
    private final List<BeforeRequest> beforeRequestHooks = new CopyOnWriteArrayList<>();
    private final List<AfterSuccess> afterSuccessHooks = new CopyOnWriteArrayList<>();
    private final List<AfterError> afterErrorHooks = new CopyOnWriteArrayList<>();
    private final List<SdkInit> SdkInitHooks = new CopyOnWriteArrayList<>();
    
    /**
     * Constructor.
     */
    public Hooks() {
    }

    /**
     * Registers a {@link BeforeRequest} hook to be applied in order of
     * registration. The result of the first BeforeRequest hook will be passed to
     * the second BeforeRequest hook and processed similarly for the rest of the
     * registered hooks. If a BeforeRequest hook throws then that Exception will
     * <b>not</b> be passed to the {@link AfterError} hooks.
     * 
     * @param beforeRequest hook to be registered
     * @return this
     */
    public Hooks registerBeforeRequest(BeforeRequest beforeRequest) {
        Utils.checkNotNull(beforeRequest, "beforeRequest");
        this.beforeRequestHooks.add(beforeRequest);
        return this;
    }

    /**
     * Registers an {@link AfterSuccess} hook to be applied in order of registration
     * (multiple can be registered). The result of the first AfterSuccess hook will
     * be passed to the second AfterSuccess hook and processed similarly for the
     * rest of the registered hooks. If an AfterSuccess hook throws then that
     * Exception will <b>not</b> be passed to the {@link AfterError} hooks.
     * 
     * @param afterSuccess hook to be registered
     * @return this
     */
    public Hooks registerAfterSuccess(AfterSuccess afterSuccess) {
        Utils.checkNotNull(afterSuccess, "afterSuccess");
        this.afterSuccessHooks.add(afterSuccess);
        return this;
    }

    /**
     * Registers an {@link AfterError} hook to be applied in order of registration
     * (multiple can be registered). If the first AfterError hook throws then the 
     * second hook will be called with that exception (and no response object) and 
     * so on for the rest of the registered hooks. If an AfterError hook returns 
     * normally then its result will be passed through to the next AfterError hook
     * with the latest thrown Exception. 
     * 
     * @param afterError hook to be registered
     * @return this
     */
    public Hooks registerAfterError(AfterError afterError) {
        Utils.checkNotNull(afterError, "afterError");
        this.afterErrorHooks.add(afterError);
        return this;
    }

    /**
     * Registers a {@link SdkInit} hook to be applied in order of registration
     * (multiple can be registered).
     * 
     * @param SdkInit hook to be registered
     * @return this
     */
    public Hooks registerSdkInit(SdkInit SdkInit) {
        Utils.checkNotNull(SdkInit, "SdkInit");
        this.SdkInitHooks.add(SdkInit);
        return this;
    }
    
    @Override
    public HttpRequest beforeRequest(BeforeRequestContext context, HttpRequest request) throws Exception {
        Utils.checkNotNull(context, "context");
        Utils.checkNotNull(request, "request");
        for (BeforeRequest hook : beforeRequestHooks) {
            request = hook.beforeRequest(context, request);
        }
        return request;
    }

    @Override
    public HttpResponse<InputStream> afterSuccess(AfterSuccessContext context, HttpResponse<InputStream> response)
            throws Exception {
        Utils.checkNotNull(context, "context");
        Utils.checkNotNull(response, "response");

        for (AfterSuccess hook : afterSuccessHooks) {
            response = hook.afterSuccess(context, response);
            if (response == null) {
                throw new IllegalStateException("afterSuccess cannot return null");
            }
        }
        return response;
    }

    @Override
    public HttpResponse<InputStream> afterError(
            AfterErrorContext context, 
            Optional<HttpResponse<InputStream>> response, 
            Optional<Exception> error) throws Exception {
        Utils.checkNotNull(context, "context");
        Utils.checkNotNull(response, "response");
        Utils.checkNotNull(error, "error");
        Utils.checkArgument(
               response.isPresent() ^ error.isPresent(),
               "one and only one of response or error must be present");     
                 
        for (AfterError hook : afterErrorHooks) {
            try {
                response = Optional.ofNullable(hook.afterError(context, response, error));
                if (!response.isPresent()) {
                    throw new IllegalStateException(
                            "afterError must either throw an exception or return a non-null response");
                } 
             } catch (FailEarlyException e) {
                 Throwable cause = e.getCause();
                 if (cause instanceof Exception) {
                     throw (Exception) cause;
                 } else {
                     // must be an Error
                     throw (Error) cause;
                 } 
             } catch (Exception e) {
                 error = Optional.of(e);
                 response = Optional.empty();
             }
        }
        if (response.isPresent()) {
            return response.get();
        } else {
            throw error.get();
        }
    }

    @Override
    public SdkInitData sdkInit(SdkInitData data) {
        Utils.checkNotNull(data, "data");
        for (SdkInit hook : SdkInitHooks) {
            data = hook.sdkInit(data);
            if (data == null) {
                throw new IllegalStateException("sdkInit cannot return null");
            }
        }
        return data;
    }

    @SuppressWarnings("serial")
    public static final class FailEarlyException extends RuntimeException {
        public FailEarlyException(Exception e) {
            super(e);
        }
    }

}