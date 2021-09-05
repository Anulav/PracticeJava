package multithreading.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*Scenario, This class is a check processor class created to process a check from a resource such as mobile, ATM, bank teller*/
public class CheckProcessor implements Runnable{

    String name;
    CheckProcessor(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println("The check processing has begun for: "+ name+" in the thread "+ Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Check processing is completed for: "+name);
    }
}

class CheckProcessorDemo{
    public static void main(String[] args) {
        CheckProcessor[] processors = {new CheckProcessor("Mobile"),new CheckProcessor("ATM"),
          new CheckProcessor("Bank"), new CheckProcessor("Post")
        };
        ExecutorService service = Executors.newFixedThreadPool(2); //Creates a threadpool of 2 threads.
        for (CheckProcessor checkProcessor:processors) {
            service.submit(checkProcessor);
        }
        service.shutdown(); //Initiates an orderly shutdown in which previously submitted tasks are executed, but no new tasks will be accepted
    }
}