package multithreading;
public class SynchronizedBlock {
    public static void main(String[] args) {
        Display dplay = new Display();
        new MyThread("Steve", dplay).start();
        new MyThread("Rogers", dplay).start();

    }
}


class Display3{
     void show(String name) throws InterruptedException {
        //Any no. of lines of code can go in here.
         synchronized (this) { //synchronized block used for synchronization and provides object lock over current object to the threads.
            for (int i = 0; i < 3; i++) {
                System.out.println(name);
                Thread.sleep(2000);
            }
        }
    }
    }


class MyThread3 extends Thread{
    String name;
    Display display;

    public MyThread3(String name, Display display) {
        this.name = name;
        this.display = display;
    }

    @Override
    public void run() {
        try {
            display.show(name);
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
