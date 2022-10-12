package eopi.strings;

import java.util.Arrays;

public class ReplaceAndRemove {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'a', 'c', 'b'};
        Arrays.asList(naiveSol(arr)).forEach(System.out::println);
        Arrays.asList(replaceAndRemove(arr, 5)).forEach(System.out::println);

    }

    public static char[] naiveSol(char[] arr) {
        char[] newArr = new char[arr.length];
        for (int i = 0, j = 0; i < arr.length || j < arr.length - 1; i++, j++) {
            if (arr[i] == 'a') {
                newArr[j] = 'd';
                newArr[++j] = 'd';
            } else if (arr[i] == 'b') {
                --j;
                continue;
            } else {
                newArr[j] = arr[i];
            }
        }
        return newArr;
    }

    public static char[] replaceAndRemove(char[] ip, int size) {
        int writeIndex = 0, aCount = 0;
        for (int i = 0; i < size; i++) {
            if (ip[i] != 'b') {
                ip[writeIndex++] = ip[i]; //writeIndex doesn't move if the character is 'b'
                //            }
                if (ip[i] == 'a') aCount++;
            }
            return ip;
        }
        return ip;
    }
}
/*
Replace 'a' with two 'd's
Delete 'b'
*/
