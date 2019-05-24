/*
Nigiri auto-generated file
*/
package net.webpossdk.objects;

import it.sdkboilerplate.exceptions.JsonSerializationException;
import it.sdkboilerplate.objects.SdkCollection;
import it.sdkboilerplate.validation.Schema;
import net.webpossdk.objects.schemas.CurrencyRetrievalSchema;

import java.util.ArrayList;


public class CurrencyRetrievalCollection extends SdkCollection<CurrencyRetrieval> {
    public Schema getSchema() throws JsonSerializationException {
        return new Schema(CurrencyRetrievalSchema.jsonSchema);
    }

    public static Class<CurrencyRetrieval> getElementsClass() {
        return CurrencyRetrieval.class;
    }

    public CurrencyRetrievalCollection(ArrayList<CurrencyRetrieval> elements) {
        super(elements);
    }
}