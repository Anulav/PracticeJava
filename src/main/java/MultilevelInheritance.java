public class MultilevelInheritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.f3();
        child.f2();
        child.f1();
        System.out.println(child.hashCode());

//        Output:
//        Grandparent is in Child@60e53b93
//        Instantiating GrandParent
//        Parent is in Child@60e53b93
//        Instantiating Parent
//        Child is in Child@60e53b93
//        Inside f3
//        Inside f2
//        Instantiating Child
//        Inside f1
//        1625635731
    }
}
class GrandParent{
    GrandParent(){
        System.out.println("Grandparent is in "+ this);
        System.out.println("Instantiating GrandParent");
    }
 void f1(){
     System.out.println("Inside f1");
 }
}

class Parent extends GrandParent{
    Parent(){
        System.out.println("Parent is in "+ this);
        System.out.println("Instantiating Parent");
    }
    void f2(){
        System.out.println("Inside f2");
        System.out.println("Instantiating Child");
    }
}

class Child extends Parent{
    Child(){
        System.out.println("Child is in "+ this);
    }
    void f3(){
        System.out.println("Inside f3");
    }

}

// We added constructors and printed 'this' keyword to verify that child objects and parent objects share the same memory location.
// Also the instantiation is in the order :Object-> GrandParent -> Parent -> Child.