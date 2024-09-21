package java8Features.predefinedFunctionInterfaces.PrimitiveFI.Predicate;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

/*
 Q.1 ) why we use IntPredicate if we have already Predicate is there ?
  ans : In predicate it accept wrapper data i.e Integer so every time compiler perform autoboxing and auto unboxing
        so it will leads to performance issue. To solve this issue SUN given as inbuilt functional interface to deals
        with only int type date i.e IntPredicate.

        @functionalInterface
        public interface IntPredicate{
           public boolean test(int i);
          }
 */
public class PrimitivePredicateTest {
    public static void main(String[] args) {
        int[] arr={10,20,30,45,25,15,22,20,05};
        // primitive Int predicate
        IntPredicate p= i->i%2==0;

        for(int i:arr){
            //System.out.println(i+" is even : "+p.test(i));
            if(p.test(i)){
                System.out.println(i);
            }
        }

        // here no need of peforming autoboxing. becoz test() of IntPredicate takes int as input parameter

        /* just like IntPredicate we have lot of premitive interface

        1) DoublePredicate
        2) LongPredicate
        3) IntPredicate

         */

    }
}
