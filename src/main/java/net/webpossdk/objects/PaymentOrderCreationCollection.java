/*
Nigiri auto-generated file
*/
package net.webpossdk.objects;

import it.sdkboilerplate.exceptions.JsonSerializationException;
import it.sdkboilerplate.objects.SdkCollection;
import it.sdkboilerplate.validation.Schema;
import net.webpossdk.objects.schemas.PaymentOrderCreationSchema;

import java.util.ArrayList;


public class PaymentOrderCreationCollection extends SdkCollection<PaymentOrderCreation> {
    public Schema getSchema() throws JsonSerializationException {
        return new Schema(PaymentOrderCreationSchema.jsonSchema);
    }

    public static Class<PaymentOrderCreation> getElementsClass() {
        return PaymentOrderCreation.class;
    }

    public PaymentOrderCreationCollection(ArrayList<PaymentOrderCreation> elements) {
        super(elements);
    }
}