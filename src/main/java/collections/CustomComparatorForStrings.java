package collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class CustomComparatorForStrings implements Comparator<String> {
    @Override
    public int compare(String s, String t1) {
        int lenght1 = s.length();
        int lenght2 = t1.length();
        if(lenght1>lenght2){
            return 1;
        }else if(lenght1<lenght2){
            return  -1;
        }else{
            return 0;
        }
    }
}

class StringCustomComparatorDemo{
    public static void main(String[] args) {
        String[] strings = {"aa","z","sadsfghjgfdsadfgh","asdas","sdas","rgr","vresdc","yhy","oieof","eewtcs","cqwdc"};
        Set<String> stringSet = new TreeSet<>(new CustomComparatorForStrings());
        for (String string: strings) {
            stringSet.add(string);
        }
        System.out.println("Custom Ordering :" + stringSet);
    }
}

/*
Output:
        Custom Ordering :[z, aa, rgr, sdas, asdas, vresdc, sadsfghjgfdsadfgh]

*/
