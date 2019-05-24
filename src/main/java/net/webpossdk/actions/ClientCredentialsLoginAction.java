/*
Nigiri auto-generated file
*/
package net.webpossdk.actions;

import it.sdkboilerplate.exceptions.SdkHttpException;
import it.sdkboilerplate.exceptions.UnserializableObjectException;
import it.sdkboilerplate.lib.ApiContext;
import it.sdkboilerplate.objects.SdkBodyType;
import it.sdkboilerplate.validation.Schema;
import net.webpossdk.exceptions.InvalidGrantTypeException;
import net.webpossdk.exceptions.InvalidScopeException;
import net.webpossdk.exceptions.UnauthorizedClientException;
import net.webpossdk.objects.ClientCredentials;
import net.webpossdk.objects.ClientCredentialsLoginResponse;

import java.util.HashMap;

public class ClientCredentialsLoginAction extends ChainsideAuthenticatingAction {
    public ClientCredentialsLoginAction(ApiContext ctx) {
        super(ctx);
    }

    @Override
    public String getRoute() {
        return "/token";
    }

    @Override
    public String getVerb() {
        return "POST";

    }

    @Override
    public Schema getQueryParametersSchema() {
        return new Schema();
    }

    @Override
    public Schema getRouteParametersSchema() {
        return new Schema();
    }

    public HashMap<String, Class<? extends SdkHttpException>> getErrors() {
        HashMap<String, Class<? extends SdkHttpException>> errors = new HashMap();
        errors.putAll(super.getErrors());

        errors.put("1002", InvalidGrantTypeException.class);
        errors.put("1013", InvalidScopeException.class);
        errors.put("1001", UnauthorizedClientException.class);

        return errors;
    }

    @Override
    public Class<? extends SdkBodyType> getRequestBodyClass() {
        return ClientCredentials.class;
    }

    @Override
    public Class<? extends SdkBodyType> getResponseBodyClass() {
        return ClientCredentialsLoginResponse.class;
    }

    @Override
    public HashMap<String, String> getHeaders() {
        HashMap<String, String> headers = new HashMap();
        headers.put("Content-Type", "application/x-www-form-urlencoded");
        headers.put("X-Api-Version", "v1");
        headers.put("Accept", "application/json");
        return headers;
    }

    public void setClientCredentials(ClientCredentials value)
            throws UnserializableObjectException {
        this.setRequestBody(value);
    }
}