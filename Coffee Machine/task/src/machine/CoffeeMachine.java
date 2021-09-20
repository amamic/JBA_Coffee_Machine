package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        /*System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");*/

        int water = 200, milk = 50, beans = 15;

        Scanner s = new Scanner(System.in);
        /*System.out.println("Write how many cups of coffee you will need:");
        int numberOfCups = s.nextInt();


        System.out.println("For 25 cups of coffee you will need:\n" +
                numberOfCups * water + " ml of water\n" +
                numberOfCups * milk + " ml of milk\n" +
                numberOfCups * beans + " g of coffee beans");*/

        System.out.println("Write how many ml of water the coffee machine has:");
        int amountOfWater = s.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int amountOfMilk = s.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int amountOfBeans = s.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int amountOfCups = s.nextInt();

        int maxCoffeeTrail = Math.min(amountOfWater / water, amountOfMilk / milk);
        int maxCoffee = Math.min(maxCoffeeTrail, amountOfBeans / beans);

        if (maxCoffee > amountOfCups || maxCoffee == amountOfCups) {
            if (maxCoffee == amountOfCups) {
                System.out.println("Yes, I can make that amount of coffee");
            } else {
                System.out.println("Yes, I can make that amount of coffee (and even "
                        + (maxCoffee - amountOfCups) + " more than that)");
            }

        } else
            System.out.println("No, I can make only "
                    + (maxCoffee) + " cup(s) of coffee");
    }
}

