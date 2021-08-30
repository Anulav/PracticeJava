package abstraction;

public class BMWTest {
    public static void main(String[] args) {
     ThreeSeries threeSeries = new ThreeSeries();
     FiveSeries fiveSeries = new FiveSeries();
     threeSeries.commonFun();
     threeSeries.accelerate();

     fiveSeries.commonFun();
     fiveSeries.accelerate();
//     Output:
//        Driving Pleasure.
//        0-100 in 8 secs
//        Driving Pleasure.
//        0-100 in 6 secs

    }
}

abstract class BMW{
    void commonFun(){
        System.out.println("Driving Pleasure.");
    }
    abstract void accelerate();
}

class ThreeSeries extends BMW{

    @Override
    void accelerate() {
        System.out.println("0-100 in 8 secs");
    }
}

class FiveSeries extends BMW{

    @Override
    void accelerate() {
        System.out.println("0-100 in 6 secs");
    }
}


//Can't mark a abstract class/method as final.
// If a class class which is implementing a abstract class. Then it needs to implement all the abstract methods of the abstract class.