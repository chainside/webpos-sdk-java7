package net.webpossdk.hooks;

import com.fasterxml.jackson.databind.ObjectMapper;
import it.sdkboilerplate.exceptions.SdkHttpException;
import it.sdkboilerplate.hooks.FailureHook;
import it.sdkboilerplate.http.SdkRequest;
import it.sdkboilerplate.http.SdkResponse;
import it.sdkboilerplate.lib.ApiContext;
import net.webpossdk.exceptions.ChainsideHttpException;

import java.io.IOException;
import java.util.HashMap;

/**
 * Hook class which takes the request id from the response and sets in on the ChainsideHttpException instance.
 * Request id is left null if the hook run method fails
 */
public class RequestIdHook extends FailureHook {

    public RequestIdHook(ApiContext context, SdkRequest request, SdkResponse response, SdkHttpException exception) {
        super(context, request, response, exception);
    }

    @Override
    public void run() {
        String jsonRawBody = this.sdkResponse.getRawBody();
        ObjectMapper jsonConverter = new ObjectMapper();
        String requestId;
        try {
            HashMap body = jsonConverter.readValue(jsonRawBody, HashMap.class);
            Object requestIdEntry = body.get("request_id");
            if (requestIdEntry == null) requestId = null;
            else requestId = requestIdEntry.toString();
            ((ChainsideHttpException) exception).setRequestId(requestId);
        } catch (IOException exc) {// we can't retrieve the request id from the response}
        }
    }
}