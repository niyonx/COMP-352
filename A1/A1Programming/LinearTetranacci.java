import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class LinearTetranacci {
    private static long[] LinearTet(int k) {
        long[] A = new long[4];
        long i, j = 0, l = 0, m = 0;

        if (k == 0 || k == 1 || k == 2) {
            i = 0;

            A[0] = i;
            A[1] = j;
            A[2] = l;
            A[3] = m;
//            System.out.print((i + j + l + m) + " ");

            return (A);        // this will return (k, 0)
        } else if (k == 3) {
            i = 1;

            A[0] = i;
            A[1] = j;
            A[2] = l;
            A[3] = m;
//            System.out.print(m + " " + l + " " + j + " " + i + " ");

            return (A);        // this will return (k, 0)
        } else {
            A = LinearTet(k - 1);
            i = A[0];
            j = A[1];
            l = A[2];
            m = A[3];
//            System.out.print((i + j+ l + m) + " ");
            A[0] = i + j + l + m;
            A[1] = i;
            A[2] = j;
            A[3] = l;
            return (A);        // this will return (i+j+l+m, j)
        }
    }

    private static long getLinearTetranacci(int number) {
        return LinearTet(number)[0];
    }

    public static void main(String[] args) {
//        int n;
//        Scanner kb = new Scanner(System.in);
//
//        System.out.print("Please enter the a non-negative value to find its Tetranacci sequence: ");
//        n = kb.nextInt();

        try {
            PrintWriter writer = new PrintWriter(new FileOutputStream("out.txt"));
            writer.println("************************************ Linear Tetranacci ************************************\n");
            for (int i = 0; i <= 100; i = i + 5) {
                long startTime = System.nanoTime();
                writer.print("The Tetranacci(" + i + ") sequence value is " + getLinearTetranacci(i) + ".");
                long endTime = System.nanoTime();
                long duration = (endTime - startTime);
                writer.println(" This method took " + duration + " nanoseconds.");
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception.");
        }
//        kb.close();
    }
}
