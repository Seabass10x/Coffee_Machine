import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        int startIndex = scanner.nextInt();
        int stopIndex = scanner.nextInt() + 1;
        String substr = str.substring(startIndex, stopIndex);

        System.out.println(substr);
    }
}