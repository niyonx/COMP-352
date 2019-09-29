import java.util.Scanner;

public class LinearTetranacci {
    public static int[] LinearTetranacci(int k) {
        int[] A = new int[4];
        int i = 0, j = 0, l=0, m = 0;

        if (k == 0 || k == 1 || k == 2) {
            i = 0;
            j = 0;
            l = 0;
            m = 0;

            A[0] = i;
            A[1] = j;
            A[2] = l;
            A[3] = m;
            System.out.print((i + j + l + m) + " ");

            return (A);        // this will return (k, 0)
        } else if (k == 3) {
            i = 1;
            j = 0;
            l = 0;
            m = 0;

            A[0] = i;
            A[1] = j;
            A[2] = l;
            A[3] = m;
            System.out.print(m + " " + l + " " + j + " " + i + " ");

            return (A);        // this will return (k, 0)
        } else {
            A = LinearTetranacci(k - 1);
            i = A[0];
            j = A[1];
            l = A[2];
            m = A[3];
            System.out.print((i + j+ l + m) + " ");
            A[0] = i + j + l + m;
            A[1] = i;
            A[2] = j;
            A[3] = l;
            return (A);        // this will return (i+j, j)
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner kb = new Scanner(System.in);

        System.out.print("Please enter the a non-negative value to find its Tetranacci sequence: ");
        n = kb.nextInt();

        System.out.println("Here is the Tetranacci(" + n + ") sequence\n");

        LinearTetranacci(n);
        kb.close();
    }
}
