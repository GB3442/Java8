package java8Features.PracticePrograms;

import java.util.function.*;

public class FunctionTest {

//    public static int getSqure(int number){             // This is general way to write a function.
//        return number*number;
//    }


    public static void main(String[] args) {
        // System.out.println("Square of 4 is : "+getSqure(4));

        // this is by using java 8
        Function<Integer,Integer>f1=i->i*i*i;
        System.out.println(f1.apply(4));

        IntFunction<Integer> f2=i->i*2;
        System.out.println(f2.apply(2));

        ToIntFunction<Integer> f= i->i*i;
        System.out.println("Square of 4 is : "+f.applyAsInt(4));

        UnaryOperator<Integer> u=i->i*i;
        System.out.println(u.apply(1));

        // we can write a code to check number is even or odd using java8
        Predicate<Integer> p=i->i%2==0;
        System.out.println("5 is even number ? : "+p.test(5));


    }
}
