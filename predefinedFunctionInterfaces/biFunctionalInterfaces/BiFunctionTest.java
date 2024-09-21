package java8Features.predefinedFunctionInterfaces.biFunctionalInterfaces;

import java.awt.print.PrinterGraphics;
import java.util.ArrayList;
import java.util.function.BiFunction;

class Employee{
    int eid;
    String ename;

    public Employee(int eid, String ename) {
        this.eid = eid;
        this.ename = ename;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                '}';
    }
}
public class BiFunctionTest {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> fn=(n1, n2)-> n1*n2;   // here first int is num1 , second is num1, and third
        // is return type
        System.out.println(fn.apply(10,20));


        // Q.2 ) create employee objects ans stores into arraylist

        // creating arrayList of employee
        ArrayList<Employee> list=new ArrayList<>();
        // here we are storing employee object using biFunction
        BiFunction<Integer,String,Employee> f=(empid,empname)->new Employee(empid,empname);

        // Calling apply method multiple time it will add new employee object into arrayList
        list.add(f.apply(100,"Govind"));
        list.add(f.apply(101,"Suresh"));
        list.add(f.apply(102,"Deepak"));
        list.add(f.apply(103,"Surya"));
        list.add(f.apply(104,"Kailsh"));
        list.add(f.apply(105,"Harivijay"));

        list.forEach(System.out::println);





    }
}
