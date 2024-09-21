package java8Features.predefinedFunctionInterfaces.biFunctionalInterfaces;

import java.util.function.BiPredicate;

public class biPredicateTest {
    public static void main(String[] args) {

        BiPredicate<Integer,Integer> pred=(i1,i2)->i1<i2;
        System.out.println(pred.test(10,20));       // true




    }
}
