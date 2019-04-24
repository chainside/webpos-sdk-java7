/*
Nigiri auto-generated file
*/
package net.webpossdk.objects.schemas;

public class PaymentOrderCreationSchema {
    public final static String jsonSchema = "{\"rules\": [], \"schema\": {\"amount\": {\"rules\": [\"required\", \"decimal\"], \"type\": \"string\"}, \"callback_url\": {\"rules\": [\"regex[https_url]:^https://\", \"nullable\"], \"type\": \"url\"}, \"cancel_url\": {\"rules\": [\"regex[https_url]:^https://\", \"nullable\"], \"type\": \"url\"}, \"continue_url\": {\"rules\": [\"regex[https_url]:^https://\", \"nullable\"], \"type\": \"url\"}, \"details\": {\"rules\": [\"required\"], \"type\": \"string\"}, \"reference\": {\"rules\": [], \"type\": \"string\"}, \"required_confirmations\": {\"rules\": [\"min:0\", \"nullable\"], \"type\": \"integer\"}}, \"type\": \"object\"}";
}