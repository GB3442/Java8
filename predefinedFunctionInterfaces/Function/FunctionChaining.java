package java8Features.predefinedFunctionInterfaces.Function;

import java.util.function.Function;

/*
 Notes :  For performing function chaining we have 2 types
      1) andThen()  : here first function executed after second will execute.
      2) compose()  : here second function executed first and then first will execute.
 */
public class FunctionChaining {
    public static void main(String[] args) {
        // function 1
        Function<Integer,Integer> fn1= i->2*i;
        // function 2
        Function<Integer,Integer> fn2=i->i*i*i;

        System.out.println(fn1.andThen(fn2).apply(2));
        /*
        Here above we are performing function chaining..
        first fn1 is executed and on the result of fn1 , fn2 is executed.

        so if we pass 2 then first fn1 is execute and return 2*2 =4
        and then fn2 is executed i.e 4*4*4=64
        so final output will be 64
         */

        System.out.println(fn1.compose(fn2).apply(2));
        /*
          Here  second function is execute i.e 2*2*2=8
           and then first function will execute 2*8 = 16
         */

    }
}
