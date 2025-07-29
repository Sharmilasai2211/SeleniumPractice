package org.example.JavaTest;

class PersonTest {
    private static int empId;
    private String name;
    static{
        empId++;
    }
    public PersonTest(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("The employee id for "+ name +" is "+ empId);
    }
}

public class MainTest {
    private static int test() {
        int i = 0;
        try {
            i++;
            throw new NullPointerException();
        } catch (NullPointerException ex) {
            return i++;
        }
        finally {
            return ++i;
        }
    }
    public static void main(String[] args) {
        PersonTest person1 = new PersonTest("Kamal");
        person1.display();
        PersonTest person2 = new PersonTest("Karan");
        person2.display();
        person1 = new PersonTest("John");
        person1.display();

        System.out.println(test());
    }
}
