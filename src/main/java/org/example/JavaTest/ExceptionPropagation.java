package org.example.JavaTest;


import java.io.IOException;

public class ExceptionPropagation {

    void m(){
        try {
            n();
        }
        catch (Exception e){
            System.out.println("No need of throws as exception is handled");
        }
    }
    void n() throws IOException {
        System.out.println("Need throws as exception is not handled");
        o();
    }
    void o() throws IOException {
        System.out.println("Need throws as exception is not handled");
        throw new IOException();
    }

    public static void main(String[] args) {
        ExceptionPropagation ex = new ExceptionPropagation();
        ex.m();

        ex.a();
    }

    void a(){
        b();
    }
    void b(){
        c();
    }
    void c(){
        throw new ArithmeticException();
    }
}
