package java8Features.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNum {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(10,52,45,85,62,2,8,54,12,42,4,154,5,21);

        List<Integer> evenNumList=list.parallelStream().filter(i->i%2==0).collect(Collectors.toList());
        for (Integer integer : evenNumList) {
            System.out.println(integer);
        }

    }
}
