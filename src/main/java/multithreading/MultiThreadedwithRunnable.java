package multithreading;

public class MultiThreadedwithRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread with Runnable interface");
    }

    public static void main(String[] args) {
        MultiThreadedwithRunnable mTR = new MultiThreadedwithRunnable();
//        mTR.start(); Not available in Runnable interface. So we need to create a Thread object.
        Thread thread = new Thread(mTR);
        thread.start();
    }
}

/*Benefit of using Runnable Interface method than Thread is that we can implement other interfaces to the class in
Runnable but not in Thread as it is a class and MultipleInheritance is not supported in Java.*/