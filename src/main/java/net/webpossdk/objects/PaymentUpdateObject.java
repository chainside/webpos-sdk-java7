/*
Nigiri auto-generated file
*/
package net.webpossdk.objects;

import it.sdkboilerplate.exceptions.JsonSerializationException;
import it.sdkboilerplate.objects.SdkBodyType;
import it.sdkboilerplate.objects.SdkObject;
import it.sdkboilerplate.validation.Schema;
import net.webpossdk.objects.schemas.PaymentUpdateObjectSchema;

import java.util.HashMap;

public class PaymentUpdateObject extends SdkObject {
    public String callback;

    public Schema getSchema() throws JsonSerializationException {
        return new Schema(PaymentUpdateObjectSchema.jsonSchema);
    }

    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>> subObjects = new HashMap();
        return subObjects;
    }

    public String getCallback() {
        return this.callback;
    }

    public void setCallback(String value) {
        this.callback = value;
    }

    public PaymentUpdateObject() {
    }
}
