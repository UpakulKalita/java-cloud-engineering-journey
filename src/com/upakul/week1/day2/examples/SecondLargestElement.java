package com.upakul.week1.day2.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondLargestElement {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(7, 7, 9, 9, 1, 2, 3, 4, 5, 5, 2));

        int Max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : nums){
            if (num > Max){
                secondMax = Max;
                Max = num;
            }
        }

        System.out.println("Max: " + Max);
        System.out.println("Second Max: " + secondMax);
    }
}
