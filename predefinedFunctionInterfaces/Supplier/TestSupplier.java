package java8Features.predefinedFunctionInterfaces.Supplier;

import java.util.Date;
import java.util.Random;
import java.util.function.Supplier;

/*
 Q.1 ) What is Supplier ?
 ans :- Supplier is an functional interface which is used to supply a object.
        It does not any Input parameter but it return something.
        or in other word just supply my required object and not return anything.

        syntax:
        interface Supplier<R>{
           public R get();
        }
 */
public class TestSupplier {
    public static void main(String[] args) {

        Supplier<Date> supplier=()-> new Date();
        System.out.println("Current Date is : "+supplier.get());


        Supplier<Integer> getOTP=()->new Random().nextInt(1000000);
        System.out.println("OTP : "+getOTP.get());
    }
}
