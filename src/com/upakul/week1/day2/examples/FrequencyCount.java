package com.upakul.week1.day2.examples;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FrequencyCount {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "apple"));
        List<String> visited = new ArrayList<>();

        for (int i=0; i< list.size(); i++){

            String current = list.get(i);

            if (visited.contains(current)){
                continue;
            }
            int count = 0;

            for (int j=0; j<list.size(); j++){
                if (list.get(j).equals(current)){
                    count++;
                }
            }
            System.out.println(current + " -> " + count);
            visited.add(current);
        }

    }
}
