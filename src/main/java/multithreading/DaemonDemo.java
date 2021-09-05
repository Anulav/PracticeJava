package multithreading;

public class DaemonDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread5 myThread5 = new MyThread5();
        System.out.println(myThread5.isDaemon());
//        myThread5.setDaemon(true); //1
        System.out.println("Is "+ Thread.currentThread().getName()+ " current thread a daemon? "+Thread.currentThread().isDaemon());
        myThread5.start();
    }
}

class MyThread5 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i <10 ; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/*
Main thread here, (which is again a non-daemon thread) waits for the non-daemon thread(myThread5) execution.
But when the myThread5 is made daemon here. Main thread doesn't wait for its completion.*/


/*
Output with statement 1:
        false
        Is main current thread a daemon? false
        0*/


/*
Output without statement 1:
false
        Is main current thread a daemon? false
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

Note: As soon as last daemon thread is executed all the daemon threads whether completed execution or not will be terminated.
*/

/*
Also a parent thread is daemon and we are spawning a child thread from it will again be a daemon thread.
Same for non-daemon parent and child thread spwaned from it.*/
