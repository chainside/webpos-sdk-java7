/*
Nigiri auto-generated file
*/
package net.webpossdk.objects;

import it.sdkboilerplate.exceptions.JsonSerializationException;
import it.sdkboilerplate.objects.SdkBodyType;
import it.sdkboilerplate.objects.SdkObject;
import it.sdkboilerplate.validation.Schema;
import net.webpossdk.objects.schemas.CallbackListSchema;

import java.util.HashMap;

public class CallbackList extends SdkObject {
    public CallbackCollection callbacks;

    public Schema getSchema() throws JsonSerializationException {
        return new Schema(CallbackListSchema.jsonSchema);
    }

    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>> subObjects = new HashMap();
        subObjects.put("callbacks", CallbackCollection.class);
        return subObjects;
    }

    public CallbackCollection getCallbacks() {
        return this.callbacks;
    }

    public void setCallbacks(CallbackCollection value) {
        this.callbacks = value;
    }

    public CallbackList() {
    }
}
