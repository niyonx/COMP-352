import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class TailLinearTetranacci {
    private static long tet(long n, long a, long b, long c, long d)
    {
        if (n == 0 || n == 1 || n==2)
            return 0;
        if (n == 3)
            return d;
        return tet(n - 1, b, c, d, a + b + c + d);
    }

    public static void main(String[] args) {
        try {
            PrintWriter writer = new PrintWriter(new FileOutputStream("out.txt", true));
            writer.println("\n************************************ Tail Linear Tetranacci ************************************\n");
            for (long i = 0; i <= 100; i = i + 5) {
                long startTime = System.nanoTime();
                writer.print("The Tetranacci(" + i + ") sequence value is " + tet(i,0,0,0,1) + ".");
                long endTime = System.nanoTime();
                long duration = (endTime - startTime);
                writer.println(" This method took " + duration + " nanoseconds.");
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception.");
        }
    }
}
