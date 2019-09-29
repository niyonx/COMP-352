import javax.sound.sampled.Line;
import java.util.Scanner;

public class LinearTetranacci {
    private static int[] LinearTet(int k) {
        int[] A = new int[4];
        int i, j=0, l=0, m=0;

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
            return (A);        // this will return (i+j, j)
        }
    }

    private static int getLinearTetranacci(int number){
        return LinearTet(number)[0];
    }

    public static void main(String[] args) {
        int n;
        Scanner kb = new Scanner(System.in);

        System.out.print("Please enter the a non-negative value to find its Tetranacci sequence: ");
        n = kb.nextInt();

        System.out.println("\nThe Tetranacci(" + n + ") sequence value is "+getLinearTetranacci(n)+ ".");
        kb.close();
    }
}
