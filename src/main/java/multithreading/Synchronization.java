package multithreading;
public class Synchronization {
    public static void main(String[] args) {
        Display dplay = new Display();
        new MyThread("Steve", dplay).start();
        new MyThread("Rogers", dplay).start();

    }
}


class Display{
    synchronized void show(String name) throws InterruptedException { //synchronized keyword used for synchronization and provide object lock to the threads.
        for (int i = 0; i < 3 ; i++) {
            System.out.println(name);
            Thread.sleep(2000);
        }
    }
    }


class MyThread extends Thread{
    String name;
    Display display;

    public MyThread(String name, Display display) {
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
