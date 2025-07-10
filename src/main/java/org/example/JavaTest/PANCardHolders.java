package org.example.JavaTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PANCardHolders {

    public static void main(String[] args) {

        Map<Integer, Person> hm = new HashMap<>();

        hm.put(12345678, new Person("Sharmila",25,new Address("Hyderabad","TS","India")));
        hm.put(23354352, new Person("Ram",53,new Address("Udaypur","RJ","India")));

        Set<Map.Entry<Integer, Person>> entry = hm.entrySet();

        for(Map.Entry<Integer, Person> e: entry){
            System.out.println("PAN card number of "+e.getValue().getName()+" is: "+e.getKey());
        }
    }
}
