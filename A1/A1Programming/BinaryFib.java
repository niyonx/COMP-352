import java.util.Scanner;

public class BinaryFib {
    public static int binaryFib(int k) {
        int fibVal;

        if (k == 0 || k == 1) {
            fibVal = k;
        } else {
            fibVal = binaryFib(k - 1) + binaryFib(k - 2);
        }
        return fibVal;
    }

    public static void main(String[] args) {
        int n;
        Scanner kb = new Scanner(System.in);

        System.out.print("Please enter the a non-negative value to find its Fibonacci sequence: ");
        n = kb.nextInt();

        int fibVal = binaryFib(n);
        System.out.println("\n The Fibonacci value for n=" + n + " is:" + fibVal + ".");
        kb.close();
    }
}
