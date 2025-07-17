package org.example.JavaTest.CollectionTest;

import java.util.*;
import java.util.function.Predicate;

public class JavaCollectionEx {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(5);
        System.out.println(set);

        Collections.addAll(set,10,11,12,13,14);
        System.out.println(set);
        int size = set.size();
        System.out.println(size);
        System.out.println(set.contains(5));

        Iterator<Integer> i = set.iterator();
        while (i.hasNext())
            System.out.println(i.next());

        System.out.println(set.isEmpty());

        System.out.println(set.remove(13));


        ArrayList<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(2);
        a.add(14);
        set.retainAll(a);
        System.out.println(set);

        a.add(30);
        System.out.println(a);
        Integer in = 30;
        a.remove(in);
        System.out.println(a);

        List<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(15);
        l.add(5);
        a.removeAll(l);
        System.out.println(a);

        Predicate<Integer> pr = ele ->ele%5==0;
        l.removeIf(pr);
        System.out.println(l);

        System.out.println(l.toArray());

        System.out.println(l.hashCode());

        System.out.println(l.equals(set));

        System.out.println(set.containsAll(a));

    }
}
