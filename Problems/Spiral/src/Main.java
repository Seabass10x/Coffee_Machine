import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] spiral = new int[n][n];
        int count = 1;

        while (count <= n * n) {
            for (int r = 0; r < (n + 1) / 2; r++) { // # of revolutions
                for (int i = r; i == r; i++) {
                    for (int j = r; j < n - r; j++) {
                        spiral[i][j] = count++;
                    }
                }
                for (int i = r + 1; i < n - r; i++) {
                    for (int j = n - r - 1; j == n - r - 1; j++) {
                        spiral[i][j] = count++;
                    }
                }
                for (int i = n - r - 1; i == n - r - 1; i++) {
                    for (int j = n - r - 2; j >= r; j--) {
                        spiral[i][j] = count++;
                    }
                }
                for (int i = n - r - 2; i > r; i--) {
                    for (int j = r; j == r; j++) {
                        spiral[i][j] = count++;
                    }
                }
            }
        }
        for (int[] row: spiral) {
            for (int num: row) {
                System.out.print(num + " ");
            }
            System.out.print('\n');
        }
    }
}