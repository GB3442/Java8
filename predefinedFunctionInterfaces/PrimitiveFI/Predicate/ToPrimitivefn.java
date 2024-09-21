package java8Features.predefinedFunctionInterfaces.PrimitiveFI.Predicate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class ToPrimitivefn {
    public static void main(String[] args) {
        List<String> ll=new ArrayList<>();
        ll.add("String");
        ll.add("Integer");

          // ========= ToIntFunction ==========
        ToIntFunction<String> tint=String::length;    // here String is input type but return type is always int

        for(String s:ll){
            System.out.println(tint.applyAsInt(s));
        }

        System.out.println();
        // ========= ToLongFunction ==========
        ToLongFunction<String> tnl=String::length;
        for(String s: ll){
            System.out.println(tnl.applyAsLong(s));
        }
        System.out.println();
        // ========= ToDoubleFunction ==========
        ToDoubleFunction<String> tnd=String::length;
        for(String s: ll){
            System.out.println(tnd.applyAsDouble(s));
        }

        // ====================  To premitive bi Function =============

        ToIntBiFunction<String,String> tibf=(s1,s2)->s1.length()+s2.length();
        System.out.println(tibf.applyAsInt("Tdit","Nit"));




    }
}
