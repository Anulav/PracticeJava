package abstraction;

public interface Circle {
    float radius= 10;

    private void display() {  /* Private methods are meant to be used by internal methods only. */
        System.out.println("Radius: "+radius);
    }
//    protected void display2(){} Error
    default void defaultDisplay(){
        display();
        System.out.println("Default display");
    }

    // static methods
    static void something(){
        System.out.println("You are in something");
        nothing();
    }

    private static void nothing(){
        System.out.println("You are in nothing");
    }
}

class CircleTest implements Circle{
    public static void main(String[] args) {
        Circle circle = new CircleTest();
        circle.defaultDisplay();
//        circle.display(); Error no method available for Child.
        Circle.something();
    }
}


/*
Methods in an Interface are public abstract. You cannot use other modifiers except for static, strictfp and default;

 From Java9, Private methods can be implemented static or non-static. Private are meant to be used privately by methods of the interface itself. This means that in an interface we are able to
 create private methods to encapsulate code from both default and static public method signatures.

 Variables in interfaces are meant for only constants. Hence by default, they are marked as public static final.*/
