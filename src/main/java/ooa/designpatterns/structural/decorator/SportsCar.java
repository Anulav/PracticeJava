package ooa.designpatterns.structural.decorator;

public class SportsCar extends CarDecorator {
    private int speed;

    public SportsCar(Car car) {
        super(car);
    }
    @Override
    public void drive(){
        super.drive();
        System.out.println("Fast drive");
    }

    public void setSpeed(int speed){
        this.speed = speed;
        System.out.println("Speeding at "+ speed);
    }

}
