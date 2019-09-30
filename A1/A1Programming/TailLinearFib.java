import java.util.Scanner;

public class TailLinearFib
{
    private static int fib(int n, int a, int b )
    {
        if (n == 0)
            return a;
        if (n == 1)
            return b;
        return fib(n - 1, b, a + b);
    }

    public static void main(String[] args)
    {
        int n;
        Scanner kb = new Scanner(System.in);

        System.out.print("Please enter the a non-negative value to find its Fibonacci sequence: ");
        n = kb.nextInt();

        System.out.println("The Fibonacci(" + n +") sequence value is "+fib(n,0,1)+".\n");

        kb.close();
    }
}