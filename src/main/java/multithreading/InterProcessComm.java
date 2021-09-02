package multithreading;
public class InterProcessComm {
    public static void main(String[] args) throws InterruptedException {
        MyThread4 myThread4 = new MyThread4();
        myThread4.start(); //Main thread spawns a new thread here.
        synchronized (myThread4){  //Both the threads main and one made for MyThread4 uses the object myThread4
                                    //hence the synchronized keyword. Here main thread acquires the lock on myThread4 object.
            System.out.println("Main thread is going to wait");
            myThread4.wait(); // Here in, the current(main thread) releases the lock on myThread4 which is acquired again by MyThread4's thread. And the main thread is notified from notify() method
            System.out.println("Main thread is notified");
            System.out.println("The sum is: "+ myThread4.sum);
        }
    }

}


class MyThread4 extends Thread{
    int sum = 0;
    @Override
    public void run() {
        Thread.currentThread().setName("MyThread4's thread");
        synchronized (this) {
            System.out.println("Child thread is executing");
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                sum += i;
            }
            this.notify(); // Lock is released for this object and execution is send back to main thread which then
                            // acquires the lock again on myThread4 and continue.
        }
    }
}

/*
Output:
        Main thread is going to wait
        Child thread is executing
        0
        1
        2
        3
        4
        5
        6
        7
        8
        9
        Main thread is notified
        The sum is: 45*/
