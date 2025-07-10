package org.example.JavaTest;

class Parent{
    {
        System.out.println("IIB in parent");
    }
    public Parent(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    {
        System.out.println("IIB in child");
    }
    public Child(){
        System.out.println("Child");
    }
    public void print(){
        System.out.println("Child class method");
    }
}

public class ExecutionOrder {
    {
        System.out.println("IIB in main class");
    }
    public static void main(String[] args) {

        {
            System.out.println("IIB in main");
        }
        new Child().print();

        Integer i = 100;
        Integer j = 100;

        Integer a = 200;
        Integer b = 200;

        System.out.println(i==j);
        System.out.println(a==b);

    }
}
