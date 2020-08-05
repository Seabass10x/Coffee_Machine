import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int SIZE_OF_ARRAY = scanner.nextInt();
        int[] array = new int[SIZE_OF_ARRAY];
        for (int i = 0; i < SIZE_OF_ARRAY; i++) {
            array[i] = scanner.nextInt();
        }

        int ascendingOrder = 1;
        int maxAscendingOrder = 1;
        for (int i = 1; i < SIZE_OF_ARRAY; i++) {
            if (array[i - 1] <=  array[i]) {
                ascendingOrder += 1;
            } else {
                if (ascendingOrder > maxAscendingOrder) {
                    maxAscendingOrder = ascendingOrder;
                }
                ascendingOrder = 1;
            }
        }
        System.out.println(Math.max(ascendingOrder, maxAscendingOrder));
    }
}