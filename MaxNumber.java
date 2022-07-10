public class Main {
    public static void main(String[] args) {
        System.out.println("Максимальное число это - " + getMaxInteger(12, 21, 13));
    }

    static int getMaxInteger(int a, int b, int c) {
        int[] arr = {a, b, c};
        int max = Integer.MIN_VALUE;
        for (int element : arr) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }
}
