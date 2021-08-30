package abstraction.finalConcepts;

public final class FinalConcepts {
    final float PI = 3.14f;
    final float r;

    FinalConcepts(){
        r = 10; // Valid
    }

    public static void main(String[] args) {
        FinalConcepts fC = new FinalConcepts();
//        fC.PI =6.28f; // Error.
    }
}

class FinalMethod{
    public final void display() {
        System.out.println("Final method can't be overriden or extended");
    }
}

class Child extends FinalMethod{
//    @Override
//    public final void display(){
//          Error
//    }
}

/*
class FinalClassExt extends FinalConcepts{ }; // Error


 final class, can't be extended or inherited.
 final variable, value can't be change or if it is pointed to an object.
 It's reference can't be changed.
 final method, can't be overriden in the child class. If you want your child classes to not have
 their own implementation of the method we use final methods.
*/

//final variables can be intialized only when declared or through a constructor.


