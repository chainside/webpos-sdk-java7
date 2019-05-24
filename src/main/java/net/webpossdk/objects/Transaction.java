/*
Nigiri auto-generated file
*/
package net.webpossdk.objects;

import it.sdkboilerplate.exceptions.JsonSerializationException;
import it.sdkboilerplate.objects.SdkBodyType;
import it.sdkboilerplate.objects.SdkObject;
import it.sdkboilerplate.validation.Schema;
import net.webpossdk.objects.schemas.TransactionSchema;

import java.util.HashMap;

public class Transaction extends SdkObject {
    public Integer outs_sum;
    public String blockchain_status;
    public String txid;
    public OutCollection outs;
    public String created_at;
    public String status;
    public String normalized_txid;

    public Schema getSchema() throws JsonSerializationException {
        return new Schema(TransactionSchema.jsonSchema);
    }

    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>> subObjects = new HashMap();
        subObjects.put("outs", OutCollection.class);
        return subObjects;
    }

    public Integer getOutsSum() {
        return this.outs_sum;
    }

    public void setOutsSum(Integer value) {
        this.outs_sum = value;
    }

    public String getBlockchainStatus() {
        return this.blockchain_status;
    }

    public void setBlockchainStatus(String value) {
        this.blockchain_status = value;
    }

    public String getTxid() {
        return this.txid;
    }

    public void setTxid(String value) {
        this.txid = value;
    }

    public OutCollection getOuts() {
        return this.outs;
    }

    public void setOuts(OutCollection value) {
        this.outs = value;
    }

    public String getCreatedAt() {
        return this.created_at;
    }

    public void setCreatedAt(String value) {
        this.created_at = value;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String value) {
        this.status = value;
    }

    public String getNormalizedTxid() {
        return this.normalized_txid;
    }

    public void setNormalizedTxid(String value) {
        this.normalized_txid = value;
    }

    public Transaction() {
    }
}
