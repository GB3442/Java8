package java8Features.DefaultMethods;

public class Defaultest implements IDefaultMethod{

    @Override
    public void display() {
        System.out.println("Hii There !!!!!!!!!!");
    }
    public static void main(String[] args) {
       new Defaultest().wish();    // calling default method.
    }


}