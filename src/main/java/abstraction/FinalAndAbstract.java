package abstraction;

public /*final*/ abstract class FinalAndAbstract{ // abstract and final cannot be combined.
    abstract /*final */void measure(); // Same as for class. Can't have abstract method as final.
    final void sayMyName(String name){
        System.out.println("Yo,"+ name);
    }
}


/*
Final classes cannot have abstract method but abstract class can have final non-abstract methods.*/
