/*
Nigiri auto-generated file
*/
package net.webpossdk.objects;

import it.sdkboilerplate.exceptions.JsonSerializationException;
import it.sdkboilerplate.objects.SdkCollection;
import it.sdkboilerplate.validation.Schema;
import net.webpossdk.objects.schemas.DepositAccountLiteSchema;

import java.util.ArrayList;


public class DepositAccountLiteCollection extends SdkCollection<DepositAccountLite> {
    public Schema getSchema() throws JsonSerializationException {
        return new Schema(DepositAccountLiteSchema.jsonSchema);
    }

    public static Class<DepositAccountLite> getElementsClass() {
        return DepositAccountLite.class;
    }

    public DepositAccountLiteCollection(ArrayList<DepositAccountLite> elements) {
        super(elements);
    }
}