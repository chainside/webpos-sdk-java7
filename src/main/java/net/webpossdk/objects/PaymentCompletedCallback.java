/*
Nigiri auto-generated file
*/
package net.webpossdk.objects;

import it.sdkboilerplate.exceptions.JsonSerializationException;
import it.sdkboilerplate.objects.SdkBodyType;
import it.sdkboilerplate.objects.SdkObject;
import it.sdkboilerplate.validation.Schema;
import net.webpossdk.objects.schemas.CallbackPaymentOrderSchema;

import java.util.HashMap;

public class PaymentCompletedCallback extends SdkObject {

    private CallbackPaymentOrder object;

    public CallbackPaymentOrder getObject() {
        return this.object;
    }

    public void setObject(CallbackPaymentOrder value) {
        this.object = value;
    }

    private String createdAt;

    public String getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(String value) {
        this.createdAt = value;
    }

    private String objectType;

    public String getObjectType() {
        return this.objectType;
    }

    public void setObjectType(String value) {
        this.objectType = value;
    }

    private String event;

    public String getEvent() {
        return this.event;
    }

    public void setEvent(String value) {
        this.event = value;
    }

    public Schema getSchema() throws JsonSerializationException {
        return new Schema(CallbackPaymentOrderSchema.jsonSchema);
    }

    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>> subObjects = new HashMap();
        subObjects.put("object", CallbackPaymentOrder.class);
        return subObjects;
    }


    public PaymentCompletedCallback() {
    }
}