package machine;

import java.util.Scanner;

public class CoffeeMachine {


    private static final Scanner scanner = new Scanner(System.in);
    private static int money = 550;   // dollars
    private static int water = 400;   // ml
    private static int milk = 540;    // ml
    private static int beans = 120;  // grams
    private static int cups = 9;      // disposable cups

    public static void printStatus() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println((beans + " of coffee beans"));
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money\n");
    }

    public static void buyCoffee() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:" );
        switch (scanner.nextInt()) {
            case 1: // espresso
                cups--;
                water -= 250;
                beans -= 16;
                money += 4;
                break;
            case 2: // latte
                cups--;
                water -= 350;
                milk -= 75;
                beans -= 20;
                money += 7;
                break;
            case 3: // cappuccino:
                cups--;
                water -= 200;
                milk -= 100;
                beans -= 12;
                money += 6;
                break;
        }
        System.out.println();
    }

    public static void fillMachine() {
        System.out.println("Write how many ml of water do you want to add:");
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        beans += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        cups += scanner.nextInt();
        System.out.println();
    }

    public static void takeMoney() {
        System.out.println("I gave you $" + money + "\n");
        money = 0;
    }

    public static void main(String[] args) {
        printStatus();

        System.out.println("Write action (buy, fill, take)");
        switch (scanner.next()) {
            case "buy":
                buyCoffee();
                break;
            case "fill":
                fillMachine();
                break;
            case "take":
                takeMoney();
                break;
        }
        printStatus();
    }
}
