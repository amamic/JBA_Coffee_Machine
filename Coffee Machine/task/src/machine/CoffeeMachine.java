package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        startMachine();
        action();
    }

    public static void action() {
        Scanner s = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take):");
        String actionPicked = s.next();
        switch (actionPicked) {
            case "buy":
                buyFromMachine();
                break;
            case "fill":
                fillMachine();
                break;
            case "take":
                takeMoneyFromMachine();
                break;
        }
    }

    public static void startMachine() {
        int startWater = 400, startMilk = 540, startBeans = 120, startCups = 9, startMoney = 550;
        System.out.println("The coffee machine has: \n" + startWater + " ml of water\n" + startMilk + " ml of milk\n" +
                startBeans + " g of coffee beans\n" + startCups + " disposable cups\n$" + startMoney + " of money");
        System.out.println();
    }

    public static void fillMachine() {
        Scanner s = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add:");
        int fillWater = s.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        int fillMilk = s.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        int fillBeans = s.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add: ");
        int fillCups = s.nextInt();

        System.out.println("The coffee machine has: \n" + (400 + fillWater) + " ml of water\n"
                + (540 + fillMilk) + " ml of milk\n" + (120 + fillBeans) + " g of coffee beans\n"
                + (9 + fillCups) + " disposable cups\n$550 of money");
    }

    public static void buyFromMachine() {
        int startWater = 400, startMilk = 540, startBeans = 120, startCups = 9, startMoney = 550;
        Scanner s = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        int chooseCoffee = s.nextInt();
        System.out.println();
        switch (chooseCoffee) {
            case 1:
                System.out.println("The coffee machine has: \n" + (startWater - 250) + " ml of water\n" +
                        startMilk + " ml of milk\n" + (startBeans - 16) + " g of coffee beans\n"
                        + (startCups - 1) + " disposable cups\n$" + (startMoney + 4) + " of money");
                break;
            case 2:
                System.out.println("The coffee machine has: \n" + (startWater - 350) + " ml of water\n" +
                        (startMilk - 75) + " ml of milk\n" + (startBeans - 20) + " g of coffee beans\n"
                        + (startCups - 1) + " disposable cups\n$" + (startMoney + 7) + " of money");
                break;
            case 3:
                System.out.println("The coffee machine has: \n" + (startWater - 200) + " ml of water\n" +
                        (startMilk - 100) + " ml of milk\n" + (startBeans - 12) + " g of coffee beans\n"
                        + (startCups - 1) + " disposable cups\n$" + (startMoney + 6) + " of money");
                break;
        }
    }

    public static void takeMoneyFromMachine() {
        System.out.println("I gave you $550");
        System.out.println();
        System.out.println("The coffee machine has: \n400 ml of water\n"
                + "540 ml of milk\n120 g of coffee beans\n"
                + "9 disposable cups\n$0 of money");
    }

}
