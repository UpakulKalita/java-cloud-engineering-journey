package com.upakul.week1.day2.collections.Map;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Upakul");
        map.put(2, "Babli");
        map.put(41, "Subham");
        System.out.println(map);

        //map.get()
        String key_41 = map.get(41);
        System.out.println(key_41);

        //map.containsKey // map.containsValue()
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Babli"));

        for (int i : map.keySet()){
            System.out.println(map.get(i));
        }

    }
}
