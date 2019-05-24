/*
Nigiri auto-generated file
*/
package net.webpossdk.objects;

import it.sdkboilerplate.exceptions.JsonSerializationException;
import it.sdkboilerplate.objects.SdkCollection;
import it.sdkboilerplate.validation.Schema;
import net.webpossdk.objects.schemas.PaidStatusSchema;

import java.util.ArrayList;


public class PaidStatusCollection extends SdkCollection<PaidStatus> {
    public Schema getSchema() throws JsonSerializationException {
        return new Schema(PaidStatusSchema.jsonSchema);
    }

    public static Class<PaidStatus> getElementsClass() {
        return PaidStatus.class;
    }

    public PaidStatusCollection(ArrayList<PaidStatus> elements) {
        super(elements);
    }
}