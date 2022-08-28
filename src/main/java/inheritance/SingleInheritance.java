package inheritance;

public class SingleInheritance {
    void f1(){
        System.out.println("Yo! I'm in f1");
    }
// Every class in java extends java.lang.object class implicitly
    public static void main(String[] args) {
        SingleInheritance singleInheritance = new SingleInheritance();
        singleInheritance.f1();
        singleInheritance.getClass();
        System.out.println(singleInheritance.hashCode()+" "+ singleInheritance.getClass().getCanonicalName());
    }
}
