package collections.arrays;

import java.util.Arrays;

public class ArraysUsage {
    public static void main(String[] args) {
        int[] arr = {1,35,632,765,342};
        System.out.println(Arrays.toString(arr));
        //Sort
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //binarySearch
        System.out.println(Arrays.binarySearch(arr,35));

        //fill
        Object[] newArr = new Object[4];
        Arrays.fill(newArr, null);
        System.out.println(Arrays.toString(newArr));

        //copyOf
        Object[] newArrCopy = Arrays.copyOf(newArr, newArr.length-1);
        System.out.println(Arrays.toString(newArrCopy));

    }
}

/*Output
[1, 35, 632, 765, 342]
[1, 35, 342, 632, 765]
1
[null, null, null, null]
[null, null, null]
*
*/