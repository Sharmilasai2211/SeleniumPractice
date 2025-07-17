package org.example.JavaTest.CollectionTest;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetEx {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("ravi");
        set.add("Ajay");
        System.out.println(set);

        HashSet<String> set1 = new HashSet<>();
        set1.add("Mary");
        set1.add("Joe");
        set.addAll(set1);
        System.out.println(set);

        set.removeAll(set1);
        System.out.println(set);

        System.out.println(set.size());

        set.removeIf(str->str.contains("Vijay"));
        System.out.println(set);

        set.clear();
        System.out.println(set.isEmpty());
//        LinkedHashSet
    }
}
