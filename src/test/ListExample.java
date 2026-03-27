package test;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("arijit");
        list.add("daniel");
        list.add("arijit");
        list.add("upakul");
        list.add("jyanata");
        list.add("rahul");

        list.add("daniel");
        list.add("arijit");

        List<String> visited = new ArrayList<>();

        for (int i=0; i<list.size(); i++) {

            String current = list.get(i);

            if (visited.contains(current)) {
                continue;
            }

            int count = 0;

            for (int j=0; j<list.size(); j++) {
                if (list.get(j).equals(current)) {
                    count++;
                }
            }

            System.out.println(current + " -> " + count);
            visited.add(current);
        }
    }
}