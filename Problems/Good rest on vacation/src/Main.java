import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int days = scanner.nextInt();
        int nights = days - 1;
        int foodCostPerDay = scanner.nextInt();
        int oneWayFlightCost = scanner.nextInt();
        int oneNightHotelCost = scanner.nextInt();

        System.out.println((oneWayFlightCost * 2) + (foodCostPerDay * days) + (oneNightHotelCost * nights));
    }
}