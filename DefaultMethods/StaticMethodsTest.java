package java8Features.DefaultMethods;

interface Addition{
    // this is abstract method
    public void show();

    // this is default method
    default void wish(){
        System.out.println("Hello This is wish mwthod");
    }

    //this is static method
    static int add(int a,int b){return a+b;}    // this method act as utility method

    /*
    NOTE :-  There is loop hole of static method is , we can not use static method in there implementation class'
             directly. To use static method in implementation class we have to use InterfaceName.staticMethod.
    * */

}
class a{
    static  void tt(){
        System.out.println("Hello");
    }
}
public class StaticMethodsTest extends a implements Addition {

    @Override
    public void show() {
        System.out.println(" This is implementation method...");
    }

    public static void main(String[] args) {
        StaticMethodsTest obj=new StaticMethodsTest();
        obj.show();
        obj.wish();
        // obj.add();     // we can not do that
        int res=Addition.add(10,20);
        System.out.println(res);
        StaticMethodsTest.tt();    // here we can access static method of parent class using subclass Name ,
                                 // but we can not invoke static method of interface using subclassName.
    }
}
