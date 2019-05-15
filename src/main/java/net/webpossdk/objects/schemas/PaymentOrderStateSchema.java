/*
Nigiri auto-generated file
*/
package net.webpossdk.objects.schemas;

public class PaymentOrderStateSchema {
    public final static String jsonSchema = "{\"rules\": [], \"schema\": {\"blockchain_status\": {\"rules\": [\"in:pending,partial,mempool_unconfirmed,unconfirmed,paid,cancelled,expired,network_dispute,mempool_network_dispute,possible_chargeback,chargeback\", \"required\"], \"type\": \"string\"}, \"in_confirmation\": {\"rules\": [\"nullable\", \"required\"], \"schema\": {\"crypto\": {\"rules\": [\"required\"], \"type\": \"integer\"}, \"fiat\": {\"rules\": [\"required\", \"decimal\"], \"type\": \"string\"}}, \"type\": \"object\"}, \"paid\": {\"rules\": [\"nullable\", \"required\"], \"schema\": {\"crypto\": {\"rules\": [\"required\"], \"type\": \"integer\"}, \"fiat\": {\"rules\": [\"required\", \"decimal\"], \"type\": \"string\"}}, \"type\": \"object\"}, \"status\": {\"rules\": [\"in:pending,paid,cancelled,expired,network_dispute,chargeback\", \"required\"], \"type\": \"string\"}, \"unpaid\": {\"rules\": [\"nullable\", \"required\"], \"schema\": {\"crypto\": {\"rules\": [\"required\"], \"type\": \"integer\"}, \"fiat\": {\"rules\": [\"required\", \"decimal\"], \"type\": \"string\"}}, \"type\": \"object\"}}, \"type\": \"object\"}";
}