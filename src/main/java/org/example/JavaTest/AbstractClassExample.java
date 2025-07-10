package org.example.JavaTest;


abstract class Dummy{
    public Dummy(){
        System.out.println("parent");
    }

    abstract void test();
}

public class AbstractClassExample extends Dummy {

    int a=10;
    static int b = 20;

    {
        System.out.println(a+" "+b);
    }
//    static {
//        System.out.println(a+" "+b);
//    }

    public static void main(String[] args) {

        AbstractClassExample a = new AbstractClassExample();
        a.test();
    }

    @Override
    void test() {
        System.out.println("Child");
    }
}
