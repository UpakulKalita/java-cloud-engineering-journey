package com.upakul.week1.day2.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Remove_Duplicates {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(7, 7, 9, 9, 1, 2, 3, 4, 5, 5, 2));

        List<Integer> numsWithoutDuplicate = new ArrayList<>();

        System.out.println(nums);

        for (int i=0; i<nums.size(); i++){
            int num = nums.get(i);

            if(!numsWithoutDuplicate.contains(num)){
                numsWithoutDuplicate.add(num);
            }
        }

        Collections.sort(numsWithoutDuplicate);
        System.out.println(numsWithoutDuplicate);
    }
}
