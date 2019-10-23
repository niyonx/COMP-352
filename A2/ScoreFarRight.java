import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.sql.SQLOutput;
import java.util.Arrays;

public class ScoreFarRight {

    static boolean play(int[] array, boolean[] arrayValid, int pos) {
        if (array[pos] == 0) {
            return true;
        } else if (!checkLeft(array, arrayValid, pos) && !checkRight(array, arrayValid, pos)) {
            return false;
        } else if (checkLeft(array, arrayValid, pos) && checkRight(array, arrayValid, pos)) {
            arrayValid[pos] = false;
            return play(array, arrayValid, goLeftPos(array, pos)) || play(array, arrayValid, goRightPos(array, pos));
        } else if (checkLeft(array, arrayValid, pos) && !checkRight(array, arrayValid, pos)) {
            arrayValid[pos] = false;
            return play(array, arrayValid, goLeftPos(array, pos));
        } else if (!checkLeft(array, arrayValid, pos) && checkRight(array, arrayValid, pos)) {
            arrayValid[pos] = false;
            return play(array, arrayValid, goRightPos(array, pos));
        }
        return false;
    }

    static int goLeftPos(int[] array, int pos) {
        return pos - array[pos];
    }

    static int goRightPos(int[] array, int pos) {
        return pos + array[pos];
    }

    static boolean checkLeft(int[] array, boolean[] arrayValid, int pos) {
        int newPos = pos - array[pos];
        if (newPos >= 0) {
            return (arrayValid[pos - array[pos]]);
        }
        return false;
    }

    static boolean checkRight(int[] array, boolean[] arrayValid, int pos) {
        int newPos = pos + array[pos];
        if (newPos <= array.length - 1) {
            return (arrayValid[pos + array[pos]]);
        }
        return false;
    }

    static int[] generateArray(int size){
        int[] myArr = new int[size];
        for (int i = 0; i < myArr.length - 1; i++) {
            myArr[i] = (int) ((Math.random() * ((myArr.length - 1) + 1)) + 1);
        }
        myArr[myArr.length - 1] = 0;
        return myArr;
    }

    static boolean[] initializeArray(int[] myArr){
        boolean[] arrValid = new boolean[myArr.length];
        for (int i = 0; i < myArr.length; i++) {
            arrValid[i] = true;
        }
        return arrValid;
    }

    public static void main(String[] args) {
//        int[] array = {4,1,7,7,0};
//        boolean[] arrayValid = new boolean[array.length];
//        for (int i = 0; i < array.length; i++){
//            arrayValid[i] = true;
//        }
//        System.out.println(play(array,arrayValid,1));
        try {
            PrintWriter writer = new PrintWriter(new FileOutputStream("testLog.txt"));
            writer.println("\n************************************ 20 test logs for different row sizes and square values ************************************\n");

            int[] arr1 = {4,8,5,2,3,5,1,6,4,0};
            boolean[] arr1Valid = initializeArray(arr1);
            writer.println("Test " + 1 + ": " + Arrays.toString(arr1));
            writer.println(play(arr1, arr1Valid, 0)+"\n");

            int[] arr2 = {5,8,2,3,1,5,0};
            boolean[] arr2Valid = initializeArray(arr2);
            writer.println("Test " + 2 + ": " + Arrays.toString(arr2));
            writer.println(play(arr2, arr2Valid, 0)+"\n");

            int i = 3;
            for (int j = 5; j < 14; j++) {
                int[] myArr = generateArray(j);
                boolean[] arrValid = initializeArray(myArr);
                writer.println("Test " + i + ": " + Arrays.toString(myArr));
                writer.println(play(myArr, arrValid, 0)+"\n");
                i++;
                int[] myArr2 = generateArray(j);
                boolean[] arrValid2 = initializeArray(myArr);
                writer.println("Test " + i + ": " + Arrays.toString(myArr));
                writer.println(play(myArr2, arrValid2, 0)+"\n");
                i++;
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception.");
        }
    }
}
