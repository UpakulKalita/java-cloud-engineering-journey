package com.upakul.week1.day2.collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_Country {
    public static void main(String[] args) {

        //country(key), population(value)
        HashMap<String, Integer> country = new HashMap<>();

        //entry
        country.put("India", 6500);
        country.put("China", 5456);
        System.out.println(country);

        //get value
        System.out.println(country.containsKey("India"));
        country.get("India");

        //Iterate
        for (Map.Entry<String, Integer> e : country.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = country.keySet();
        for (String key : keys){
            System.out.println(key + " " + country.get(key));
        }
    }
}
