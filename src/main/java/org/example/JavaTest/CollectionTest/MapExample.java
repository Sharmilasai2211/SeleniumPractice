package org.example.JavaTest.CollectionTest;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Employee{
    int empId;
    String address;
    int salary;
    public Employee(int empId, String address, int salary){
        this.empId = empId;
        this.address = address;
        this.salary = salary;
    }
    public int getEmpId(){
        return empId;
    }
    public String getAddress(){
        return address;
    }
    public int getSalary() {
        return salary;
    }

}

public class MapExample {

    public static void main(String[] args) {

        HashMap<Employee, String> hm = new HashMap<>();
        hm.put(new Employee(1, "Hyderabad", 15000), "Sharmila");
        hm.put(new Employee(2, "Delhi", 19000), "Praveen");
        hm.put(new Employee(3, "Pune", 18000), "Priya");

        Set<Map.Entry<Employee, String>> e = hm.entrySet();

        for(Map.Entry<Employee,String> e1 : e){
            Employee emp = e1.getKey();
            System.out.println(emp.getEmpId()+" "+emp.getAddress()+" "+emp.getSalary()+" "+e1.getValue());
        }
        Map<Employee, String> map = Collections.synchronizedMap(hm);
    }
}
