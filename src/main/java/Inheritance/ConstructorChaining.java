package Inheritance;

public class ConstructorChaining {
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
//        Output:
//        No args Super constructor
//        One args Super constructor. Value of x is 10
//        One args child class constructor
//        No args child class constructor
    }
}

class SuperClass{
    SuperClass(){
        System.out.println("No args Super constructor");
    }
    SuperClass(int x){
        this();  //this or super should always be the first statement in the constructor;
                // observation: Can't have this and super together;
        System.out.println("One args Super constructor. Value of x is "+ x);
    }
}
class ChildClass extends SuperClass{
    ChildClass(int x){
        super(x);
        System.out.println("One args child class constructor");
    }
    ChildClass(){
        this(10);
        System.out.println("No args child class constructor");
    }

}