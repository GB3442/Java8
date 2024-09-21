package java8Features.LambaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    int sid;
    String name;
    double fees;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public Student(int sid, String name, double fees) {
        this.sid = sid;
        this.name = name;
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", fees=" + fees +
                '}';
    }
}


interface lambda{
    public List<Student> getAllStudents();
}

public class BasicLambda {

    // THis is a normal function / method
    public List<Student> getAllStudents(){

        List<Student> list=new ArrayList<>();
        list.add(new Student(01,"GB",2500.0));
        list.add(new Student(02,"KK",4500.0));
        list.add(new Student(03,"SJ",5500.0));
        list.add(new Student(04,"KK",9500.0));

       return list;
    }



    public static void main(String[] args) {

           // this is caling normal function
            BasicLambda obj=new BasicLambda();
            obj.getAllStudents().forEach(System.out::println);


        System.out.println("=======================================================");

            // here we are creating Lambda function
        lambda l=()->{
            List<Student> list=new ArrayList<>();
            list.add(new Student(01,"GB",2500.0));
            list.add(new Student(02,"KK",4500.0));
            list.add(new Student(03,"SJ",5500.0));
            list.add(new Student(04,"KK",9500.0));

            return list;
        };

        // here we are going to call lambda function
       l.getAllStudents().forEach(System.out::println);

    }
}
