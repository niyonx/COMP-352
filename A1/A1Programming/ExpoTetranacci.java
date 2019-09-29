import java.util.Scanner;

public class ExpoTetranacci {
    private static int ExpoTet(int k) {
        int tetraVal;

        if (k == 0 || k == 1 || k ==2) {
            tetraVal = 0;
        } else if(k==3) {
            tetraVal = 1;
        }else{
            tetraVal = ExpoTet(k - 1) + ExpoTet(k - 2) + ExpoTet(k - 3) + ExpoTet(k - 4);
        }
        return tetraVal;
    }

    public static void main(String[] args) {
        int n;
        Scanner kb = new Scanner(System.in);

        System.out.print("Please enter the a non-negative value to find its Tetranacci sequence: ");
        n = kb.nextInt();

        int tetVal = ExpoTet(n);
        System.out.println("\nThe Tetranacci(" + n + ") sequence is " + tetVal + ".");
        kb.close();
    }
}
