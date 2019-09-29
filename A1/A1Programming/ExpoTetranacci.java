import java.util.Scanner;

public class ExpoTetranacci {
    public static int ExpoTetranacci(int k) {
        int tetraVal;

        if (k == 0 || k == 1 || k ==2) {
            tetraVal = 0;
        } else if(k==3) {
            tetraVal = 1;
        }else{
            tetraVal = ExpoTetranacci(k - 1) + ExpoTetranacci(k - 2) + ExpoTetranacci(k - 3) + ExpoTetranacci(k - 4);
        }
        return tetraVal;
    }

    public static void main(String[] args) {
        int n;
        Scanner kb = new Scanner(System.in);

        System.out.print("Please enter the a non-negative value to find its Tetranacci sequence: ");
        n = kb.nextInt();

        int fibVal = ExpoTetranacci(n);
        System.out.println("\nThe Tetranacci value for n=" + n + " is " + fibVal + ".");
        kb.close();
    }
}
