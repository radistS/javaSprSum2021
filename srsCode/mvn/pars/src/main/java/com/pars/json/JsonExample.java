package com.pars.json;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.Optional;

public class JsonExample {

    public static void main(String[] args) {
        String json = "{\"exchangeRate\":\"1650.0\",\"externalPaymentDetails\":\"{subscriberId=12054, smartCardId=02124108694, providerName=StarTimes, tvPackage=StarTimes, expirationDate=2019-07-13}\"}";


        JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();

        Optional<JsonElement> jsonElement = Optional.ofNullable(jsonObject.get("exchangeRate"));
        if (jsonElement.isPresent()) {
            System.out.println(jsonElement.get().getAsString());
        } else {
            System.out.println("");
        }

        JsonElement el = jsonObject.get("externalPaymentDetails");
        System.out.println(el.getAsString());

        JsonElement je = jsonObject.get("test");
        System.out.println(je);
    }
}
