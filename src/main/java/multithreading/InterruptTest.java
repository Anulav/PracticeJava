package multithreading;

class MultiThreadedwithInterrupt extends Thread{

    public void run(){
        for (int i = 1; i < 10 ; i++) {
            System.out.println(" i: "+ i +" ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Got interrupted");
                return;  // Had to add return as it not working as expected :(
            }
        }
    }
}

public class InterruptTest{
    public static void main(String[] args) {
        MultiThreadedwithInterrupt mt = new MultiThreadedwithInterrupt();
        mt.start();
        mt.interrupt();
        System.out.println("End of Main thread");

    }
}


/*
A Sleeping thread can only be interrupted. A call to interupt method for a thread t basically says to continue execution
of other threads if the thread t falls asleep.*/
/*

Output:
        End of Main thread
        i: 1
        Got interrupted
        i: 2
        i: 3
        i: 4
        i: 5
        i: 6
        i: 7
        i: 8
        i: 9

Not working as expected.
        */
