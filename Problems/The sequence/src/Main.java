import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int i = 0;

        for (int j = 1;;j++) {
            for (int k = 0; k < j; k++) {
                System.out.print(j + " ");
                i++;
                if (i == n) {
                    break;
                }
            }
            if (i == n) {
                break;
            }
        }
    }
}