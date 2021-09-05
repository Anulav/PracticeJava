package multithreading.deadlock;

class FirstResource{
    public synchronized void f1(SecondResource sr) throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Inside f1 of FirstResource");
        sr.f2();
    }
    public synchronized void f2(){
        System.out.println("Inside the f2 of FirstResource");
    }
}

class SecondResource{
    public synchronized void f1(FirstResource fr) throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Inside f1 of SecondResource");
        fr.f2();
    }
    public synchronized void f2(){
        System.out.println("Inside the f2 of SecondResource");
    }
}

public class DeadlockDemo extends Thread{

    FirstResource fr = new FirstResource();
    SecondResource sr = new SecondResource();


    DeadlockDemo() {
        new Thread(this).start();
        try {
            sr.f1(fr); //Although this is under constructor of DeadlockDemo it lies under execution scope of the main thread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // not the new DeadlockDemo's thread as the execution scope for that is whatever lies under the run method.
    }

    public static void main(String[] args) {
        DeadlockDemo demo = new DeadlockDemo();
    }

    @Override
    public void run(){
        try {
            fr.f1(sr);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

/*
Output:
        Inside f1 of FirstResource
        Inside f1 of SecondResource

<And the execution is never completed. As both threads have reached a deadlock state.>*/
