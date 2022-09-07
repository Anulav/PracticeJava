package collections.iteration;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> some = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            some.add("A" + i);
        }

/*        Iterator<String> iterator = some.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }
        System.out.println(some.size());
    }

        //Fail fast example
        Iterator<String> itr = some.iterator();
        some.remove(10);
        while (itr.hasNext()) {
            System.out.println(itr.next());  //Throws ConcurrentModificationException
        }
     */

        //Fail safe example
        List<String> newSome = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 100; i++) {
            newSome.add("B" + i);
        }
        Iterator<String> itr2 = newSome.iterator();
        newSome.remove(10);
        while (itr2.hasNext()) {
            System.out.println(itr2.next());  //Doesn't throws ConcurrentModificationException also the list is not updated
        }
        System.out.println();
        Map<Character,String> someMap =  new ConcurrentHashMap<>();
        char chr = 'a';
        for (int i = 0; i <100 ; i++,chr++) {
            someMap.put(chr, String.valueOf(i));
        }
        Iterator<Map.Entry<Character,String>> itr3 = someMap.entrySet().iterator();
        someMap.remove('a');
        while (itr3.hasNext()) {
            System.out.println(itr3.next());  //Doesn't throws ConcurrentModificationException also the list is not updated
        }

    }
}
