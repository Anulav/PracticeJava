package abstraction;

public class Honda implements Car {
    @Override
    public void go() {
        System.out.println("Honda's go method");
    }

    @Override
    public void stop() {
        System.out.println("Honda's stop method");
    }
}

//'implements' is the keyword used to specify the interface a class is implementing.