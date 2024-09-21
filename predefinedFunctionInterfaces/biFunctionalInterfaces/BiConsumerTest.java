package java8Features.predefinedFunctionInterfaces.biFunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
// crating new class EMployee
class employee{
    int eid;
    String name;

    public employee(int eid, String name) {
        this.eid = eid;
        this.name = name;
    }

    @Override
    public String toString() {
        return "employee{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                '}';
    }
}
//creating new class student
class student{
    int sid;
    String name;

    public student(int sid, String name) {
        this.sid = sid;
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                '}';
    }
}
public class BiConsumerTest {
    public static void main(String[] args) {
        List<employee>emplist=Arrays.asList(new employee(01,"gb"),new employee(02,"Kk"));
        List<student>studentlist=Arrays.asList(new student(01,"Yash"),new student(02,"Dinesh"));

        // here creating BiConsumer for displaying data of two list i.e emp and student
        BiConsumer<employee,student> Bconsumer=(emp,std)->{

            System.out.println("Employee Role Number : "+emp.eid);
            System.out.println("Employee Name : "+emp.name);

            System.out.println();
            System.out.println("Student Role Number : "+std.sid);
            System.out.println("Student Name : "+std.name);

        };

        for(int i=0;i<emplist.size() || i< studentlist.size();i++){
            Bconsumer.accept(emplist.get(i),studentlist.get(i));
            System.out.println();
        }

    }

}
