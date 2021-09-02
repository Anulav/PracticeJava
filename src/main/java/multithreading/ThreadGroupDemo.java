package multithreading;

public class ThreadGroupDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getThreadGroup().getName());
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

        ThreadGroup parentThreadGroup = new ThreadGroup("myNewThreadGroup");
        System.out.println(parentThreadGroup.getName());
        ThreadGroup childThreadGroup = new ThreadGroup(parentThreadGroup,"myNewChildThreadGroup"); //Constructor ThreadGroup(parent,name)
        System.out.println(childThreadGroup.getParent().getName());

        //Creating new threads belonging to the newThreadGroup

        childThreadGroup.setMaxPriority(4); //Setting Maximum priority for the threadGroup.

        Thread thread1 = new Thread(childThreadGroup,"Thread 1"); // Herein the new threads belong to childThreadGroup
        Thread thread2 = new Thread(childThreadGroup,"Thread 2");
        System.out.println(thread1.getThreadGroup().getName());
        System.out.println(thread2.getThreadGroup().getName());
        System.out.println(thread1.getPriority());
        System.out.println(thread2.getPriority()); //Here in since the MaxPriority is already set.

    }
}
/*If the threadGroup max priority is set after creation of the threads the priority of the new threads would have been 5 and not 4.*/

/*
Output:
main
system
myNewThreadGroup
myNewThreadGroup
myNewChildThreadGroup
myNewChildThreadGroup
4
4
 */
