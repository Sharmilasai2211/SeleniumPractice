package org.example.JavaTest;

interface Drawable{
    public void draw();
}

public class WithOutLambdaExp {

    public static void main(String[] args) {

        Drawable d = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing");
            }
        };

        d.draw();
        System.out.println(d instanceof Drawable);
    }
}
