/*
Nigiri auto-generated file
*/
package net.webpossdk.objects.schemas;

public class TransactionSchema {
    public final static String jsonSchema = "{\"rules\": [], \"schema\": {\"blockchain_status\": {\"rules\": [\"required\", \"in:mempool,unconfirmed,confirmed,reverted\"], \"type\": \"string\"}, \"created_at\": {\"rules\": [\"required\"], \"type\": \"ISO_8601_date\"}, \"normalized_txid\": {\"rules\": [\"len:64\", \"required\"], \"type\": \"string\"}, \"outs\": {\"elements\": {\"rules\": [], \"schema\": {\"amount\": {\"rules\": [\"required\"], \"type\": \"integer\"}, \"n\": {\"rules\": [\"required\"], \"type\": \"integer\"}}, \"type\": \"object\"}, \"rules\": [\"required\"], \"type\": \"array\"}, \"outs_sum\": {\"rules\": [\"required\"], \"type\": \"integer\"}, \"status\": {\"rules\": [\"required\", \"in:unconfirmed,confirmed,reverted\"], \"type\": \"string\"}, \"txid\": {\"rules\": [\"len:64\", \"required\"], \"type\": \"string\"}}, \"type\": \"object\"}";
}