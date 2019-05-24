/*
Nigiri auto-generated file
*/
package net.webpossdk.objects;

import it.sdkboilerplate.exceptions.JsonSerializationException;
import it.sdkboilerplate.objects.SdkBodyType;
import it.sdkboilerplate.objects.SdkObject;
import it.sdkboilerplate.validation.Schema;
import net.webpossdk.objects.schemas.RateRetrievalSchema;

import java.util.HashMap;

public class RateRetrieval extends SdkObject {
    public String value;
    public String from;
    public String created_at;
    public String to;
    public String source;

    public Schema getSchema() throws JsonSerializationException {
        return new Schema(RateRetrievalSchema.jsonSchema);
    }

    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>> subObjects = new HashMap();
        return subObjects;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getFrom() {
        return this.from;
    }

    public void setFrom(String value) {
        this.from = value;
    }

    public String getCreatedAt() {
        return this.created_at;
    }

    public void setCreatedAt(String value) {
        this.created_at = value;
    }

    public String getTo() {
        return this.to;
    }

    public void setTo(String value) {
        this.to = value;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String value) {
        this.source = value;
    }

    public RateRetrieval() {
    }
}
