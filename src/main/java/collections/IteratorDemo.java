package collections;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer>  listY= new ArrayList<>();
        Set<Integer> setY = new HashSet<>();

        Random random = new Random();
        //Insertion
        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(5);
            setY.add(number);
            listY.add(number);

        }
        System.out.println("Elements of Set");
        Iterator<Integer> itr = setY.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println("");
        System.out.println("Elements of List");
        Iterator<Integer> itr2 = listY.iterator();
        while(itr2.hasNext()){
            System.out.print(itr2.next()+" ");
        }

        System.out.println("\nList Iterator");
        ListIterator<Integer> litr = listY.listIterator();
        while(litr.hasNext()){
            System.out.print(litr.next()+" ");
        }
        System.out.println("\nNow in reverse");
        while (litr.hasPrevious()){
            System.out.print(litr.previous()+" ");
        }
    }
}


/*
Output:
 Elements of Set
 0 1 2 4
 Elements of List
 1 1 2 4 4 1 4 2 0 0
 List Iterator
 1 1 2 4 4 1 4 2 0 0
 Now in reverse
 0 0 2 4 1 4 4 2 1 1  */
