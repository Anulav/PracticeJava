package collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorExample {
}
class SomeClass{
    String value;
    SomeClass(String value){
        this.value = value;
    }
    public String toString(){
        return value;
    }
}
class SomeClassComparator implements Comparator<SomeClass>{

    @Override
    public int compare(SomeClass someClass, SomeClass t1) {
        String val1 = someClass.value;
        String val2 = t1.value;
        return val1.compareTo(val2);
    }
}

class ComparatorDemo{
    public static void main(String[] args) {
        String[] someStrings = {"rgbt","ceec","wxw","trbnet","cecj7","jj7j","ada","sda"};
        Set<SomeClass> treeSetY = new TreeSet<>(new SomeClassComparator());

//        Set<SomeClass> treeSetY = new TreeSet<>();

        for (int i = 0; i <someStrings.length ; i++) {
            treeSetY.add(new SomeClass(someStrings[i]));
        }

        System.out.println("Now let's see, tree: "+ treeSetY);


    }
}

/*
Output without Comparator:
        Exception in thread "main" java.lang.ClassCastException: class collections.SomeClass cannot be cast to class java.lang.Comparable (collections.SomeClass is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
        at java.base/java.util.TreeMap.compare(TreeMap.java:1291)
        at java.base/java.util.TreeMap.put(TreeMap.java:536)
        at java.base/java.util.TreeSet.add(TreeSet.java:255)
        at collections.ComparatorDemo.main(ComparatorExample.java:36)

Output with Comparator:
        Now let's see, tree: [ada, cecj7, ceec, jj7j, rgbt, sda, trbnet, wxw]

1.TreeSet has constructor which takes int the comparator
2.Can't use TreeSet unless the element's class has implemented Comparable Interface or have a
separate comparator.

*/
