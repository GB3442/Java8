package java8Features.streams;

import java.util.Arrays;
import java.util.List;

public class CountCharInStr {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");
        char searchchar='a';

        long count=strings.stream().filter(str->str.contains(String.valueOf('a'))).count();
        System.out.println("Number of Strings containing  charactor 'a' : "+count);

    }
}
