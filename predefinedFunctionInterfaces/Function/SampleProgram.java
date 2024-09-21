package java8Features.predefinedFunctionInterfaces.Function;

import java.util.function.Function;

public class SampleProgram {
    public static void main(String[] args) {

        Function<String,Integer> ft=str->str.length();  // String is input type and Integer is return type
        System.out.println("Length of String is : "+ft.apply("govind"));
    }
}

