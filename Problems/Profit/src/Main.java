import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double m = scanner.nextDouble(); // money
        double p = scanner.nextDouble() / 100; // percent of annual interest
        int k = scanner.nextInt(); // target
        int y = 0; // years

        if (k != m) {
            do {
                m += m * p;
                y++;
            } while (m < k);
        }
        System.out.println(y);
    }
}