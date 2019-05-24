/*
Nigiri auto-generated file
*/
package net.webpossdk.objects;

import it.sdkboilerplate.exceptions.JsonSerializationException;
import it.sdkboilerplate.objects.SdkCollection;
import it.sdkboilerplate.validation.Schema;
import net.webpossdk.objects.schemas.TransactionSchema;

import java.util.ArrayList;


public class TransactionCollection extends SdkCollection<Transaction> {
    public Schema getSchema() throws JsonSerializationException {
        return new Schema(TransactionSchema.jsonSchema);
    }

    public static Class<Transaction> getElementsClass() {
        return Transaction.class;
    }

    public TransactionCollection(ArrayList<Transaction> elements) {
        super(elements);
    }
}