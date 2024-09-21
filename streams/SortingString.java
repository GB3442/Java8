package java8Features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingString {
    public static void main(String[] args) {
       List<String> list= Arrays.asList("raj","rani","rajesh","brijesh","ajay","Sarvodaya","Digambar");

       // perform natural sorting
        System.out.println("===================== in Ascending order ============================");
       List<String> sortedLIst= list.stream().sorted().collect(Collectors.toList());
       sortedLIst.forEach(System.out::println);

        System.out.println("===================== in Descending order ============================");
       // performing sorting in desceding order
        list.stream().sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList()).forEach(System.out::println);


        System.out.println("===================== by String length order in asceding ============================");
        list.stream().sorted((s1,s2)->s1.length()-s2.length()).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("===================== by String length order in Descending ============================");
        list.stream().sorted((s1,s2)->s2.length()-s1.length()).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println(Math.sqrt(99));
    }
}
