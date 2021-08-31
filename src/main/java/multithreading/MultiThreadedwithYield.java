package multithreading;

public class MultiThreadedwithYield extends Thread{
    public static void main(String[] args) {
        MultiThreadedwithYield mt = new MultiThreadedwithYield();
        mt.start();
        for (int j = 0; j < 10 ; j++) {
            System.out.println(" j: "+ j + " "+Thread.currentThread().getName());
        }

    }
    public void run(){
        for (int i = 1; i < 10 ; i++) {
            Thread.yield();
            System.out.println(" i: "+ i + " "+Thread.currentThread().getName());
        }
    }
}

/*
A yield() method is a static method of Thread class and it can stop the currently executing thread and will give a chance to other waiting threads of the same priority.
If in case there are no waiting threads or if all the waiting threads have low priority then the same thread will continue its execution
         Output:
         i: 1 Thread-0
         j: 0 main
         i: 2 Thread-0
         j: 1 main
         i: 3 Thread-0
         j: 2 main
         i: 4 Thread-0
         j: 3 main
         i: 5 Thread-0
         j: 4 main
         i: 6 Thread-0
         j: 5 main
         i: 7 Thread-0
         j: 6 main
         i: 8 Thread-0
         i: 9 Thread-0
         j: 7 main
         j: 8 main
         j: 9 main


Here output is not as expected because -> (StackOverflow) As with almost all aspects of Multithreading, even your case isn't guaranteed to behave as expected.
Thread.yield() is just like a suggestion to the OS telling - if it is possible, then please execute other threads before this one.
Depending on the architecture of your system (number of cores, and other aspects like affinity etc etc) the OS might just ignore your request.

yield() can totally be ignored (which might be happening in your case. If you are getting the same result over and over again)
*/
