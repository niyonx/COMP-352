import java.io.*;

public class ExpoTetranacci {
    private static long ExpoTet(int k) {
        if (k == 0 || k == 1 || k == 2) {
            return 0;
        } else if (k == 3) {
            return 1;
        } else {
            return ExpoTet(k - 1) + ExpoTet(k - 2) + ExpoTet(k - 3) + ExpoTet(k - 4);
        }
    }

    public static void main(String[] args) {
        try {
            PrintWriter writer = new PrintWriter(new FileOutputStream("out.txt", true));
            writer.println("\n************************************ Exponential Tetranacci ************************************\n");
            // 100 takes too much time, so I tested for 45 Tetranacci only
            for (int i = 0; i <= 45; i = i + 5) {
                long startTime = System.nanoTime();
                writer.print("The Tetranacci(" + i + ") sequence value is " + ExpoTet(i) + ".");
                long endTime = System.nanoTime();
                writer.println(" This method took " + (endTime - startTime) + " nanoseconds.");
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception.");
        }
    }
}
