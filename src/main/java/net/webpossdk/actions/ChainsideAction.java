package net.webpossdk.actions;

import com.fasterxml.jackson.databind.ObjectMapper;
import it.sdkboilerplate.actions.Action;
import it.sdkboilerplate.exceptions.SdkHttpException;
import it.sdkboilerplate.hooks.FailureHook;
import it.sdkboilerplate.hooks.PreSendHook;
import it.sdkboilerplate.hooks.SuccessHook;
import it.sdkboilerplate.http.SdkResponse;
import it.sdkboilerplate.lib.ApiContext;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class ChainsideAction extends Action {
    public ChainsideAction(ApiContext ctx) {
        super(ctx);
    }

    @Override
    public ArrayList<Class<? extends FailureHook>> getFailureHooks() {
        return new ArrayList();
    }

    @Override
    public ArrayList<Class<? extends SuccessHook>> getSuccessHooks() {
        return new ArrayList();
    }

    @Override
    public ArrayList<Class<? extends PreSendHook>> getPreSendHooks() {
        return new ArrayList();
    }

    @Override
    public HashMap<String, Class<? extends SdkHttpException>> getErrors() {
        return new HashMap();
    }

    @Override
    public String getExceptionKey(SdkResponse sdkResponse) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            HashMap<String, Object> jsonBody = mapper.readValue(sdkResponse.getRawBody(), HashMap.class);
            return jsonBody.get("error_code").toString();
        } catch (IOException e) {
            return null;
        }
    }
}
