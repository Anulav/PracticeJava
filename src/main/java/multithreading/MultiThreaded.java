package multithreading;

public class MultiThreaded extends Thread{
    public static void main(String[] args) {
        MultiThreaded mt = new MultiThreaded();
        mt.start();
        for (int j = 0; j < 200 ; j++) {
            System.out.print(" j: "+j+" ");
            System.out.print(" "+Thread.currentThread().getName());
        }

    }
    public void run(){
        for (int i = 1; i < 200 ; i++) {
            System.out.print(" i: "+ i +" ");
            System.out.print(" "+Thread.currentThread().getName());
        }
    }
}

//Execution switches between both the threads: main and Thread-0. And the program ends till all the thread completes execution.

/*
Output:
 i: 1  j: 0  Thread-0 i: 2  Thread-0 i: 3  Thread-0 i: 4  Thread-0 i: 5  Thread-0 i: 6  main Thread-0 j: 1  i: 7  main Thread-0 j: 2  i: 8  main Thread-0 j: 3  i: 9  main Thread-0 j: 4  i: 10  main Thread-0 j: 5  i: 11  main Thread-0 j: 6  i: 12  main Thread-0 j: 7  i: 13  main Thread-0 j: 8  i: 14  main Thread-0 j: 9  i: 15  main Thread-0 j: 10  i: 16  main Thread-0 j: 11  i: 17  main Thread-0 j: 12  i: 18  main Thread-0 j: 13  i: 19  main Thread-0 j: 14  i: 20  main Thread-0 j: 15  i: 21  main Thread-0 j: 16  i: 22  main Thread-0 j: 17  i: 23  main Thread-0 j: 18  i: 24  main Thread-0 i: 25  j: 19  Thread-0 main i: 26  j: 20  Thread-0 main i: 27  j: 21  Thread-0 main i: 28  Thread-0 j: 22  i: 29  main Thread-0 j: 23  i: 30  main Thread-0 j: 24  i: 31  main Thread-0 j: 25  i: 32  main Thread-0 j: 26  i: 33  main Thread-0 j: 27  i: 34  main Thread-0 j: 28  i: 35  main Thread-0 j: 29  i: 36  main Thread-0 j: 30  i: 37  main Thread-0 j: 31  i: 38  main Thread-0 j: 32  i: 39  main Thread-0 j: 33  i: 40  main Thread-0 j: 34  i: 41  main Thread-0 i: 42  Thread-0 i: 43  Thread-0 i: 44  j: 35  Thread-0 main i: 45  j: 36  Thread-0 main i: 46  j: 37  Thread-0 main i: 47  j: 38  Thread-0 main i: 48  j: 39  Thread-0 main i: 49  j: 40  Thread-0 main i: 50  j: 41  Thread-0 main i: 51  j: 42  Thread-0 main i: 52  j: 43  Thread-0 main i: 53  j: 44  Thread-0 main i: 54  j: 45  Thread-0 main i: 55  j: 46  Thread-0 main i: 56  j: 47  Thread-0 main i: 57  j: 48  Thread-0 main i: 58  j: 49  Thread-0 main i: 59  j: 50  Thread-0 main i: 60  j: 51  Thread-0 main i: 61  Thread-0 j: 52  i: 62  main Thread-0 j: 53  i: 63  main Thread-0 j: 54  i: 64  main Thread-0 j: 55  i: 65  main Thread-0 j: 56  i: 66  main Thread-0 j: 57  i: 67  main Thread-0 j: 58  i: 68  main Thread-0 j: 59  i: 69  main Thread-0 j: 60  i: 70  main Thread-0 j: 61  i: 71  main Thread-0 j: 62  i: 72  main Thread-0 j: 63  i: 73  main j: 64  Thread-0 main i: 74  j: 65  Thread-0 main i: 75  j: 66  Thread-0 main i: 76  j: 67  Thread-0 main i: 77  j: 68  Thread-0 main i: 78  j: 69  Thread-0 main i: 79  j: 70  Thread-0 main i: 80  j: 71  Thread-0 main i: 81  j: 72  Thread-0 main i: 82  j: 73  Thread-0 main i: 83  j: 74  Thread-0 main i: 84  j: 75  Thread-0 main i: 85  j: 76  Thread-0 main i: 86  j: 77  Thread-0 main i: 87  j: 78  Thread-0 main i: 88  j: 79  Thread-0 main i: 89  j: 80  Thread-0 main i: 90  j: 81  Thread-0 main i: 91  j: 82  Thread-0 main i: 92  j: 83  Thread-0 main i: 93  j: 84  Thread-0 main i: 94  j: 85  Thread-0 main i: 95  j: 86  Thread-0 main i: 96  j: 87  Thread-0 main i: 97  j: 88  Thread-0 main i: 98  j: 89  Thread-0 main i: 99  j: 90  Thread-0 main i: 100  Thread-0 i: 101  Thread-0 i: 102  Thread-0 i: 103  Thread-0 i: 104  Thread-0 i: 105  Thread-0 i: 106  Thread-0 i: 107  Thread-0 i: 108  Thread-0 i: 109  Thread-0 i: 110  Thread-0 i: 111  Thread-0 i: 112  Thread-0 i: 113  Thread-0 i: 114  Thread-0 i: 115  Thread-0 i: 116  Thread-0 i: 117  Thread-0 i: 118  Thread-0 i: 119  Thread-0 i: 120  j: 91  Thread-0 main i: 121  j: 92  Thread-0 main i: 122  j: 93  Thread-0 main i: 123  j: 94  Thread-0 main i: 124  j: 95  Thread-0 main i: 125  j: 96  Thread-0 main i: 126  j: 97  Thread-0 main i: 127  j: 98  Thread-0 main i: 128  j: 99  Thread-0 main i: 129  j: 100  Thread-0 main j: 101  i: 130  Thread-0 main i: 131  j: 102  Thread-0 main i: 132  j: 103  Thread-0 main i: 133  j: 104  Thread-0 main i: 134  j: 105  Thread-0 main i: 135  j: 106  Thread-0 main i: 136  j: 107  Thread-0 main i: 137  j: 108  Thread-0 main i: 138  j: 109  Thread-0 main i: 139  j: 110  Thread-0 main i: 140  j: 111  Thread-0 main i: 141  j: 112  Thread-0 main i: 142  j: 113  Thread-0 main i: 143  j: 114  Thread-0 main i: 144  j: 115  Thread-0 main i: 145  j: 116  Thread-0 main i: 146  j: 117  Thread-0 main i: 147  j: 118  Thread-0 main i: 148  j: 119  Thread-0 main i: 149  j: 120  Thread-0 main i: 150  j: 121  Thread-0 main i: 151  j: 122  Thread-0 main i: 152  j: 123  Thread-0 main i: 153  j: 124  Thread-0 main i: 154  j: 125  Thread-0 main i: 155  j: 126  Thread-0 main i: 156  j: 127  Thread-0 main i: 157  j: 128  Thread-0 main i: 158  j: 129  Thread-0 main i: 159  j: 130  Thread-0 main i: 160  j: 131  Thread-0 main i: 161  j: 132  Thread-0 main i: 162  j: 133  Thread-0 main i: 163  j: 134  Thread-0 main j: 135  main j: 136  main i: 164  j: 137  Thread-0 main i: 165  j: 138  Thread-0 main i: 166  j: 139  Thread-0 main i: 167  j: 140  Thread-0 main i: 168  j: 141  Thread-0 main i: 169  j: 142  Thread-0 main i: 170  j: 143  Thread-0 main i: 171  j: 144  Thread-0 main i: 172  j: 145  Thread-0 i: 173  main Thread-0 j: 146  i: 174  main Thread-0 j: 147  i: 175  main Thread-0 j: 148  i: 176  main Thread-0 j: 149  i: 177  main Thread-0 j: 150  i: 178  main Thread-0 j: 151  i: 179  main Thread-0 j: 152  i: 180  main Thread-0 j: 153  i: 181  main Thread-0 j: 154  i: 182  main Thread-0 j: 155  i: 183  main Thread-0 i: 184  j: 156  Thread-0 main i: 185  j: 157  Thread-0 main i: 186  j: 158  Thread-0 main i: 187  j: 159  Thread-0 main i: 188  j: 160  Thread-0 main i: 189  Thread-0 i: 190  Thread-0 i: 191  Thread-0 i: 192  j: 161  Thread-0 main j: 162  i: 193  main Thread-0 j: 163  i: 194  main Thread-0 j: 164  i: 195  main Thread-0 j: 165  i: 196  main Thread-0 j: 166  i: 197  main Thread-0 j: 167  i: 198  main Thread-0 j: 168  i: 199  main Thread-0 j: 169  main j: 170  main j: 171  main j: 172  main j: 173  main j: 174  main j: 175  main j: 176  main j: 177  main j: 178  main j: 179  main j: 180  main j: 181  main j: 182  main j: 183  main j: 184  main j: 185  main j: 186  main j: 187  main j: 188  main j: 189  main j: 190  main j: 191  main j: 192  main j: 193  main j: 194  main j: 195  main j: 196  main j: 197  main j: 198  main j: 199  main
*/
