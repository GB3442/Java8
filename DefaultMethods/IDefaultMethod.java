package java8Features.DefaultMethods;

/*
If we want to add a new  method inside an interface without affecting the already developed code with default method
 implimentation then we use default method inside an interface.

 */

public interface IDefaultMethod {
    public void display();

    default void wish(){
        System.out.println("Hii THis is default method....");
    }

}
