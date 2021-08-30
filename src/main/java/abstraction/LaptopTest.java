package abstraction;

public class LaptopTest{
    public static void main(String[] args) {
        Laptop hpLaptop = new HPLaptop();
        Laptop dellLaptop = new DellLaptop();

        hpLaptop.click();
        hpLaptop.scroll();

        dellLaptop.click();
        dellLaptop.scroll();

//        Output:
//        Inside HPLaptop's click
//        Inside HP's scroll
//        Inside DellLaptop's click
//        Inside Dell's scroll
    }
}

interface Laptop {
    void click();
    void scroll();
}

abstract class HP implements Laptop{
    @Override
    public void scroll(){ // Can't assign weaker access privileges to the implemented methods.
        System.out.println("Inside HP's scroll");
    }
}

abstract class Dell implements Laptop{
    @Override
    public void scroll(){
        System.out.println("Inside Dell's scroll");
    }
}
class HPLaptop extends HP{

    @Override
    public void click() {
        System.out.println("Inside HPLaptop's click");
    }
}

class DellLaptop extends Dell{

    @Override
    public void click() {
        System.out.println("Inside DellLaptop's click");
    }
}


//In Java, methods and data members of a class/interface can have one of the following four access specifiers.
// The access specifiers are listed according to their restrictiveness order.
//
//1) private (accessible within the class where defined)
//2) default or package private (when no access specifier is specified)
//3) protected
//4) public (accessible from any class)
//
//But, the classes and interfaces themselves can have only two access specifiers when declared outside any other class.
//1) public
//2) default (when no access specifier is specified)
//
//We cannot declare class/interface with private or protected access specifiers.