package inheritance;

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.fuel());
        Bike bike = new Bike();
        System.out.println(bike.fuel());
        Bus bus = new Bus();
        System.out.println(bus.fuel());

//        Output:
//        Diesel
//        Petrol
//        CNG

    }
}

class Vehicle{
    String fuel(){
        return "Petrol";
    }
}

class Car extends Vehicle{
    @Override //Since Java 1.5
    String fuel(){
        return "Diesel";
    }

}

class Bus extends Vehicle{
    @Override
    String fuel(){
        return "CNG";
    }

}

class Bike extends Vehicle{

}

//Overriding methods: Need to have the same signature i.e return type, name, parameters nos and datatype