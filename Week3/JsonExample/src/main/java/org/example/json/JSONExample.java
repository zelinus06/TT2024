package org.example.json;


import com.google.gson.Gson;
//import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.json.JSONArray;
import org.json.JSONObject;

public class JSONExample {
    public static void main(String[] args) {
        // Chuỗi JSON đầu vào
        JSONObject jo1 = new JSONObject();
        JSONObject jo2 = new JSONObject();

        JSONArray person = new JSONArray();
        // put jsString to json object
        jo1.put("name", "Thai");
        jo1.put("age", "23");
        jo1.put("city", "HaNoi");
        person.put(jo1);

        jo2.put("name", "Long");
        jo2.put("age", "24");
        jo2.put("city", "HCM");
        person.put(jo2);
        // put Json array to an jsObject
        JSONObject list = new JSONObject();
        list.put("list", person);
//        System.out.println(list);

        // Parse Json string to json object
        String jsObjects = "{\"list\":[{\"city\":\"HaNoi\",\"name\":\"Thai\",\"age\":\"23\"},{\"city\":\"HCM\",\"name\":\"Long\",\"age\":\"24\"}]}";
        Gson gson = new Gson();
        JSONExample data = gson.fromJson(jsObjects, JSONExample.class);
        System.out.println(data);
    }

}


