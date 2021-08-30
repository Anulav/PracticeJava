package abstraction;

public interface Circle2 {
    float radius= 10;

    default void defaultDisplay(){
        System.out.println("Default display");
    }

    void someMethod();

//    int someMethod2(); //4


}
 interface Circle3 {
    float radius= 10;

    default void defaultDisplay2(){ // 1-> naming this as defaultDisplay() causes conflicts in the CircleTest2 as it implements both the interfaces.
        System.out.println("Default display");
    }
     void someMethod();
//     char someMethod2(); //4 -> Causes error in CircleTest2.
}

class CircleTest2 implements Circle2, Circle3{

    public static void main(String[] args) {
        CircleTest2 circleTest2 = new CircleTest2();
 //       System.out.println(circleTest2.radius); Error
        System.out.println(Circle.radius); // 3
    }

    @Override
    public void someMethod() {
        System.out.println("Something");
    }
}


/*

1.Can't implement interfaces with same default methods with same signature in the class.
2.Can implement the method with same signature in the
3. Qualifying, If multiple interfaces are implemented having same variables in them can cause ambiguity
    in order to remove it we use Qualifying i.e accessing it using Classname.variableName (just like accessing static variables)
4. Can't implement interfaces having methods with same signature i.e ('The method signature consists of the method name and the parameter list.
') but different return type.
*/