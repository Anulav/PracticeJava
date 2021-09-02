package multithreading;
public class StaticSynchronization {
    public static void main(String[] args) {
        new MyThread2("Steve").start();
        new MyThread2("Rogers").start();

    }
}


class Display2{
    synchronized static void show(String name) throws InterruptedException { //synchronized keyword used for static methods provides class level lock to the threads.
        for (int i = 0; i < 3 ; i++) {
            System.out.println(name);
            Thread.sleep(2000);
        }
    }
    }


class MyThread2 extends Thread{
    String name;
    MyThread2(String name){
        this.name = name;
    }
    @Override
    public void run() {
        try {
            Display2.show(name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

/*
Output:
        Steve
        Steve
        Steve
        Rogers
        Rogers
        Rogers*/
