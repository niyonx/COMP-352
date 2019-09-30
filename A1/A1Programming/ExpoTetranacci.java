import java.io.*;
import java.util.Scanner;

public class ExpoTetranacci {
    private static long ExpoTet(int k) {
        long tetraVal;

        if (k == 0 || k == 1 || k == 2) {
            tetraVal = 0;
        } else if (k == 3) {
            tetraVal = 1;
        } else {
            tetraVal = ExpoTet(k - 1) + ExpoTet(k - 2) + ExpoTet(k - 3) + ExpoTet(k - 4);
        }
        return tetraVal;
    }

    public static void main(String[] args) {
//        int n;
//        Scanner kb = new Scanner(System.in);
//
//        System.out.print("Please enter the a non-negative value to find its Tetranacci sequence: ");
//        n = kb.nextInt();

//        int tetVal = ExpoTet(n);
        try {
            PrintWriter writer = new PrintWriter(new FileOutputStream("out.txt",true));
            writer.println("\n************************************ Exponential Tetranacci ************************************\n");
            for (int i = 0; i <= 100; i = i + 5) {
                long startTime = System.nanoTime();
                writer.print("The Tetranacci(" + i + ") sequence is " + ExpoTet(i) + ".");
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
