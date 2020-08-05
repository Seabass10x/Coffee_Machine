package machine;

import java.util.Scanner;

public class CoffeeMachine {


    private static final Scanner scanner = new Scanner(System.in);
    private static int money = 550;   // dollars
    private static int water = 400;   // ml
    private static int milk = 540;    // ml
    private static int beans = 120;   // grams
    private static int cups = 9;      // disposable cups
    private static final int WATER_PER_ESPRESSO = 250;
    private static final int BEANS_PER_ESPRESSO = 16;
    private static final int COST_PER_ESPRESSO = 4;
    private static final int WATER_PER_LATTE = 350;
    private static final int MILK_PER_LATTE = 75;
    private static final int BEANS_PER_LATTE = 20;
    private static final int COST_PER_LATTE = 7;
    private static final int WATER_PER_CAPPUCCINO = 200;
    private static final int MILK_PER_CAPPUCCINO = 100;
    private static final int BEANS_PER_CAPPUCCINO = 12;
    private static final int COST_PER_CAPPUCCINO = 6;

    public static void printStatus() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money\n");
    }

    public static boolean haveEnoughFor(int typeOfCoffee) {
        if (cups == 0) {
            System.out.println("Sorry, not enough disposable cups!\n");
            return false;
        }
        switch (typeOfCoffee) {
            case 1: // espresso
                if (water < WATER_PER_ESPRESSO) {
                    System.out.println("Sorry, not enough water!\n");
                    return false;
                }
                if (beans < BEANS_PER_ESPRESSO) {
                    System.out.println("Sorry, not enough beans!\n");
                    return false;
                }
                break;
            case 2: // latte
                if (water < WATER_PER_LATTE) {
                    System.out.println("Sorry, not enough water\n");
                    return false;
                }
                if (milk < MILK_PER_LATTE) {
                    System.out.println("Sorry, not enough milk!\n");
                    return false;
                }
                if (beans < BEANS_PER_LATTE) {
                    System.out.println("Sorry, not enough beans!\n");
                    return false;
                }
                break;
            case 3: // cappuccino
                if (water < WATER_PER_CAPPUCCINO) {
                    System.out.println("Sorry, not enough water!\n");
                    return false;
                }
                if (milk < MILK_PER_CAPPUCCINO) {
                    System.out.println("Sorry, not enough milk!\n");
                    return false;
                }
                if (beans < BEANS_PER_CAPPUCCINO) {
                    System.out.println("Sorry, not enough beans!\n");
                    return false;
                }
                break;
        }
        return true;
    }

    public static void buyCoffee() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:" );
        if (scanner.hasNextInt()) {
            int typeOfCoffee = scanner.nextInt();
            if (haveEnoughFor(typeOfCoffee)) {
                System.out.println("I have enough resources, making you a coffee!\n");
                switch (typeOfCoffee) {
                    case 1: // espresso
                        cups--;
                        water -= WATER_PER_ESPRESSO;
                        beans -= BEANS_PER_ESPRESSO;
                        money += COST_PER_ESPRESSO;
                        break;
                    case 2: // latte
                        cups--;
                        water -= WATER_PER_LATTE;
                        milk -= MILK_PER_LATTE;
                        beans -= BEANS_PER_LATTE;
                        money += COST_PER_LATTE;
                        break;
                    case 3: // cappuccino:
                        cups--;
                        water -= WATER_PER_CAPPUCCINO;
                        milk -= MILK_PER_CAPPUCCINO;
                        beans -= BEANS_PER_CAPPUCCINO;
                        money += COST_PER_CAPPUCCINO;
                        break;
                }
            }
        }
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

    public static void showMainMenu() {
        String action;
        do {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = scanner.next();
            switch (action) {
                case "buy":
                    buyCoffee();
                    break;
                case "fill":
                    fillMachine();
                    break;
                case "take":
                    takeMoney();
                    break;
                case "remaining":
                    printStatus();
                    break;
                default:
                    break;
            }
        } while (!action.equals("exit"));
    }

    public static void main(String[] args) {
        showMainMenu();
    }
}
