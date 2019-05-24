/*
Nigiri auto-generated file
*/
package net.webpossdk.objects;

import it.sdkboilerplate.exceptions.JsonSerializationException;
import it.sdkboilerplate.objects.SdkCollection;
import it.sdkboilerplate.validation.Schema;
import net.webpossdk.objects.schemas.PaymentOrderCreatorSchema;

import java.util.ArrayList;


public class PaymentOrderCreatorCollection extends SdkCollection<PaymentOrderCreator> {
    public Schema getSchema() throws JsonSerializationException {
        return new Schema(PaymentOrderCreatorSchema.jsonSchema);
    }

    public static Class<PaymentOrderCreator> getElementsClass() {
        return PaymentOrderCreator.class;
    }

    public PaymentOrderCreatorCollection(ArrayList<PaymentOrderCreator> elements) {
        super(elements);
    }
}