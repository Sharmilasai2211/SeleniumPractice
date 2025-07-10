package org.example.JavaTest;

import java.util.Scanner;

class NameMismatchException extends Exception{

    public NameMismatchException(){
        super();
    }
    public NameMismatchException(String message){
        super(message);
    }
}

public class CustomExceptionEx {

    public static void main(String[] args) {

        String name = new Scanner(System.in).next();

        try{
            if(!name.equals("Sharmila")){
                throw new NameMismatchException("Name mismatch");
            }
            else {
                System.out.println(name);
            }
        }
        catch (NameMismatchException e){
            System.out.println(e.getMessage());
        }
    }
}
