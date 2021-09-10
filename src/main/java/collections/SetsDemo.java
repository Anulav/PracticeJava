package collections;

import java.util.*;

public class SetsDemo {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> listT = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            listT.add(random.nextInt(5)); //Random's nextInt method with args sets the upper bound
        }
        System.out.println("List: "+listT);

        Set<Integer> setT = new HashSet<>();
        for (int i = 0; i <10 ; i++) {
            setT.add(random.nextInt(5));
        }

        System.out.println("Set: "+setT); // Per the output, set removes the dupes.

        //Sets comparison
        System.out.println("===========================================");
        Set<Integer> hashSetT = new HashSet<>();
        Set<Integer> linkedHashSetT = new LinkedHashSet<>();
        Set<Integer> treeSetT = new TreeSet<>();

        System.out.println("Inserted elements");
        for (int i = 0; i < 10 ; i++) {
            int number = random.nextInt(100);
            hashSetT.add(number);
            linkedHashSetT.add(number);
            treeSetT.add(number);
        }
        System.out.println("HashSet: "+hashSetT);
        System.out.println("LinkedHashSet: "+linkedHashSetT);
        System.out.println("treeSetT: "+treeSetT);

    }
/*
Output:
    List: [4, 1, 3, 1, 2, 3, 0, 4, 2, 2]
    Set: [1, 2, 3, 4]
    ===========================================
    Inserted elements
    HashSet: [0, 17, 50, 4, 52, 6, 9, 25, 62, 95]
    LinkedHashSet: [9, 0, 62, 25, 50, 6, 95, 4, 17, 52]
    treeSetT: [0, 4, 6, 9, 17, 25, 50, 52, 62, 95]

    As evident from output, HashSet doesn't maintain the order of insertion and nither.
                            LinkedHashSet does maintain the order of insertion.
                            TreeSet sorts the inserted elements.
*/

}
