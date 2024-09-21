package java8Features.predefinedFunctionInterfaces.PrimitiveFI.Predicate;

import java.util.function.*;

public class PremitiveFunctionTest {
    public static void main(String[] args) {
        int[] arr={2,4,5,6,7,8,9};
        IntFunction<Integer> intfn = i->i*i;

        for(int i: arr){
            System.out.println(intfn.apply(i));
        }

        //It takes only int value as input but it return Any value as return type

        /*
              @functionalInterface
              public interface IntFunction<R>{
              public R apply(int a);
              }
         */

        // just like IntFunction we have another primitive functions
        // 1) IntFunction
        //2) LongFunction
        //3) DoubleFunction


        /*
          If our programming requiremnt is to take only int as input and after performing operation it return
           double the it give IntToDoubleFunction and many more.
           => IntToDouble   -> input type int and return type double
           => DoubleToInt   -> input type double and return int
           =>LongToInt      -> input type Long and return type int
           => LongToDouble
           => IntToLong
           => DoubleToLong
         */

      IntToLongFunction itlfn=i->i*i;
        System.out.println(itlfn.applyAsLong(25));

    }
}
