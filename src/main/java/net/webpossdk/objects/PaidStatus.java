/*
Nigiri auto-generated file
*/
package net.webpossdk.objects;

import it.sdkboilerplate.exceptions.JsonSerializationException;
import it.sdkboilerplate.objects.SdkBodyType;
import it.sdkboilerplate.objects.SdkObject;
import it.sdkboilerplate.validation.Schema;
import net.webpossdk.objects.schemas.PaidStatusSchema;

import java.util.HashMap;

public class PaidStatus extends SdkObject {
    public Integer crypto;
    public String fiat;

    public Schema getSchema() throws JsonSerializationException {
        return new Schema(PaidStatusSchema.jsonSchema);
    }

    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>> subObjects = new HashMap();
        return subObjects;
    }

    public Integer getCrypto() {
        return this.crypto;
    }

    public void setCrypto(Integer value) {
        this.crypto = value;
    }

    public String getFiat() {
        return this.fiat;
    }

    public void setFiat(String value) {
        this.fiat = value;
    }

    public PaidStatus() {
    }
}
