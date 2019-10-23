import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    private static int noExec=0;
    public static int[] MyAlgorithm(int[] A, int n) {
        noExec++;
        boolean done = true;
        int temp;
        int j = 0;
        while (j <= n - 2) {
            if (A[j] > A[j + 1]) {
                temp = A[j];
                A[j] = A[j + 1];
                A[j + 1] = temp;
                done = false;
            }
            j++;
        }
        j = n - 1;
        while (j >= 1) {
            if (A[j] < A[j - 1]) {
                temp = A[j];
                A[j] = A[j - 1];
                A[j - 1] = temp;
            }
            j = j - 1;
        }
        if (!done)
            MyAlgorithm(A, n);
        return A;
    }

    public static void main(String[] args) {
        int[] array = new int[]{10,9,8,7,6,5,4,3,2,1};
        System.out.println("\nInitial Array: "+Arrays.toString(array));
        array = MyAlgorithm(array,array.length);
        System.out.println("Final Array: "+ Arrays.toString(array));
        System.out.println("Number of executions of MyAlgorithm: "+noExec);
    }
}