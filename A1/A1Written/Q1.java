import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        int[] myArray = new int[]{1, 5, 9, 16, 4, 7, 2, 3};
        int temp = 0;
        System.out.println(Arrays.toString(myArray));
        for (int i = 0; i < myArray.length; i++) {
            if (i < myArray.length / 2) {
                temp = myArray[i];
                myArray[i] = myArray[i + 1];
                myArray[i+1] = temp;
                i++;
            } else if (i > myArray.length / 2) {
                if (myArray.length%2==0 && i == (myArray.length/2) +1){
                    i--;
                }
                myArray[i + 1] = myArray[i] * myArray[i + 1];
                i++;
            }
        }
        System.out.println(Arrays.toString(myArray));
    }
}
