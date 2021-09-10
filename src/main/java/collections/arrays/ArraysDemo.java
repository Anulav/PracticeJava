package collections.arrays;

public class ArraysDemo {

    public static void main(String[] args) {
        //    int arr[5]; Wrong Syntax
        int arr[] = {1,2,3,4,5};
        int arr2[] = new int[5]; //Arrays are objects in Java hence we can use new keyword for creation.But need to specify size while creation
            arr2[0] = 1;
            arr2[1] = new Integer(10); //Autoboxing

        for (int e: arr) { //Limitations 1.Only forward direction 2.One element at a time.
            System.out.println(e);
        }
        int arr3[] = new int[3];

        for (int e: arr3) {
            System.out.println(e); //Gives 0 as the array, if not initialised will be initialised with the default value
                                    // according to datatype.
        }

        //2D arrays
        int[][] _2d = new int[2][2];
        int[][] _2d_1 = {{1,2},{2,3},{3,4}};
        for (int i = 0; i < 2 ; i++) {
            for (int j = 0; j < 2 ; j++) {
                System.out.print(_2d_1[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
