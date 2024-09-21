package java8Features.MethodReference;

class Test{
    public static void m1(){
        for(int i=1;i<=20;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
    public  void m2(){
        for(int i=1;i<=20;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class MethodRefTest {
    public static void main(String[] args) {

        Runnable r=new Test()::m2;  // syntax for  calling instance method
        //Runnable r=new Test()::m2; // syntax for calling static method
        Thread t=new Thread(r);
        t.start();
        for(int i=1;i<=20;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
