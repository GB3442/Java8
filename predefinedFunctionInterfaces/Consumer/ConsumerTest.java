package java8Features.predefinedFunctionInterfaces.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

class student{
    int id;
    String name;

    public student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class ConsumerTest {
    public static void main(String[] args) {
        List<student> studentList=new ArrayList<>();

        // here we are using consumer to add student into ArrayList
        Consumer<student>consumer= new ArrayList<student>()::add;

        // create student objects
        student s0=new student(01,"GB");
        student s1=new student(02,"KK");
        student s2=new student(03,"SJ");
        student s3=new student(04,"MJ");


        // here we are call consymer
        consumer.accept(s0);
        consumer.accept(s1);
        consumer.accept(s2);
        consumer.accept(s3);

        // displaying list items..
        System.out.println(studentList);



    }
}
