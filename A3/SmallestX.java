import java.util.Arrays;

public class SmallestX {
    public static int[] findSmallestX(int[] array, int x){
        int[] sortedArray = array.clone();
        int[] smallestX = new int[x];
        Arrays.sort(sortedArray);

        for (int i = 0; i < x ; i++){
            smallestX[i] = sortedArray[i];
        }
        return smallestX;
    }

    public static void main(String[] args) {
        int [] arr = {2 , 8 , 4, 22, 25, 11 ,16, 46, 3, 34};

        int [] smallest = findSmallestX(arr, 3);

        System.out.println(Arrays.toString(smallest));
    }
}
