import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100); // set random values to the array
        }

        System.out.println("Дан массив: " + Arrays.toString(arr));
        System.out.println("Минимальное значение массива = " + findMinElement(arr));
    }

    /*
     * Method helps to find the minimal element of the array
     * Example input: 3, 15, 4, 1, 90
     * output: 1
     */
    static int findMinElement(int[] array) {
        Arrays.sort(array);
        return array[0];
    }
}
