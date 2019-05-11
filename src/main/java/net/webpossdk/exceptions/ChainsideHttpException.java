package net.webpossdk.exceptions;

import it.sdkboilerplate.exceptions.SdkHttpException;

public class ChainsideHttpException extends SdkHttpException {
    public String getRequestId() {
        if (requestId == null) return "Could not retrieve request id from the response";
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    private String requestId;

}
