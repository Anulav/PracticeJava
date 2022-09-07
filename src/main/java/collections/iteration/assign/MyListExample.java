package collections.iteration.assign;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyListExample {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        for (int i = 0; i < 15; i++) {
            myList.add(String.valueOf(i));
        }

        MyList<Integer> myList2 = new MyList<>();
        for (int i = 0; i < 20; i++) {
            myList2.add(i * 100);
        }
        myList2.add(23);
        System.out.println(myList2.length());
        myList2.removeElement(0);
        System.out.println(myList2);
        System.out.println(myList2.length());

    }
}



