package java8Features.predefinedFunctionInterfaces.Function;

import com.sun.javadoc.ProgramElementDoc;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

class student{
    int sid;
    String name;
    int marks;
    String res;

    public student(int sid, String name, int marks) {
        this.sid = sid;
        this.name = name;
        this.marks = marks;

    }

    @Override
    public String toString() {
        return "student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", result=" + res +
                '}';
    }
}
public class Program2 {
    public static void main(String[] args) {
        student[] strd={new student(1,"GB",85),
                new student(1,"YB",25),
                new student(2,"KK",95),
                new student(3,"SJ",65),
                new student(4,"JK",45),
                new student(5,"DK",55),
                new student(6,"TY",35),
        };

        Function<student,String> ft=st->{
            if(st.marks<35){
                st.res="Fail";
                return "Student Name : "+st.name+" Result : "+st.res;
            }
            else if(st.marks>35 && st.marks<75){
                st.res="Pass";
                return "Student Name : "+st.name+" Result : "+st.res;
            }
            else{
                st.res="FirstClass";
                return "Student Name : "+st.name+" Result : "+st.res;
            }
        };

        // here we re declaring predicate fucntion to check student based on our condition.
        Predicate<student> prd=i->i.marks<35;

        for(student s: strd){
            if(prd.test(s)){
                System.out.println(ft.apply(s));
            }

        }
    }
}
