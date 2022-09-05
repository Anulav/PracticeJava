package ooa.designpatterns.structural.decorator;

public class LuxuryCar extends CarDecorator {

    private String transmissionMode;

    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void drive(){
        super.drive();
        System.out.println("Smooth drive");
    }

    public void setTransmissionMode(String TransmissionMode){
        this.transmissionMode = transmissionMode;
        System.out.println("TransmissionMode is "+transmissionMode);
    }
}
