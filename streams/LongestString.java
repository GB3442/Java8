package java8Features.streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LongestString {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("raj","rani","rajesh","brijesh","ajay","Sarvodaya","Digambar");
        Optional<String> strList=list.stream().max((str1, str2)->str1.length() - str2.length());

        System.out.println(strList.orElse("N/A"));

        List<Integer> ll=Arrays.asList(10,55,48);
        Optional<Integer> lll=ll.stream().max((n1,n2)->n1-n2);
        System.out.println(lll.isPresent()?lll.get():"N/A");

    }
}
