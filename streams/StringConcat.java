package java8Features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringConcat {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("raj","rani","rajesh","brijesh","ajay","Sarvodaya","Digambar");

       String joiningString= list.stream().collect(Collectors.joining());
        System.out.println(joiningString);
    }
}
