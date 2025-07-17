package org.example.JavaTest.CollectionTest;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        System.out.println(st.isEmpty());
        st.push(12);
        st.push(20);
        st.push(33);
        st.push(1);
        st.push(5);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());

        System.out.println(st.search(20));
    }
}
