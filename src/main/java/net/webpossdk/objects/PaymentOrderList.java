/*
Nigiri auto-generated file
*/
package net.webpossdk.objects;

import it.sdkboilerplate.exceptions.JsonSerializationException;
import it.sdkboilerplate.objects.SdkBodyType;
import it.sdkboilerplate.objects.SdkObject;
import it.sdkboilerplate.validation.Schema;
import net.webpossdk.objects.schemas.PaymentOrderListSchema;

import java.util.HashMap;

public class PaymentOrderList extends SdkObject {
    public Integer total_items;
    public Integer total_pages;
    public PaymentOrderRetrievalCollection paymentorders;

    public Schema getSchema() throws JsonSerializationException {
        return new Schema(PaymentOrderListSchema.jsonSchema);
    }

    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>> subObjects = new HashMap();
        subObjects.put("paymentorders", PaymentOrderRetrievalCollection.class);
        return subObjects;
    }

    public Integer getTotalItems() {
        return this.total_items;
    }

    public void setTotalItems(Integer value) {
        this.total_items = value;
    }

    public Integer getTotalPages() {
        return this.total_pages;
    }

    public void setTotalPages(Integer value) {
        this.total_pages = value;
    }

    public PaymentOrderRetrievalCollection getPaymentorders() {
        return this.paymentorders;
    }

    public void setPaymentorders(PaymentOrderRetrievalCollection value) {
        this.paymentorders = value;
    }

    public PaymentOrderList() {
    }
}
