package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");

        int water = 200, milk = 50, beans = 15;

        Scanner s = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need:");
        int numberOfCups = s.nextInt();


        System.out.println("For 25 cups of coffee you will need:\n" +
                numberOfCups * water + " ml of water\n" +
                numberOfCups * milk + " ml of milk\n" +
                numberOfCups * beans + " g of coffee beans");

    }
}
