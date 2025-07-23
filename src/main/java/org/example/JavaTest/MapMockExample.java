package org.example.JavaTest;

import org.jetbrains.annotations.NotNull;

import java.util.*;

class Employee implements Comparable<Employee>{
    String firstName, lastName;
    int age;

    public Employee(String lastName, String firstName, int age){
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    @Override
    public int compareTo(@NotNull Employee o) {
        return this.age>o.age?1:-1;
    }
}


public class MapMockExample {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Amit",24);
        map.put("Sumit", 16);
        map.put("Ram",18);
        float avg = 0.0f;

        for(Integer i:map.values()){
            avg+=i;
        }
        System.out.println(avg/map.size());

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Sharmila","sai",24));
        list.add(new Employee("Hridaya","sai",25));
        list.add(new Employee("pranu","k",20));

//        list.sort((e1,e2)->e1.age>e2.age?1:-1);
//        Collections.sort(list);
        list.sort(new AgeComparator());
        for (Employee e:list){
            System.out.println(e.age);
        }
    }
}

class AgeComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.age>o2.age?1:-1;
    }
}
