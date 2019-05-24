/*
Nigiri auto-generated file
*/
package net.webpossdk.objects;

import it.sdkboilerplate.exceptions.JsonSerializationException;
import it.sdkboilerplate.objects.SdkBodyType;
import it.sdkboilerplate.objects.SdkObject;
import it.sdkboilerplate.validation.Schema;
import net.webpossdk.objects.schemas.PaymentOrderCreatorSchema;

import java.util.HashMap;

public class PaymentOrderCreator extends SdkObject {
    public String uuid;
    public DepositAccountLite deposit_account;
    public String type;
    public String name;
    public Boolean active;

    public Schema getSchema() throws JsonSerializationException {
        return new Schema(PaymentOrderCreatorSchema.jsonSchema);
    }

    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>> subObjects = new HashMap();
        subObjects.put("deposit_account", DepositAccountLite.class);
        return subObjects;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String value) {
        this.uuid = value;
    }

    public DepositAccountLite getDepositAccount() {
        return this.deposit_account;
    }

    public void setDepositAccount(DepositAccountLite value) {
        this.deposit_account = value;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String value) {
        this.type = value;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean value) {
        this.active = value;
    }

    public PaymentOrderCreator() {
    }
}
