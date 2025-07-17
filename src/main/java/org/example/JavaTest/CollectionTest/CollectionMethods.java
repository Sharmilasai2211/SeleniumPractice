package org.example.JavaTest.CollectionTest;

import java.util.*;

public class CollectionMethods {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        Collections.addAll(list, "sharmila", "Sai", "sharmi");
        System.out.println(list.contains("sharmila"));
        System.out.println(Collections.EMPTY_SET.containsAll(Arrays.asList("sai", "hridaya")));

        System.out.println(list.get(2).equals("sharmi"));

        list.sort(Collections.reverseOrder());

        System.out.println(list);

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        Collections.sort(list);

        Set<String> set = new HashSet<>(list);
//        Collections.sort(set);
    }
}
