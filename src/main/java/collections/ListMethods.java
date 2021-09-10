package collections;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
    public static void main(String[] args) {
        List listTest = new ArrayList<>(); //Better to use Interface references. So that implementation can be changed easily in future.

        for (int i = 10; i <= 100 ; i+=10) {
            listTest.add(i);
        }
        System.out.println("Initial List: "+ listTest);

        listTest.add(3,100); // Adding element at a index.
        System.out.println("List after adding 100 @3 index: "+listTest);

        listTest.set(3,200); // It doesn't adds or removes just replaces at a index.
        System.out.println("List after replacing 100 @3 index: "+listTest);

/*        Adding a list to another list*/
        List<Integer> first = new ArrayList<>(); //Type restricted list
        for (int i = 0; i < 5 ; i++) {
            first.add(i);
        }
        List<Integer> second = new ArrayList<>(); //Type restricted list
        for (int i = 10; i < 50 ; i+=10) {
            second.add(i);
        }
        System.out.println(first);
        System.out.println(second);
        List third = new ArrayList<>(first); //Another constructor taking a list as args
        first.addAll(5,second); //Adds at the end of the list
        System.out.println("List after adding: "+first);
        third.addAll(2,second); //Overloaded addAll method, Adding a list after an index
        System.out.println("List after adding @2 index: "+third);

        System.out.println("Size of first list is: "+ first.size());
        for (int i = 0; i < first.size() ; i++) { //Observation i<first.size() may not work if the list is not initialized.
            System.out.println(first.get(i));
        }

        first.remove(3);
        System.out.println("List after removing element @3 "+ first);



    }
/*    Output:
    Initial List: [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
    List after adding 100 @3 index: [10, 20, 30, 100, 40, 50, 60, 70, 80, 90, 100]
    List after replacing 100 @3 index: [10, 20, 30, 200, 40, 50, 60, 70, 80, 90, 100]
            [0, 1, 2, 3, 4]
            [10, 20, 30, 40]
    List after adding: [0, 1, 2, 3, 4, 10, 20, 30, 40]
    List after adding @2 index: [0, 1, 10, 20, 30, 40, 2, 3, 4]
    Size of first list is: 9
            0
            1
            2
            3
            4
            10
            20
            30
            40
    List after removing element @3 [0, 1, 2, 4, 10, 20, 30, 40]*/
}
