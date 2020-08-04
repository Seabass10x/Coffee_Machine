import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // scan initial numbers to compare
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        boolean ordered = true;

        // account for initial numbers equalling themselves
        while (num1 == num2) {
            num1 = num2;
            num2 = scanner.nextInt();
        }
        // ascending order case
        if (num1 < num2) {
            num1 = num2;
            num2 = scanner.nextInt();
            while (num2 != 0) {
                if (num1 <= num2) {
                    num1 = num2;
                    num2 = scanner.nextInt();
                } else {
                    ordered = false;
                    break;
                }
            }
        // descending order case
        } else if (num1 > num2 && num2 != 0) { // accounts for second number being 0
            num1 = num2;
            num2 = scanner.nextInt();
            while (num2 != 0) {
                if (num1 >= num2) {
                    num1 = num2;
                    num2 = scanner.nextInt();
                } else {
                    ordered = false;
                    break;
                }
            }
        }
        System.out.println(ordered);
    }
}