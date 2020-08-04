import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num = scanner.nextInt();
        int singlesDigit = num % 10;
        int tensDigit = (num / 10) % 10;
        int hundredsDigit = num / 100;
        int sumOfDigits = singlesDigit + tensDigit + hundredsDigit;

        System.out.println(sumOfDigits);
    }
}