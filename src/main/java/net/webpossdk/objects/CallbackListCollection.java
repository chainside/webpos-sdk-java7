/*
Nigiri auto-generated file
*/
package net.webpossdk.objects;

import it.sdkboilerplate.exceptions.JsonSerializationException;
import it.sdkboilerplate.objects.SdkCollection;
import it.sdkboilerplate.validation.Schema;
import net.webpossdk.objects.schemas.CallbackListSchema;

import java.util.ArrayList;


public class CallbackListCollection extends SdkCollection<CallbackList> {
    public Schema getSchema() throws JsonSerializationException {
        return new Schema(CallbackListSchema.jsonSchema);
    }

    public static Class<CallbackList> getElementsClass() {
        return CallbackList.class;
    }

    public CallbackListCollection(ArrayList<CallbackList> elements) {
        super(elements);
    }
}