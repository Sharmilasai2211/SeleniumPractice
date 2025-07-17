package org.example.JavaTest;

import java.io.IOException;
import java.sql.SQLException;

class Dummy {
    void dummy() throws ArithmeticException{
        System.out.println("Checked exception");
    }
}
public class ExceptionHeirarchy extends Dummy {

    void dummy() {

    }
}
