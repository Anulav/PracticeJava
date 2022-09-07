package collections.iteration;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        for (int i = 1000; i <1100 ; i++) {
            ints.add(i);
        }
        ListIterator<Integer> intsItr = ints.listIterator();
        while (intsItr.hasNext()){
            intsItr.set(intsItr.next()+21);
        }
        ints.forEach(System.out::println);

        intsItr = ints.listIterator(99);
        while (intsItr.hasPrevious()){
            intsItr.set(intsItr.previous()-21);
        }
        System.out.println();
        ints.forEach(System.out::println);
    }
}
