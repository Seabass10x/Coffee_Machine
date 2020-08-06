import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] matrix4 = new char[4][4];

        for (int i = 0; i < 4; i++) {
            String colors = scanner.next();
            for (int j = 0; j < 4; j++) {
                matrix4[i][j] = colors.charAt(j);
            }
        }

        String isPretty = "YES";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix4[i][j] == matrix4[i][j + 1] &&
                        matrix4[i][j] == matrix4[i + 1][j] &&
                        matrix4[i][j] == matrix4[i + 1][j + 1]) {
                    isPretty = "NO";
                    break;
                }
            }
        }
        System.out.print(isPretty);
    }
}