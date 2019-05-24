/*
Nigiri auto-generated file
*/
package net.webpossdk.objects;

import it.sdkboilerplate.exceptions.JsonSerializationException;
import it.sdkboilerplate.objects.SdkCollection;
import it.sdkboilerplate.validation.Schema;
import net.webpossdk.objects.schemas.OutSchema;

import java.util.ArrayList;


public class OutCollection extends SdkCollection<Out> {
    public Schema getSchema() throws JsonSerializationException {
        return new Schema(OutSchema.jsonSchema);
    }

    public static Class<Out> getElementsClass() {
        return Out.class;
    }

    public OutCollection(ArrayList<Out> elements) {
        super(elements);
    }
}