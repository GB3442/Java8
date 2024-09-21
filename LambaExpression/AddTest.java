package java8Features.LambaExpression;

public class AddTest{
    public static void main(String[] args) {
       Addition add=(int a, int b)->{
           return a+b;
       };
       int result=add.add(10,25);
        System.out.println(result);

        DoWish w=()->System.out.println("Good Morning...");
        w.wish();
    }

}
