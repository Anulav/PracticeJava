package multithreading.executorservice;

import java.util.concurrent.*;

public class CallableFutureDemo {
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50};
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (int i = 0; i < nums.length ; i++) {
            int finalI= i; //need to make variable final or effectively final to be used in lambda expressions. here it is 'effectively final'.
            Future<Integer> totalSum = service.submit(()->{ //Could have made simpler by creating a separate class rather than a lambda here.
                int sum = 0;
                for (int j = 0; j < nums[finalI] ; j++) {
                        sum += j;
                }
                return sum;
            });
            try {
                System.out.println("The sum for "+ nums[i] +" "+totalSum.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        service.shutdown(); //Very important step or else the program keeps on running.
    }
}
/*

Final vs effectively final
Per StackOverflow,

This variable below is final, so we can't change it's value once initialised. If we try to we'll get a compilation error...

            final int variable = 123;
But if we create a variable like this, we can change it's value...
            int variable = 123;
            variable = 456;

But in Java 8, all variables are final by default. But the existence of the 2nd line in the code makes it non-final. So if we remove the 2nd line from the above code, our variable is now "effectively final"...

            int variable = 123;
So.. Any variable that is assigned once and only once, is "effectively final".

Starting in Java SE 8, a local class can access local variables and parameters of the enclosing block that are final or effectively final.
A variable or parameter whose value is never changed after it is initialized is effectively final.
*/
