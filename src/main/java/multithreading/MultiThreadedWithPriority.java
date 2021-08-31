package multithreading;

public class MultiThreadedWithPriority extends Thread{
    public static void main(String[] args) {
        MultiThreadedWithPriority mt = new MultiThreadedWithPriority();
        mt.setPriority(MIN_PRIORITY);
        mt.setName("minPriorityThread");
        mt.start();

        MultiThreadedWithPriority mt2 = new MultiThreadedWithPriority();
        mt2.setPriority(MAX_PRIORITY);
        mt2.setName("maxPriorityThread");
        mt2.start();

    }
    public void run(){
        for (int i = 1; i < 10 ; i++) {
            System.out.println(" i: "+ i +" "+Thread.currentThread().getName());
        }
    }
}


/*
Thread Priority:
 Can use Thread.setPriority() method. It has a range between 1-10, 1 being highest and 10 being the lowest.
 Constants provided for priority are MAX_PRIORITY(10), MIN_PRIORITY(1) and NORM_PRIORITY(5).
 Although the priority is set by the programmer. It is upto JVM's implementation on the order in which threads are executed.
*/

/*
Output:
        i: 1 maxPriorityThread
        i: 1 minPriorityThread
        i: 2 maxPriorityThread
        i: 2 minPriorityThread
        i: 3 maxPriorityThread
        i: 3 minPriorityThread
        i: 4 maxPriorityThread
        i: 4 minPriorityThread
        i: 5 maxPriorityThread
        i: 5 minPriorityThread
        i: 6 maxPriorityThread
        i: 6 minPriorityThread
        i: 7 maxPriorityThread
        i: 7 minPriorityThread
        i: 8 maxPriorityThread
        i: 8 minPriorityThread
        i: 9 maxPriorityThread
        i: 9 minPriorityThread*/
