package java8Features.predefinedFunctionInterfaces.Predicate;

import java.util.function.Predicate;

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

public class TestPredicate {
    public static void main(String[] args) {
        student[] std={
                new student(01,"govind"),
                new student(02,"Pradip"),
                new student(03,"dipika"),
                new student(04,"isha"),
                new student(05,"rani"),
                new student(06,"Pankaj"),
        };

        // Q. Display student information whose name length gretter than 5
        // create predicate
        Predicate<student> prd=str->str.name.length()>4;

        for(student s: std){
            if(prd.test(s)){
                System.out.println(s);
            }

        }

        // Q.2 ) Display student whose roll number is odd
        System.out.println("==================================");
        Predicate<student> prd1=std1->std1.sid%2==1;
        for(student s: std){
            if(prd1.test(s)){
                System.out.println(s);
            }

        }

    }
}
