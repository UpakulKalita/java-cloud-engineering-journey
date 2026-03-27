package com.upakul.week1.day2.examples;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();

        List<Integer> list = new ArrayList<>();

        list.remove(1);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.set(1, 10);
        System.out.println(list);

        names.add("Upakul");
        names.add("Subhra");
        names.add("Naba");

        names.set(0, "CSIT");
        System.out.println(names);

//        names.add(2, "Babli");
//        System.out.println(names);
//        names.remove("Naba");
//        System.out.println(names);
//        names.remove(2);
//        System.out.println(names);


        numbers.add(23);
        System.out.println(numbers.size());


        names.add("Hina");
        names.add("Subham");
        System.out.println(names);
        System.out.println(names.get(2));
    }
}
