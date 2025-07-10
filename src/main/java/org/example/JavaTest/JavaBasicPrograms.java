package org.example.JavaTest;

//import org.bouncycastle.math.ec.ScaleXNegateYPointMap;

import java.io.IOException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaBasicPrograms {
    public static void main(String[] args) {
        /*****************Count of each character in a string******************/
//                String s = "fazulullA shArmila PravEen";
//                s = s.toLowerCase();
//                Map<Character,Integer> m = new LinkedHashMap<>();
//                for(int i=0; i<s.length(); i++){
//                    if(s.charAt(i)==' '){
//                        continue;
//                    }
//                    else if(m.containsKey(s.charAt(i)))
//                    {
//                        m.put(s.charAt(i),m.get(s.charAt(i))+1);
//                    }
//                    else{
//                        m.put(s.charAt(i),1);
//                    }
//                }
//                for(Map.Entry<Character, Integer> e: m.entrySet()){
//                    System.out.println(e.getKey()+":"+e.getValue());
//                }
        /*****************Count of each character in a string modified format******************/
//        String str = "fazululla";
//        HashMap<Character, Integer> charCount = new HashMap<>();
//
//        for(char c : str.toCharArray()) {
//        if(c == ' '){
//            continue;
//        }
//            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
//        }
//
//        for(char c : charCount.keySet()) {
//            System.out.println(c + "=" + charCount.get(c));
//        }
        /*****************Removing duplicates in a string using LinkedHashSet******************/
//        String str = "Sharmila sai";
//        LinkedHashSet<Character> set = new LinkedHashSet<>();
//        for(char c: str.toCharArray()){
//            if(c == ' '){
//                continue;
//            }
//            set.add(c);
//        }
//        for(char c: set){
//            System.out.println(c);
//        }
        /*******************Anagram logic without case in-sensitive, but won't work 'did' or 'die' scenarios *****************/
//        String a1 = "did";
//        String a2 ="die";
//        if(a1.length()==a2.length()){
//            for(char c: a1.toCharArray()){
//                if(a2.indexOf(c)!=-1) {
//                    continue;
//                }
//                System.out.println(a1+" and "+a2+" not an Anagram!!");
//                break;
//            }
//            System.out.println(a1+" and "+a2+" are anagrams!!");
//        }
//        else{
//            System.out.println(a1+ " and "+a2+" are not of same length");
//        }
        /*********************Anagram logic with case-sensitive using HashMap**************/
//        String s1 = "did";
//        String s2 ="die";
//        if(s1.length()==s2.length()){
//            HashMap<Character, Integer> mapString1 = new HashMap<>();
//            HashMap<Character, Integer> mapString2 = new HashMap<>();
//            for(char c: s1.toCharArray()){
//                c = Character.toLowerCase(c);
//                mapString1.put(c,mapString1.getOrDefault(c, 0)+1);
//            }
//            for(char c: s2.toCharArray()){
//                c = Character.toLowerCase(c);
//                mapString2.put(c,mapString2.getOrDefault(c, 0)+1);
//            }
//            if(mapString1.equals(mapString2)){
//                System.out.println(s1+" and "+s2+" are anagrams!!");
//            }
//            else {
//                System.out.println(s1+" and "+s2+" are not Anagrams!!");
//            }
//        }
//        else{
//            System.out.println(s1+ " and "+s2+" are not of same length");
//        }
        /********************Anagram logic using flags, but won't work 'did' or 'die' scenarios*************/
//        String z1 = "did";
//        String z2 = "EId";
//
//        if(z1.length() == z2.length()){
//
//            boolean isAnagram = true;
//            for(char c: z1.toCharArray()){
//                char x = Character.toLowerCase(c);
//                boolean isPresent = false;
//                for(char k: z2.toCharArray()){
//                    if(x == Character.toLowerCase(k)){
//                        isPresent = true;
//                        break;
//                    }
//                }
//                if(!isPresent) {
//                    System.out.println(z1+" and "+z2+" not an Anagram!!");
//                    isAnagram = false;
//                    break;
//                }
//            }
//            if(isAnagram){
//                System.out.println(z1+" and "+z2+" are anagrams!!");
//            }
//            else{
//                System.out.println("Not an Anagram!!");
//            }
//        }
//        else {
//            System.out.println("Strings are not of same length!!");
//        }
        /*********************Non-repeated character in a string***********************/
//        String name = "Sai SharmilA HRM ";
//        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
//        for(char ch: name.toCharArray()){
//            if(ch != ' ') {
//                char c = Character.toLowerCase(ch);
//                map.put(c, map.getOrDefault(c, 0)+1);
//            }
//        }
//        boolean flag=false;
//        for(char c: map.keySet()){
//            if(map.get(c)==1) {
//                flag=true;
//            }
//            if(flag){
//                System.out.println("Non-repeated character: "+c);
//            }
//        }
//        if(!flag){
//            System.out.println("All characters are repeated in the string");
//        }
        /**********************String contains only digits*********************/
//        String digit = "1382146b82364";
//        if(digit.matches("^[0-9]$"))
//            System.out.println("Only digits");
//        else
//            System.out.println("Contains characters");
//
//        boolean flag=true;
//        for(char c: digit.toCharArray()){
//            int ascii = (int) c;
//            if(ascii >= 45 && ascii <=57){
//                continue;
//            }
//            flag=false;
//            break;
//        }
//        if(flag)
//            System.out.println("Only digits!!");
//        else
//            System.out.println("Contains characters");
        /*******************Count vowels and consonants with basic logic*****************/
//        String letters = "HKAJFSHJINS*&*@^$*&JKNDJSewo*&^@$*&$pdjafnjk";
//        int vowel = 0, consonant = 0, characters = 0;
//        ArrayList<Character> vowels = new ArrayList<>(List.of('a', 'e', 'i', 'o', 'u'));
//        for(char c: letters.toCharArray()){
//            if((c >=65 && c <=90) || (c >=97 && c <= 122)){
//                if (vowels.contains(Character.toLowerCase(c)))
//                    vowel++;
//                else
//                    consonant++;
//            }
//            else
//                characters++;
//        }
//        System.out.println("Vowel: "+vowel+" Consonant: "+consonant+" Other characters: "+characters);

        /************************Check if a string is a rotation of anotehr string***************/
//        Scanner sc = new Scanner(System.in);
//        String first = sc.next();
//        String second = sc.next();
//
//        String third = first+first;
//        if(third.toLowerCase().contains(second.toLowerCase())){
//            System.out.println("rotation string");
//        }
//        else{
//            System.out.println("Not a rotation string");
//        }
        /************************Longest word in a sentence*********************/
//        String sentence = "This statement have                            many words ifhishfnshnfiksljncfkshnf but our target is to find the longest word";
//        String[] words = sentence.split(" ");
//        String longest = words[0];
//        int length=words[0].length();
//        for(int i=1; i<words.length;i++){
//            if(words[i].length()>length){
//                length=words[i].length();
//                longest= words[i];
//            }
//            else
//                continue;
//        }
//        System.out.println("Longest word: "+longest+" which is of length: "+length);
        /**************************String to title case***********************/
//        String line = "this IS a sentence, which Contains WoRdS!!";
//
//        String titleCase = Arrays.stream(line.split(" "))
//                .map(word->word.length()>0 ? word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase():word).collect(Collectors.joining(" "));
//        System.out.println(titleCase);
//
//        boolean flag=true;
//        StringBuilder sb = new StringBuilder();
//        for (Character c: line.toCharArray()) {
//            if (Character.isSpaceChar(c)) {
//                flag = true;
//                sb.append(c);
//            }
//            else if(flag){
//                sb.append(Character.toUpperCase(c));
//                flag = false;
//            }
//            else{
//                sb.append(Character.toLowerCase(c));
//                flag = false;
//            }
//        }
//        System.out.println(sb);

        /******************Palindrome - Number***********************/
//        int digit = 12321;
//        int reverse = 0;
//        int tempNum = digit;
//
//        while(tempNum!=0){
//            int temp = tempNum %10;
//            reverse = reverse *10 + temp;
//            tempNum = tempNum/10;
//        }
//        if(digit==reverse){
//            System.out.println("Palindrome");
//        }
//        else{
//            System.out.println("Not a palindrome");
//        }
        /******************Palindrome - String***********************/
//        String name = "madam";
//
//        int left = 0;
//        int right = name.length()-1;
//        boolean palindrome=true;
//
//        while(left<right){
//            if(name.charAt(left)!=name.charAt(right)){
//                palindrome=false;
//                break;
//            }
//            left++;
//            right--;
//        }
//        if(palindrome){
//            System.out.println("Palindrome");
//        }
//        else{
//            System.out.println("Not a palindrome");
//        }
        /**************************Character count using streams****************************/
//        String input = "Sharmila is a test Engineer";
//        input.toLowerCase();
//
//        input.chars()
//                .mapToObj(c -> {
//                    char ch = (char) c;
//                    return Character.toLowerCase(ch);
//                }
//                )
//                .filter(n->!Character.isSpaceChar(n))
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .forEach((ch,c)->System.out.println(ch+" "+c));
        /*******************Fibanocci series*************************/
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//
//        List<Integer> l = new ArrayList<>();
//        l.add(0); l.add(1);
//        for(int i=2; i<N; i++){
//            l.add(l.get(i-1)+l.get(i-2));
//        }
//        l.forEach(System.out::println);

//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//
//        int a=0, b=1;
//        int output=0;
//        for(int i=2; i<N; i++){
//            output=a+b;
//            a=b;
//            b=output;
//        }
//        System.out.println("output: "+output);
        /************************Matrix flow**********************/
        /**********Input: {{0, 3, 6},{1,4,7}, {2, 5, 8}}***********/
//        Scanner sc = new Scanner(System.in);
//        int row = sc.nextInt();
//        int col = sc.nextInt();
//
//        int[][] matrix = new int[row][col];
//
//        for(int i=0;i<row;i++){
//            for (int j=0;j<col;j++){
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//
//        for(int i=0;i<col;i++){
//            if(i%2==0) {
//                for (int j = 0; j < row; j++) {
//                    System.out.print(matrix[j][i]);
//                }
//                System.out.println();
//            }
//            else{
//                for (int j = row-1; j>=0; j--) {
//                    System.out.print(matrix[j][i]);
//                }
//                System.out.println();
//            }
//        }
        /****************************Print first and last occurance of an element in an array*********************/
//        int[] nums = {2, 1,1,2,3,2,5, 2, 3, 1, 2};
//        int targetEle = 2;
//
//        int firstIndex=-1, lastIndex=-1;
//        boolean flag=false;
//        for(int i=0; i<nums.length;i++){
//            if(nums[i]==targetEle){
//                if(!flag) {
//                    flag = true;
//                    firstIndex = i;
//                }
//                else {
//                    lastIndex = i;
//                }
//            }
//        }
//        System.out.println("Element "+targetEle+" first occurance: "+firstIndex+" and last occurance: "+lastIndex);
        /******************Reverse an array without an extra space**********************/
//        int[] arr = {1,2,4,5,6};   //odd
////        int[] arr = {1,2,3,4,5,6};  //even
//
//        Arrays.stream(arr).forEach(System.out::print);
//        System.out.println();
//        int i=0, j=arr.length-1;
//        while (i<j){
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//            i++;
//            j--;
//        }
//        Arrays.stream(arr).forEach(System.out::print);
        /************Program to prove strings are immutable*********************/
//        String input = "Sharmila";
//        String target = input;
//        System.out.println(input.hashCode()); //Hashcode calculated acc to content
//
//        input = input + "sai";
//        System.out.println(input.hashCode());
//
//        System.out.println(input==target); //== compares the reference instead of contents
        /**********************Toggle the case of every character in string****************/
//        String input = "apPLe iS a Fru!T";
//        StringBuilder s = new StringBuilder();
//        for(char c:input.toCharArray()){
//            if(Character.isLowerCase(c)){
//                s.append(Character.toUpperCase(c));
//            } else if (Character.isUpperCase(c)){
//                s.append(Character.toLowerCase(c));
//            }
//            else
//                s.append(c);
//        }
//        System.out.println(s);
        /***************String with numerics, remove spaces, verify if palindrome**************/
//        String input = "2 Race e Ac!e R# 2";
//        StringBuilder s = new StringBuilder();
//
//        if(!input.isEmpty()) {
//            for (char c : input.toCharArray()) {
//                if ((c >= 'a' && c <= 'z') || (c >= '1' && c <= '9'))
//                    s.append(c);
//                else if (c >= 'A' && c <= 'Z')
//                    s.append(Character.toLowerCase(c));
//            }
//        }
//        else
//            System.out.println("String is empty");
//
//        String s1 = String.valueOf(s.reverse());
//        if(s.equals(s1)){
//            System.out.println("Palindrome");
//        }
//        else
//            System.out.println("Not a palindrome");
        /***********************All permutations of a string***********************/
//        String input = "abc";
//        permute(input, "");
        /****************** Convert string number to integer without Integer.parseInt() **************/
//        String s = "1234";
//        int num = 0;
//        System.out.println(Integer.parseInt(s));
//
//        for(char c: s.toCharArray()){
//            num = num*10 + (c - '0');
//        }
//        System.out.println(num);
        /************************** Frequency of words in a snetence *******************/
//        String input = "Sharmila a is of sharmila is are of to this of it are it";
//
//        HashMap<String, Integer> hm = new HashMap<>();
//
//        for(String s: input.split(" ")){
//            hm.put(s.toLowerCase(), hm.getOrDefault(s.toLowerCase(), 0)+1);
//        }
//
//        for(String e: hm.keySet()){
//            if(hm.get(e)==1){
//                System.out.println(e);
//            }
//        }
        /************************ Convert string to char[] without .toCharArray() ********************/
//        String s = "My name is sharmila";
//        char[] c = s.toCharArray();
//        System.out.println(c);
//
//        char[] c1 = new char[s.length()];
//        for(int i=0;i<s.length();i++){
//            c1[i] = s.charAt(i);
//        }
//        System.out.println(c1);
        /************************* Remove all non-aplhabetic chars ***********************/
//        String input = "Two is 2!! Three# is 3&* @(q1";
//        StringBuilder output= new StringBuilder();
//        for(char c : input.toCharArray()){
//            if((c >= 'a' && c<='z') || (c >= 'A' && c<='Z')){
//                output.append(c);
//            }
//        }
//        System.out.println(output);
        /************************* lower case to upper case without using toUpperCase() *****************/
//        String lower = "sharmila is a name";
//        StringBuilder upper = new StringBuilder();
//        for(char c: lower.toCharArray()){
//            upper.append((c>='a'&& c<='z')?(char) (c-32):c);
//        }
//        System.out.println(upper);
//
        /************************* upper case to lower case without using toUpperCase() *****************/
//        String lower1 = "SHARMILA IS A NAME";
//        StringBuilder upper1 = new StringBuilder();
//        for(char c: lower1.toCharArray()){
//            upper1.append((c>='A'&& c<='Z')?(char) (c+32):c);
//        }
//        System.out.println(upper1);
        /***************Reverse the words in a sentence - all char in lower case ****************/
//        String input = "Welcome to Keyloop";
//        StringBuilder sb = new StringBuilder();
//
//        String[] words = input.split(" ");
//
//        for(String s: words) {
//            for (int i = s.length() - 1; i >= 0; i--) {
//                sb.append(Character.toLowerCase(s.charAt(i)));
//            }
//            sb.append(" ");
//        }
//        System.out.println(sb);
        /************************ Armstrong number *******************/
//        int number = 153;
//        int output=0;
//
//        while (number!=0){
//            int temp = number % 10;
//            output = output + (temp * temp * temp);
//            number = number /10;
//        }
//
//        System.out.println(output);

        /************************** Factorial of a number *******************/
//        int num = 5;
//        int res = 1;
//
//        for(int i=num; i>0; i--){
//            res = res * i;
//        }
//        System.out.println(res);

        /*********************** Expression: 1-x+x2/2!-x3/3!....xn/n! *******************/
//        int n = 4;
//        int x = 2;
//        double res = 0.0;
//        for(int i=0;i<=n;i++){
//            if(i%2==0) {
//                res += pow(x, i) / fact(i);
//            }
//            else {
//                res -= pow(x, i) / fact(i);
//            }
//        }
//        System.out.println(res);
        /************** Prime number ******************/
//        int num = new Scanner(System.in).nextInt();
//        int count = 0;
//        if(num<=1){
//            System.out.println("Not prime");
//            return;
//        }
//        for(int i=2; i<num/2; i++){
//            if(num%i==0)
//                count++;
//        }
//        if(count>1){
//            System.out.println("Not prime");
//        }
//        else {
//            System.out.println("Prime");
//        }
        /********************** Greatest of all 3 nums ****************/
//        int num1 = 1, num2 = 5, num3 = 4;
//        int greatest = num1>num2?((num1>num3)?num1:num3):((num2>num3)?num2:num3);
//        System.out.println(greatest);
        /********************** SUm of digits *********************/
//        int num = 1543;
//        int sum = 0, count =0;
//        while(num!=0){
//            int rem = num % 10;
//            sum += rem;
//            count++;
//            num = num/10;
//        }
//        System.out.println(sum);
//        System.out.println(count);
        /********************* Remove space from string *********************/
//        String input = "Sharmila              is my name";
//        System.out.println(input.replaceAll(" ",""));
        /********************* Finding common elements in array *****************/
//        Integer[] a1 = {1,2,3,4,5};
//        Integer[] a2 = {3,4,5,6};
//        List<Integer> l = new ArrayList<>();
//        for (Integer integer : a1) {
//            for (Integer value : a2) {
//                if (integer.equals(value))
//                    l.add(integer);
//            }
//        }
//        System.out.println(l);
//
//        List<Integer> l1 = new ArrayList<>(Arrays.asList(a1));
//        List<Integer> l2 = new ArrayList<>(Arrays.asList(a2));
//        List<Integer> l3 = new ArrayList<>(l1);
//        l1.retainAll(l2);
//        System.out.println(l1);
//
//        l3.stream().filter(l2::contains).collect(Collectors.toList()).forEach(System.out::println);
        /********************Find second-largest and second-smallest numbers *************************/
//        int[] nums = {12, 4, 14, 53, 87, 9};
//        Arrays.sort(nums);
//        System.out.println(nums[1]+" "+nums[nums.length-2]);
        /********************** Reverse the entire sequence ********************/
//        String input = "India is country my";
//        String[] words = input.split(" ");
//        StringBuilder sb = new StringBuilder();
//        for(int i=words.length-1; i>=0; i--){
//            sb.append(words[i]).append(" ");
//        }
//        System.out.println(sb);
        /************************ Seperate alphanumericcharacters from a string ****************/
//        String input = "APlhabet12345678!@#$%^&*(Char97987%$^%$";
//        StringBuilder nums = new StringBuilder(), alpha = new StringBuilder(), spcl = new StringBuilder();
//        for(char c:input.toCharArray()){
//            if(Character.isDigit(c))
//                nums.append(c);
//            else if (Character.isAlphabetic(c)) {
//                alpha.append(c);
//            }
//            else
//                spcl.append(c);
//        }
//        System.out.println(nums+" "+alpha+" "+spcl);

        /******************************* Find common prefix in array of strings *****************/
//        String[] str = {"flower", "flow", "floght"};
//        String prefix = str[0];
//
//        for(String s: str){
//            while (!s.startsWith(prefix)){
//                prefix = prefix.substring(0, prefix.length()-1);
//            }
//        }
//        System.out.println(prefix);
        /************************ Perform subString() without using contains/substring methods ********************/
//        String input = "Hello world";
//        String word = "word";
//
//        if(input.indexOf(word)!=-1)
//            System.out.println("sub string");
//        else
//            System.out.println("Not a sub string");
        /************ Print all non-repeated characters in a string without using Hashmap ***********/
//        String input = "Hello world";
//
//        for(char c: input.toCharArray()){
//            if(input.indexOf(c)==input.lastIndexOf(c)){
//                System.out.print(c);
//                System.out.print(" ");
//            }
//        }
//        System.out.println();
//        for (char c: input.toCharArray()){
//            int count=0;
//            for(char c1: input.substring(input.indexOf(c)+1).toCharArray()){
//                if(c==c1){
//                    count++;
//                }
//            }
//            if(count==0){
//                System.out.print(c);
//                System.out.print(" ");
//            }
//        }
        /********************* Find mistakes in below code *******************/
        /** package name should not have hyphen -
         * class name is not as per standards
         * main method is not public
         * String[] should not have size
         * no ; at the end of line
         **/
//        package com.digitalocean.programming-interviews;
//
//        public class String Programs {
//
//            static void main(String[10] args) {
//                String s = "abc"
//                System.out.println(s);
//            }
//        }
        /**************** All the even numbers that exist in the list using Stream functions **************/
//        List<Integer> l = new ArrayList<>(Arrays.asList(1,2,3,4,5,67,8,9,0));
//
//        List<Integer> l1 = l.stream().filter(i->i%2==0).collect(Collectors.toList());
//        System.out.println(l1);
//
//        l.stream().filter(i->i%2==0).collect(Collectors.toList()).forEach(System.out::println);

        /********************** Reverse words in a string with camel case ******************/
        String input = "Welcome To Java";

        String[] words = input.split(" ");

        StringBuilder b = new StringBuilder();

        for(String s: words){
            b.append(s.substring(s.length()-1).toUpperCase());
            b.append(new StringBuilder(s.substring(0, s.length()-1).toLowerCase()).reverse());
            b.append(" ");
        }
        System.out.println(b);
    }

//    public static double pow(int x, int i){
//        int result = 1;
//        for(int j=i; j>=1; j--){
//            if(i==0){
//                result *= 1;
//            }
//            result *= x;
//        }
//        return result;
////        if(i==1){
////            return x;
////        }
////        else if(i==0){
////            return 1;
////        }
////        return x*pow(x, i-1);
//    }
//    public static double fact(int n){
//        int result = 0;
//        for(int i=n; i>=0; i--){
//            result += i;
//        }
//        return result;
////        if(n==1 || n==0){
////            return 1;
////        }
////        else {
////            return n*fact(n-1);
////        }
//    }

//    public static void permute(String s, String r){
//        if(s.isEmpty()){
//            System.out.println(r);
//            return;
//        }
//        for (int i=0; i<s.length(); i++){
////            System.out.println(s);
//            permute(s.substring(0, i)+s.substring(i+1), r+s.charAt(i));
//        }
//    }
}
