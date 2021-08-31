package inheritance;

public class SuperKeyword {
    public static void main(String[] args) {
        Child child = new Child(10, 20, 30, 40);
        child.f1();
        child.changeSuperVariables(11,21);
        child.display();

//        Output:
//        A is 10 B is 20
//        C is 30 D is 40
//        Inside f1 of Parent
//        Inside f1 of Child
//        11 21 30 40
    }
}

class Parent{
    int a,b;
    Parent(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("A is "+ a+" B is "+ b);
    }
    void f1(){
        System.out.println("Inside f1 of Parent");
    }
}
class Child extends Parent{
    int c,d;
    Child(int a, int b, int c, int d){
        super(a,b); // Super call is always the first line in constructor call
        this.c = c;
        this.d = d;
        System.out.println("C is "+ c +" D is "+ d);
    }
    void f1(){
        super.f1();
//      System.out.println(super); Gives compilation error.
        System.out.println("Inside f1 of Child");
    }
    void changeSuperVariables(int a, int b){
        super.a = a; //Accessing super class variables using 'super' object.
        super.b = b;
    }

    void display(){
        System.out.println(super.a+" "+ super.b+" "+ c +" "+ d);
    }
}

// super keyword is like an internal pointer to super class you can call methods, access properties and constructors.
// Although similar to 'this' it is different as "souting" 'this' returns address however you can't sout super.
// super method (super()) is the call to the super class's constructor.
// Constructor call to the super class should be the first line in the constructor for child class.