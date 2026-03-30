package com.upakul.week1.day3.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {

        //using comparator - suppose we want to compare the values with the 1st value
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j){
                if (i%10 > j%10)
                    return 1;
                else
                    return -1;
            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(43);
        nums.add(11);
        nums.add(66);
        nums.add(38);

        System.out.println(nums);
        Collections.sort(nums, com);
        System.out.println(nums);
    }
}
