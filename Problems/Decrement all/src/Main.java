import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num1 = scanner.nextInt() - 1;
        int num2 = scanner.nextInt() - 1;
        int num3 = scanner.nextInt() - 1;
        int num4 = scanner.nextInt() - 1;

        System.out.printf("%d %d %d %d", num1, num2, num3, num4);
    }
}