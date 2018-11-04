/*
 * Exercise 1-1
 */
public class Main {

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {3,1,4,1,5,9,2,6};
        showReversedArray(array1);
        showReversedArray(array2);
    }

    /*
     * Reverse an array and print it in the standard output
     * @param a the input array
     */
    public static void showReversedArray(int[] a) {
        // TODO
        for(int i = 0; i < a.length;i++ )
        {
            int temp = a[i];
            a[i] = a[a.length - i];
            a[a.length - 1] = temp;
        }
        for(int i = 0; i < a.length;i++ ){
            System.out.print(a[i]);
        }

    }

}
