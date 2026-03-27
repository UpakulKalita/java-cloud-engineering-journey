package com.upakul.week1.day2.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Upakul", "Babli", "Hina"));

        List<String> reversedNames = new ArrayList<>();

        System.out.println(names);

//        Collections.reverse(names);
        for (int i = names.size()-1; i>=0; i--){

            reversedNames.add(names.get(i));
        }

        System.out.println(reversedNames);

    }
}
