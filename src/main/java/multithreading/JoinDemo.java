package multithreading;
/*Sum of first n numbers, using join for delaying console output*/
import java.util.Scanner;

public class JoinDemo extends Thread {
    static int n, sum =0;
    public static void main(String[] args) throws InterruptedException {
        var start = System.currentTimeMillis();

        System.out.println("Enter a number for the sum");
        Scanner sc = new Scanner(System.in);
        JoinDemo jd = new JoinDemo(); // Spawning new thread
        JoinDemo.n = sc.nextInt();
        System.out.println("Executing : "+ Thread.currentThread().getName());
        jd.setName("Join Demo thread"); // Naming the thread using setName method
        jd.start();   // Start execution
        jd.join();    // This specifies that the current (main) thread waits till the thread for jd completes execution.
        System.out.println("Executing : "+ Thread.currentThread().getName());
        System.out.println("The sum of first n numbers is "+ JoinDemo.sum);

        var end = System.currentTimeMillis();
        System.out.println("The time taken for execution is: "+ ((end-start)/1000) +" seconds.");

    }
    public void run(){
        for (int i = 1; i <=JoinDemo.n ; i++) {
            sum += i;
            try {
                Thread.sleep(100);
                System.out.println("Executing :"+ Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/*

Output:
Enter a number for the sum
12
Executing : main
Executing :Join Demo thread
Executing :Join Demo thread
Executing :Join Demo thread
Executing :Join Demo thread
Executing :Join Demo thread
Executing :Join Demo thread
Executing :Join Demo thread
Executing :Join Demo thread
Executing :Join Demo thread
Executing :Join Demo thread
Executing :Join Demo thread
Executing :Join Demo thread
Executing : main
The sum of first n numbers is 78
The time taken for execution is: 3 seconds.
*/
