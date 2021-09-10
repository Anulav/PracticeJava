package collections;

import java.util.ArrayList;

public class ArraysDemo {
    public static void main(String[] args) {
        //ArrayList
        ArrayList arrayList = new ArrayList(); //Raw Arraylist
        arrayList.add(10);  //Autoboxed to Integer
        arrayList.add("Hello World");
        arrayList.add(30.0); //Autoboxed to Float
        System.out.println("Raw ArrayList:");
        for (Object o:
             arrayList) {
            System.out.println(o);
        }

        ArrayList<Integer> arrayList1 = new ArrayList<>(); //Arraylist with Generics. Restricts the elements to a specific type.
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        System.out.println("Typed List:");
        for (int i = 0; i <arrayList1.size() ; i++) {
            System.out.println(arrayList1.get(i));
        }




    }
}

/*
ArrayList: In general, raw collection classes can add heterogeneous elements such as int, long, String, Object.
            But can cause Runtime issues, as let say we need to read the ArrayList in such a case if the expected
            objects change at each index it may cause some runtime exception of ClassMismatch exception or such.
            Therefore it is better to type restrict it using Generics.
*/
/*
                Output:
                        Raw ArrayList:
                        10
                        Hello World
                        30.0
                        Typed List:
                        2
                        3
                        1*/
