package org.example.JavaTest;

public class FuncInterfaceImplementation {
    public static void main(String[] args) {

        FuncInterfaceEx f = s-> {
            s = s+" sai";
            System.out.println(s);
        };
        f.test("Sharmila");

        MethodRefClass m = new MethodRefClass();
        FuncInterfaceEx f1 = m::print;
        f1.test("Sharmila");
    }
}
