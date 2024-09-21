package java8Features.LambaExpression;

import java.util.ArrayList;

public class eleTest {
    public static void main(String[] args) {
        int[] arr={10,55,4,8,5,6,5,8,5,5,5};

        PrintElement s=(arr1)->{
           // System.out.println("Hello");
            if(arr1 instanceof int[]){
                int[] ar=(int[])arr1;
                for(int i=0;i<ar.length;i++){
                    System.out.println(ar[i]);
                }
            }


        };
        s.forEachele(arr);
    }
}
