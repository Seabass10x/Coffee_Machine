import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        if (n == 0L || n == 1L) {
            return 1L;
        } else {
            for (long i = n - 1L; i > 0L; i--) {
                n *= i;
            }
        }
        return n;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}