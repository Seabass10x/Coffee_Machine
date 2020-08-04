import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int shipped = 0;
        int fixed = 0;
        int rejects = 0;

        for (int i = 0; i < n; i++) {
            int size = scanner.nextInt();
            if (size == 0) {
                shipped++;
            } else if (size == 1) {
                fixed++;
            } else {
                rejects++;
            }
        }
        System.out.printf("%d %d %d", shipped, fixed, rejects);
    }
}