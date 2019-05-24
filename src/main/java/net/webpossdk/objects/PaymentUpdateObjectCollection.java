/*
Nigiri auto-generated file
*/
package net.webpossdk.objects;

import it.sdkboilerplate.exceptions.JsonSerializationException;
import it.sdkboilerplate.objects.SdkCollection;
import it.sdkboilerplate.validation.Schema;
import net.webpossdk.objects.schemas.PaymentUpdateObjectSchema;

import java.util.ArrayList;


public class PaymentUpdateObjectCollection extends SdkCollection<PaymentUpdateObject> {
    public Schema getSchema() throws JsonSerializationException {
        return new Schema(PaymentUpdateObjectSchema.jsonSchema);
    }

    public static Class<PaymentUpdateObject> getElementsClass() {
        return PaymentUpdateObject.class;
    }

    public PaymentUpdateObjectCollection(ArrayList<PaymentUpdateObject> elements) {
        super(elements);
    }
}