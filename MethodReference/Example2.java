package java8Features.MethodReference;
@FunctionalInterface
interface I1{
    public void wish();
}


public class Example2 {
    //here we are providing another method for performing method reference
    /*
    Here we change return type, access modifier. But we can not change method arguments.
     */
    public static void  wish2(){
        System.out.println("Good Night Bro...!!!!!");
    }

    public static void main(String[] args) {

        // accessing method using lambda expression
        I1 i=()->System.out.println("Good morning..!!!!");
        i.wish();

        // Accesssing method using method reference
        I1 i2=Example2::wish2;
        i2.wish();
    }
}
