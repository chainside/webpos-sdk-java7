/*
Nigiri auto-generated file
*/
package net.webpossdk.objects.schemas;

public class PaymentOrderCreatorSchema {
    public final static String jsonSchema = "{\"rules\": [], \"schema\": {\"deposit_account\": {\"rules\": [\"required\"], \"schema\": {\"name\": {\"rules\": [\"required\"], \"type\": \"string\"}, \"type\": {\"rules\": [\"in:bank,bitcoin\", \"required\"], \"type\": \"string\"}, \"uuid\": {\"rules\": [\"required\"], \"type\": \"uuid\"}}, \"type\": \"object\"}, \"name\": {\"rules\": [\"required\"], \"type\": \"string\"}, \"type\": {\"rules\": [\"required\", \"in:web\"], \"type\": \"string\"}, \"uuid\": {\"rules\": [\"required\"], \"type\": \"uuid\"}}, \"type\": \"object\"}";
}