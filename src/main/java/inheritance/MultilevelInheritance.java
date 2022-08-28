package inheritance;

public class MultilevelInheritance {
    public static void main(String[] args) {
        Child1 child = new Child1();
        child.f3();
        child.f2();
        child.f1();
        System.out.println(child.hashCode());

//        Output:
//        Grandparent is in inheritance.Child1@60e53b93
//        Instantiating inheritance.GrandParent1
//        inheritance.Parent1 is in inheritance.Child1@60e53b93
//        Instantiating inheritance.Parent1
//        inheritance.Child1 is in inheritance.Child1@60e53b93
//        Inside f3
//        Inside f2
//        Instantiating inheritance.Child1
//        Inside f1
//        1625635731
    }
}
class GrandParent1{
    GrandParent1(){
        System.out.println("Grandparent is in "+ this);
        System.out.println("Instantiating inheritance.GrandParent1");
    }
 void f1(){
     System.out.println("Inside f1");
 }
}

class Parent1 extends GrandParent1{
    Parent1(){
        System.out.println("inheritance.Parent1 is in "+ this);
        System.out.println("Instantiating inheritance.Parent1");
    }
    void f2(){
        System.out.println("Inside f2");
        System.out.println("Instantiating inheritance.Child1");
    }
}

class Child1 extends Parent1{
    Child1(){
        System.out.println("inheritance.Child1 is in "+ this);
    }
    void f3(){
        System.out.println("Inside f3");
    }

}

// We added constructors and printed 'this' keyword to verify that child objects and parent objects share the same memory location.
// Also the instantiation is in the order :Object-> inheritance.GrandParent1 -> inheritance.Parent1 -> inheritance.Child1.