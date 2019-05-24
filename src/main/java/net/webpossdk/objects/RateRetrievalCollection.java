/*
Nigiri auto-generated file
*/
package net.webpossdk.objects;

import it.sdkboilerplate.exceptions.JsonSerializationException;
import it.sdkboilerplate.objects.SdkCollection;
import it.sdkboilerplate.validation.Schema;
import net.webpossdk.objects.schemas.RateRetrievalSchema;

import java.util.ArrayList;


public class RateRetrievalCollection extends SdkCollection<RateRetrieval> {
    public Schema getSchema() throws JsonSerializationException {
        return new Schema(RateRetrievalSchema.jsonSchema);
    }

    public static Class<RateRetrieval> getElementsClass() {
        return RateRetrieval.class;
    }

    public RateRetrievalCollection(ArrayList<RateRetrieval> elements) {
        super(elements);
    }
}