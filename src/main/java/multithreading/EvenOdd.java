package multithreading;

public class EvenOdd {
    public static void main(String[] args) throws InterruptedException {
        EvenNumbers evenNumbers = new EvenNumbers();
        OddNumbers oddNumbers = new OddNumbers();
        evenNumbers.start();
        oddNumbers.start();
    }
}


class EvenNumbers extends Thread{

    @Override
    public void run(){
        Thread.currentThread().setName("Even thread");
        for (int i = 0; i <= 10  ; i+=2) {
            if(i!=0) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class OddNumbers extends Thread{

    @Override
    public void run(){
        Thread.currentThread().setName("Odd  thread");
        for (int i = 1; i <= 10 ; i+=2) {
            System.out.println(Thread.currentThread().getName() + " " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/*Output:
        Odd  thread 1
        Even thread 2
        Odd  thread 3
        Even thread 4
        Odd  thread 5
        Even thread 6
        Odd  thread 7
        Even thread 8
        Odd  thread 9
        Even thread 10*/
