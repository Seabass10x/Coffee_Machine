import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int N = scanner.nextInt();
        int[][] sudoku = new int[N * N][N * N];
        String solved = "YES";

        for (int i = 0; i < N * N; i++) {
            for (int j = 0; j < N * N; j++) {
                sudoku[i][j] = scanner.nextInt();
            }
        }
        // Check rows
        for (int i = 0; i < N * N; i++) {
            int[] row = new int[N * N];
            if (N * N >= 0) System.arraycopy(sudoku[i], 0, row, 0, N * N);
            Arrays.sort(row);
            for (int k = 0; k < N * N; k++) {
                if (k + 1 != row[k]) {
                    solved = "NO";
                    break;
                }
            }
        }
        // Check columns
        for (int j = 0; j < N * N; j++) {
            int[] column = new int[N * N];
            for (int i = 0; i < N * N; i++) {
                column[i] = sudoku[i][j];
            }
            Arrays.sort(column);
            for (int k = 0; k < N * N; k++) {
                if (k + 1 != column[k]) {
                    solved = "NO";
                    break;
                }
            }
        }
        // Check N squares
        for (int n = 0; n < N; n++) {
            int[] nSquare = new int[N * N];
            int index = 0;
            for (int i = n * N; i < N * (n + 1); i++) {
                for (int j = n * N; j < N * (n + 1); j++) {
                    nSquare[index] = sudoku[i][j];
                    index++;
                }
            }
            Arrays.sort(nSquare);
            for (int k = 0; k < N * N; k++) {
                if (k + 1 != nSquare[k]) {
                    solved = "NO";
                    break;
                }
            }
        }
        System.out.println(solved);
    }
}