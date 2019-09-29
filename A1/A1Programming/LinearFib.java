import java.util.Scanner;

public class LinearFib
{
    public static int[]  linearFib(int k)
    {
        int[] A = new int[2];
        int i = 0, j = 0;

        if (k == 0)
        {
            i=k;
            j=0;

            A[0] = i; A[1] = j;
            System.out.print((i+j) + " ");

            return (A);		// this will return (k, 0)
        }
        else if (k == 1)
        {
            i=k;
            j=0;

            A[0] = i; A[1] = j;
            System.out.print(j + " " + i + " ");

            return (A);		// this will return (k, 0)
        }
        else
        {

            A = linearFib(k - 1);
            i = A[0];
            j = A[1];
            System.out.print((i+j) + " ");
            A[0] = i + j;
            A[1] = i;
            return (A);		// this will return (i+j, j)
        }
    }
    public static void main(String[] args)
    {
        int n;
        Scanner kb = new Scanner(System.in);

        System.out.print("Please enter the a non-negative value to find its Fibonacci sequence: ");
        n = kb.nextInt();

        System.out.println("Here is the Fibonacci(" + n +") sequence\n");

        linearFib(n);
        kb.close();
    }
}
