package org.example.JavaTest;

import java.util.*;

public class CodingPractice {

    public static void main(String[] args) {

        /*****************Count of each character in a string******************/
        String word = "kafjskjsdkfndnverehkfj"; // k f j s n e d
        Map<Character, Integer> map = new HashMap<>();
        for(Character c: word.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character, Integer> m: map.entrySet()){
            if(m.getValue()>1){
                System.out.println(m.getKey());
            }
        }
        /***************Repetitive words in a list****************/
        List<String> list = new ArrayList<>(Arrays.asList("sharmi", "pranu","hridaya","sharmi","sharmila"));
        //1st way
        List<String> tempList = new ArrayList<>();

        for(String name: list){
            if(!tempList.contains(name)){
                int count = 0;
                for(String temp:list){
                    if(temp.equals(name)){
                        count++;
                    }
                }
                tempList.add(name);
                System.out.println(name+"->"+count);
            }
        }
        // 2nd way
        HashMap<String, Integer> names = new HashMap<>();
        for(String name:list){
            names.put(name, names.getOrDefault(name,0)+1);
        }

        for(Map.Entry<String, Integer> entry: names.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }

        /****************Calculate average age of persons in a Map object*****************/
        Map<String, Integer> tempMap = new HashMap<>();
        tempMap.put("Amit", 24);
        tempMap.put("Sumit", 16);
        tempMap.put("Ram", 18);

        float totalAge=0;
        for(Integer i:tempMap.values()){
            totalAge+=i;
        }

        System.out.println("Average age of persons: "+totalAge/tempMap.size());

        /********************Anagrams******************/
        String str1 = "listen";
        String str2 = "silent";

        HashMap<Character,Integer> countStr1 = new HashMap<>();
        HashMap<Character, Integer> countStr2 = new HashMap<>();

        for(Character c:str1.toCharArray()){
            countStr1.put(c, countStr1.getOrDefault(c,0)+1);
        }

        for(Character c:str2.toCharArray()){
            countStr2.put(c, countStr2.getOrDefault(c,0)+1);
        }

        if(countStr1.equals(countStr2)){
            System.out.println("Both strings are anagrams!");
        }
        else{
            System.out.println("Not anagrams");
        }

        /*****************Fibanocci series******************/
        int a = 0, b=1;
        int n=7;
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            int temp = a+b;
            a=b;
            b=temp;
        }
        System.out.println();
        //prints each fibanocci number by looping
        for(int i=0;i<n;i++)
            System.out.print(fib(i)+" ");

        System.out.println();
        // prints the last fibanocci number directly
        System.out.print(fib(n));

        /*********************Non-repeated character in a string***********************/
        String name = "Sai SharmilA HRM ";
        Map<Character, Integer> charCount = new LinkedHashMap<>();


    }

    public static int fib(int n){
        if(n<=1) return n;

        return fib(n-1)+fib(n-2);
    }
}
