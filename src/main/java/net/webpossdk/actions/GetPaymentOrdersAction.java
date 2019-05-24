/*
Nigiri auto-generated file
*/
package net.webpossdk.actions;

import it.sdkboilerplate.exceptions.SdkHttpException;
import it.sdkboilerplate.lib.ApiContext;
import it.sdkboilerplate.objects.SdkBodyType;
import it.sdkboilerplate.validation.Schema;
import net.webpossdk.objects.PaymentOrderList;

import java.util.HashMap;

public class GetPaymentOrdersAction extends ChainsideAuthenticatedAction {
    public GetPaymentOrdersAction(ApiContext ctx) {
        super(ctx);
    }

    @Override
    public String getRoute() {
        return "/payment-order";
    }

    @Override
    public String getVerb() {
        return "GET";

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

        return errors;
    }

    @Override
    public Class<? extends SdkBodyType> getRequestBodyClass() {
        return null;
    }

    @Override
    public Class<? extends SdkBodyType> getResponseBodyClass() {
        return PaymentOrderList.class;
    }

    @Override
    public HashMap<String, String> getHeaders() {
        HashMap<String, String> headers = new HashMap();
        headers.put("Content-Type", "application/json");
        headers.put("X-Api-Version", "v1");
        headers.put("Accept", "application/json");
        return headers;
    }

    public void setPage(String value) {
        this.setQueryParameter("page", value);
    }

    public void setPageSize(String value) {
        this.setQueryParameter("page_size", value);
    }

    public void setSortBy(String value) {
        this.setQueryParameter("sort_by", value);
    }

    public void setSortOrder(String value) {
        this.setQueryParameter("sort_order", value);
    }

    public void setStatus(String value) {
        this.setQueryParameter("status", value);
    }
}