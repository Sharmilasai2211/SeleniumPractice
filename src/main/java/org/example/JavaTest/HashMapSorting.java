package org.example.JavaTest;

import groovyjarjarantlr4.runtime.tree.Tree;

import java.util.*;

public class HashMapSorting {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Orange", 5);
        map.put("Banana", 2);
        map.put("Apple", 8);

        List<String> l = new ArrayList<>(map.keySet());
        Collections.sort(l);

        System.out.println("Sorting based on key using list ");
        for(String s: l){
            System.out.println(s+"->"+map.get(s));
        }

        List<Map.Entry<String, Integer>> entry = new LinkedList<>(map.entrySet());

        entry.sort(Map.Entry.comparingByValue());

        System.out.println("Sorting based on value using list ");
        for(Map.Entry<String, Integer> s: entry){
            System.out.println(s.getKey()+"->"+s.getValue());
        }

        entry.sort(Map.Entry.comparingByKey());

        System.out.println("Sorting based on key using list");
        for(Map.Entry<String, Integer> s: entry){
            System.out.println(s.getKey()+"->"+s.getValue());
        }

        TreeMap<String, Integer> tree = new TreeMap<>(map);

        System.out.println("Sorting using Tree map ");
        for (Map.Entry<String, Integer> e: tree.entrySet()){
            System.out.println(e.getKey()+"->"+e.getValue());
        }

        TreeMap<String, Integer> tree1 = new TreeMap<>(Comparator.reverseOrder());
        tree1.putAll(map);

        System.out.println("Reverse sort using tree map");
        for (Map.Entry<String, Integer> e: tree1.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((e1,e2)->e2.getKey().compareTo(e1.getKey()));
        System.out.println("Reverse sort by key using list");
        for (Map.Entry<String, Integer> e: list){
            System.out.println(e.getKey()+" "+e.getValue());
        }

        list.sort((e1,e2)->e2.getValue().compareTo(e1.getValue()));
        System.out.println("Reverse sort by value using list");
        for (Map.Entry<String, Integer> e: list){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
