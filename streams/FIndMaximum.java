package java8Features.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FIndMaximum {
    public static void main(String[] args) {
        List<Integer> ll=Arrays.asList(10,20,25,24,25,85,58,2,85,54,5,5,5);

        int maxNUm=ll.stream().mapToInt(Integer::valueOf).max().getAsInt();
        System.out.println("Maximum number : "+maxNUm);

        int minNumber=ll.stream().mapToInt(Integer::valueOf).min().getAsInt();
        System.out.println("Minimum Number : "+minNumber);

        // removing duplictes elements from array
         int[] arr=ll.stream().mapToInt(Integer::valueOf).distinct().toArray();
         Arrays.stream(arr).forEach(i->System.out.print(i+" "));

         double avg=ll.stream().mapToInt(Integer::valueOf).average().getAsDouble();
        System.out.println("\nAverage is : "+avg);





    }
}
