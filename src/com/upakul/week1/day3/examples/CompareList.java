package com.upakul.week1.day3.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareList {
    public static void main(String[] args) {
        Comparator<String> com = new Comparator<String>() {
            @Override
            public int compare(String i, String j) {
                return Integer.compare(i.length(), j.length());
            }
        };

        List<String> names = new ArrayList<>();
        names.add("Upl");
        names.add("Babli");
        names.add("Hina");
        System.out.println("Befor sorting : " + names);

        Collections.sort(names, com);
        System.out.println("After Sorting : " + names);
        for (String key : names){
            System.out.println(key + " -> " + key.length());
        }
    }
}
