package org.example.JavaTest;

import java.lang.reflect.InvocationTargetException;

class A implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ObjectCreation {

    public static void main(String[] args) throws CloneNotSupportedException, InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {

        A a = new A();

        Class<?> c = Class.forName("A");
        A a1 = (A) c.getDeclaredConstructor().newInstance();

        A a2 = (A) a.clone();

    }
}
