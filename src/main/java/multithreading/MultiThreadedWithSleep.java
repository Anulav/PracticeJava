package multithreading;

public class MultiThreadedWithSleep extends Thread{
    public static void main(String[] args) throws InterruptedException {
        MultiThreadedWithSleep mt = new MultiThreadedWithSleep();
        mt.start();
        for (int j = 0; j < 200 ; j++) {
            System.out.print(" j: "+j+" ");
            System.out.print(" "+Thread.currentThread().getName());
            Thread.sleep(100);
        }

    }
    public void run(){
        for (int i = 1; i < 200 ; i++) {
            System.out.print(" i: "+ i +" ");
            System.out.print(" "+Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/*
If we are waiting for a resource like connecting to the database and the resource is not ready we can use sleep for retrying in such cases.*/


/*
Output:
 i: 1  j: 0  main Thread-0 j: 1  i: 2  Thread-0 main i: 3  Thread-0 j: 2  main i: 4  j: 3  Thread-0 main i: 5  j: 4  Thread-0 main i: 6  j: 5  Thread-0 main i: 7  Thread-0 j: 6  main i: 8  j: 7  main Thread-0 j: 8  i: 9  main Thread-0 j: 9  i: 10  main Thread-0 j: 10  i: 11  main Thread-0 j: 11  main i: 12  Thread-0 j: 12  i: 13  main Thread-0 j: 13  i: 14  main Thread-0 j: 14  i: 15  main Thread-0 j: 15  i: 16  main Thread-0 j: 16  i: 17  main Thread-0 j: 17  main i: 18  Thread-0 j: 18  i: 19  main Thread-0 j: 19  main i: 20  Thread-0 j: 20  main i: 21  Thread-0 j: 21  main i: 22  Thread-0 j: 22  i: 23  main Thread-0 j: 23  i: 24  main Thread-0 j: 24  main i: 25  Thread-0 j: 25  main i: 26  Thread-0 j: 26  i: 27  Thread-0 main i: 28  Thread-0 j: 27  main i: 29  Thread-0 j: 28  main i: 30  j: 29  main Thread-0 j: 30  main i: 31  Thread-0 j: 31  i: 32  main Thread-0 j: 32  i: 33  Thread-0 main i: 34  j: 33  Thread-0 main i: 35  j: 34  Thread-0 main i: 36  Thread-0 j: 35  main i: 37  Thread-0 j: 36  main i: 38  j: 37  main Thread-0 j: 38  i: 39  main Thread-0 j: 39  i: 40  main Thread-0 j: 40  i: 41  main Thread-0 j: 41  i: 42  main Thread-0 j: 42  i: 43  main Thread-0 j: 43  main i: 44  Thread-0 j: 44  main i: 45  Thread-0 j: 45  i: 46  main Thread-0 j: 46  i: 47  main Thread-0 j: 47  main i: 48  Thread-0 j: 48  main i: 49  Thread-0 j: 49  i: 50  main Thread-0 i: 51  Thread-0 j: 50  main i: 52  Thread-0 j: 51  main i: 53  Thread-0 j: 52  main i: 54  Thread-0 j: 53  main i: 55  Thread-0 j: 54  main i: 56  Thread-0 j: 55  main i: 57  Thread-0 j: 56  main i: 58  Thread-0 j: 57  main i: 59  Thread-0 j: 58  main i: 60  Thread-0 j: 59  main i: 61  Thread-0 j: 60  main i: 62  Thread-0 j: 61  main i: 63  Thread-0 j: 62  main i: 64  Thread-0 j: 63  main i: 65  Thread-0 j: 64  main i: 66  Thread-0 j: 65  main i: 67  Thread-0 j: 66  main i: 68  Thread-0 j: 67  main i: 69  Thread-0 j: 68  main i: 70  Thread-0 j: 69  main i: 71  Thread-0 j: 70  main i: 72  Thread-0 j: 71  main i: 73  Thread-0 j: 72  main i: 74  Thread-0 j: 73  main i: 75  Thread-0 j: 74  main i: 76  Thread-0 j: 75  main i: 77  Thread-0 j: 76  main i: 78  Thread-0 j: 77  main i: 79  Thread-0 j: 78  main i: 80  Thread-0 j: 79  main i: 81  Thread-0 j: 80  main i: 82  Thread-0 j: 81  main i: 83  Thread-0 j: 82  main i: 84  Thread-0 j: 83  main i: 85  Thread-0 j: 84  main i: 86  Thread-0 j: 85  main i: 87  Thread-0 j: 86  main i: 88  Thread-0 j: 87  main i: 89  Thread-0 j: 88  main i: 90  Thread-0 j: 89  main i: 91  Thread-0 j: 90  main i: 92  Thread-0 j: 91  main i: 93  Thread-0 j: 92  main i: 94  Thread-0 j: 93  main i: 95  Thread-0 j: 94  main i: 96  Thread-0 j: 95  main i: 97  Thread-0 j: 96  main i: 98  Thread-0 j: 97  main i: 99  Thread-0 j: 98  main i: 100  Thread-0 j: 99  main i: 101  Thread-0 j: 100  main i: 102  Thread-0 j: 101  main i: 103  Thread-0 j: 102  main i: 104  Thread-0 j: 103  main i: 105  Thread-0 j: 104  main i: 106  Thread-0 j: 105  main i: 107  Thread-0 j: 106  main i: 108  Thread-0 j: 107  main i: 109  Thread-0 j: 108  main i: 110  Thread-0 j: 109  main i: 111  Thread-0 j: 110  main i: 112  Thread-0 j: 111  main i: 113  Thread-0 j: 112  main i: 114  Thread-0 j: 113  main i: 115  Thread-0 j: 114  main i: 116  Thread-0 j: 115  main i: 117  Thread-0 j: 116  main i: 118  Thread-0 j: 117  main i: 119  Thread-0 j: 118  main i: 120  Thread-0 j: 119  main i: 121  Thread-0 j: 120  main i: 122  Thread-0 j: 121  main i: 123  Thread-0 j: 122  main i: 124  Thread-0 j: 123  main i: 125  Thread-0 j: 124  main i: 126  Thread-0 j: 125  main i: 127  Thread-0 j: 126  main i: 128  Thread-0 j: 127  main i: 129  Thread-0 j: 128  main i: 130  Thread-0 j: 129  main i: 131  Thread-0 j: 130  main i: 132  Thread-0 j: 131  main i: 133  Thread-0 j: 132  main i: 134  Thread-0 j: 133  main i: 135  Thread-0 j: 134  main i: 136  Thread-0 j: 135  main i: 137  Thread-0 j: 136  main i: 138  Thread-0 j: 137  main i: 139  Thread-0 j: 138  main i: 140  Thread-0 j: 139  main i: 141  Thread-0 j: 140  main i: 142  Thread-0 j: 141  main i: 143  Thread-0 j: 142  main i: 144  Thread-0 j: 143  main i: 145  Thread-0 j: 144  main i: 146  Thread-0 j: 145  main i: 147  Thread-0 j: 146  main i: 148  Thread-0 j: 147  main i: 149  Thread-0 j: 148  main i: 150  Thread-0 j: 149  main i: 151  Thread-0 j: 150  main i: 152  Thread-0 j: 151  main i: 153  Thread-0 j: 152  main i: 154  Thread-0 j: 153  main i: 155  Thread-0 j: 154  main i: 156  Thread-0 j: 155  main i: 157  Thread-0 j: 156  main i: 158  Thread-0 j: 157  main i: 159  Thread-0 j: 158  main i: 160  Thread-0 j: 159  main i: 161  Thread-0 j: 160  main i: 162  Thread-0 j: 161  main i: 163  Thread-0 j: 162  main i: 164  Thread-0 j: 163  main i: 165  Thread-0 j: 164  main i: 166  Thread-0 j: 165  main i: 167  Thread-0 j: 166  main i: 168  Thread-0 j: 167  main i: 169  Thread-0 j: 168  main i: 170  Thread-0 j: 169  main i: 171  Thread-0 j: 170  main i: 172  Thread-0 j: 171  main i: 173  Thread-0 j: 172  main i: 174  Thread-0 j: 173  main i: 175  Thread-0 j: 174  main i: 176  Thread-0 j: 175  main i: 177  Thread-0 j: 176  main i: 178  Thread-0 j: 177  main i: 179  Thread-0 j: 178  main i: 180  Thread-0 j: 179  main i: 181  Thread-0 j: 180  main i: 182  Thread-0 j: 181  main i: 183  Thread-0 j: 182  main i: 184  Thread-0 j: 183  main i: 185  Thread-0 j: 184  main i: 186  Thread-0 j: 185  main i: 187  Thread-0 j: 186  main i: 188  Thread-0 j: 187  main i: 189  Thread-0 j: 188  main i: 190  Thread-0 j: 189  main i: 191  Thread-0 j: 190  main i: 192  Thread-0 j: 191  main i: 193  Thread-0 j: 192  main i: 194  Thread-0 j: 193  main i: 195  Thread-0 j: 194  main i: 196  Thread-0 j: 195  main i: 197  Thread-0 j: 196  main i: 198  Thread-0 j: 197  main i: 199  Thread-0 j: 198  main j: 199  main
Takes about 1/10 of a second for printing each element.
*/
