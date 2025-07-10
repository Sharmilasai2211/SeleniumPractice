package org.example.JavaTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class StudentDemo {

    public static void main(String[] args) {

        List<Student> l = new ArrayList<>();
        l.add(new Student(1, "John", 20));
        l.add(new Student(2, "Jane", 21));
        l.add(new Student(3, "Doe", 22));

        Collections.sort(l, new NameComparator());

        ListIterator<Student> li = l.listIterator();

        while(li.hasPrevious()){
            System.out.println(li.previous().getName());
        }

        String s1 = "Sharmila";
        String s2 = new String("Sharmila");
        String s3 = "Sharmila";

        System.out.println(s2.compareTo(s3));
        System.out.println(s1==s3);

    }
}
