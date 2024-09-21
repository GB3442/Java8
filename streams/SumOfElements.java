package java8Features.streams;

import java.util.Arrays;
import java.util.List;

public class SumOfElements {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(10,20,30,4,5,2,5,5,2,24,54,5,2);

        int sum=list.parallelStream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of element : "+sum);

    }
}
