package org.example.JavaTest.CollectionTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTraversals {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Apple",5);
        map.put("Orange",3);
        map.put("Mango",7);

        // using entrySet in iterator
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();

        System.out.println("iterator using entry set");
        while(it.hasNext()){
            Map.Entry<String, Integer> e = it.next();
            System.out.println(e.getKey()+"->"+e.getValue());
        }

        Iterator<String> it1 = map.keySet().iterator();

        System.out.println("iterator using key set");
        while(it1.hasNext()){
            String e = it1.next();
            System.out.println(e+"->"+map.get(e));
        }

        Iterator<Integer> it2 = map.values().iterator();

        System.out.println("iterator using values");
        while(it2.hasNext()){
            System.out.println(it2.next());
        }

        System.out.println("iterating using for-each");
        map.forEach((k,v)-> System.out.println(k+"->"+v));

        System.out.println("iterating using stream");
        map.entrySet().stream().forEach(e-> System.out.println(e.getKey()+"->"+e.getValue()));

        System.out.println("iterating using enhanced-for loop");
        for(Map.Entry<String, Integer> m: map.entrySet()){
            System.out.println(m.getKey()+"->"+m.getValue());
        }
    }
}
