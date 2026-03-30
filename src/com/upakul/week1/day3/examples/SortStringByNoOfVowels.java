package com.upakul.week1.day3.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortStringByNoOfVowels {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("apple");
        names.add("sky");
        names.add("banana");
        names.add("Uk");

        Comparator<String> com = new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return Integer.compare(countVowels(a), countVowels(b));
            }
        };

        Collections.sort(names, com);
        System.out.println(names);

    }

    //count vowels
    public static int countVowels(String str){
        int count = 0;
        for (char ch : str.toLowerCase().toCharArray()){
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
}
