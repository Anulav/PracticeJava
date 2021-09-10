package collections;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class StringTreeSet {
    public static void main(String[] args) {
        Set<String> stringSet = new TreeSet<>();
        String[] strings = {"aab","aaa","zdc","efe","rte","kls", "lmn"};
        for (int i = 0; i <6 ; i++) {
            stringSet.add(strings[i]);
        }
        System.out.println("TreeSet O/P: "+ stringSet);

        Set<StringBuffer> stringBufferSet = new TreeSet<>();
        for (int i = 0; i <6 ; i++) {
            stringBufferSet.add(new StringBuffer(strings[i]));
        }
        System.out.println("TreeSet with StringBuffer: "+ stringBufferSet);
    }


}

/*
Output:
    TreeSet O/P: [aaa, aab, efe, kls, rte, zdc]
    TreeSet with StringBuffer: [aaa, aab, efe, kls, rte, zdc]

    As evident the TreeSet sorts in the natural order of string i.e alphabetically.

    For TreeSet to sort and work without throwing ClassCastException.
    It is important that the Class implements Comparable interface or provides a Comparator.
    */
