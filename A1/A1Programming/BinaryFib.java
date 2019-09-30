import java.util.Scanner;

public class BinaryFib {
    private static int binFib(int k) {
        int fibVal;

        if (k == 0 || k == 1) {
            fibVal = k;
        } else {
            fibVal = binFib(k - 1) + binFib(k - 2);
        }
        return fibVal;
    }

    public static void main(String[] args) {
        int n;
        Scanner kb = new Scanner(System.in);

        System.out.print("Please enter the a non-negative value to find its Fibonacci sequence: ");
        n = kb.nextInt();

        int fibVal = binFib(n);
        System.out.println("\nThe Fibonacci value for n=" + n + " is " + fibVal + ".");
        kb.close();
    }
}
