package ooa.designpatterns.structural.decorator;

public class DecoratorDriver {
    public static void main(String[] args) {
        BasicCar basicCar = new BasicCar();
        basicCar.drive();

        SportsCar sportsCar = new SportsCar(basicCar);
        sportsCar.drive();
        sportsCar.setSpeed(100);

        LuxuryCar luxuryCar = new LuxuryCar(basicCar);
        luxuryCar.drive();
        luxuryCar.setTransmissionMode("Comfort +");
    }
}
