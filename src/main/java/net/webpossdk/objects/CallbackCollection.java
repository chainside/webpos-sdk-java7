/*
Nigiri auto-generated file
*/
package net.webpossdk.objects;

import it.sdkboilerplate.exceptions.JsonSerializationException;
import it.sdkboilerplate.objects.SdkCollection;
import it.sdkboilerplate.validation.Schema;
import net.webpossdk.objects.schemas.CallbackSchema;

import java.util.ArrayList;


public class CallbackCollection extends SdkCollection<Callback> {
    public Schema getSchema() throws JsonSerializationException {
        return new Schema(CallbackSchema.jsonSchema);
    }

    public static Class<Callback> getElementsClass() {
        return Callback.class;
    }

    public CallbackCollection(ArrayList<Callback> elements) {
        super(elements);
    }
}