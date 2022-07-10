import java.util.Scanner;

public class Main {

    /*
     * Write a method with the name sign that takes
     * an int number and checks whether the number
     * is negative, positive or zero.
     * @return The method should return -1, +1 or 0 respectively.
     */
    public static int sign(int number) {
        return number == 0 ? 0 : number > 0 ? 1 : -1;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
    }
}
