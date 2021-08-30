package abstraction;
// Abstract means theoritical not implemented
// Abstract classes are partial abstraction in Java. We can have some concrete methods and abstract methods.
// Interfaces are completely abstract. We can't have a concrete method till Java8.
// To mark a class,method abstract we use abstract keyword.
// Can't instantiate a abstract class or Interface.
public class abstraction {
    public static void main(String[] args) {
   //     Test test = new Test(); Gives error
        Test.notSoMain();
    }
}




abstract class Test{
    void f1(){
        System.out.println("Inside f1");
    }
    abstract void f2(); //Abstract method

    public static void notSoMain() {
        System.out.println("Yo inside the main");
    }
}
