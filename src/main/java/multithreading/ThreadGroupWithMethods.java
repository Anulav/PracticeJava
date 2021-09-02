package multithreading;

public class ThreadGroupWithMethods {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup parentThreadGroup = new ThreadGroup("myNewThreadGroup");

        CustomThread customThread = new CustomThread(parentThreadGroup,"Thread 1");
        CustomThread customThread2 = new CustomThread(parentThreadGroup,"Thread 2");
        customThread.start();
        customThread2.start();

        System.out.println(parentThreadGroup.activeCount()); //Gives in the count of all the active Threads.
        System.out.println(parentThreadGroup.activeGroupCount()); //Gives in all the active threadGroups and its subgroups count.
        parentThreadGroup.list(); // Returns a list of all the threads in the threadGroup.
        Thread.sleep(5000);
        System.out.println(parentThreadGroup.activeCount()); // Gives 0 as all the threads have completed execution as the their sleep was also for 2 seconds only and the main thread's sleep is for 5 seconds.
        parentThreadGroup.list(); //List the threads after the execution of all the threads is completed.

    }
}
class CustomThread extends Thread {
    public CustomThread(ThreadGroup threadGroup, String name) {
        super(threadGroup,name); //Thread class has a constructor with ThreadGroup and name of the thread.
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


/*
Output:
        2
        0
        java.lang.ThreadGroup[name=myNewThreadGroup,maxpri=10]
        Thread[Thread 1,5,myNewThreadGroup]
        Thread[Thread 2,5,myNewThreadGroup]
        0
        java.lang.ThreadGroup[name=myNewThreadGroup,maxpri=10]*/
