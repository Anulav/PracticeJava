package collections.arrays;

public class ArrayPrograms1 {
    public static void main(String[] args) {
        int[] arr = {5,3,5,6,3,5};
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {  //Replace 5 with 0, in case 5 is preceded by 3
            {
                sum+=arr[i];
                if(arr[i]==3 && arr[i+1]==5){
                    arr[i+1]=0;
                }
            }
        }
        System.out.println("After");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        //Sum
        System.out.println("The sum is : "+ sum);

        char[] chars = {'s','s','e','d'};
        if(chars[0] == chars[chars.length-1]){
            System.out.println("First and last elements are same");
        }else
            System.out.println("Nope they are not!");

    }

}

/*
Output:
        After
        5 3 0 6 3 0 The sum is : 17
        Nope they are not!*/
