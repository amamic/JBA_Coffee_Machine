package machine;

import java.util.Scanner;

import static machine.CoffeeMachine.CoffeeType.*;

public class CoffeeMachine {
    static Scanner scan = new Scanner(System.in);
    private static final String BUY = "buy";
    private static final String FILL = "fill";
    private static final String TAKE = "take";
    private static final String REMAINING = "remaining";
    private static final String EXIT = "exit";

    private int
            water, milk, beans, cups, money;

    public CoffeeMachine() { //default constructor
        this.water = 400;
        this.milk = 540;
        this.beans = 120;
        this.cups = 9;
        this.money = 550;
    }

    public static void main(String[] args) {
        CoffeeMachine cmAction = new CoffeeMachine(); //Instances for coffeeMachine
        cmAction.action();
    }

    public void action() {
        boolean t = true;
        while (t) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            var insertedAction = CoffeeMachine.scan.next();
            switch (insertedAction) {
                case BUY:
                    this.buyFromMachine();
                    break;
                case FILL:
                    this.fillMachine();
                    break;
                case TAKE:
                    this.takeMoneyFromMachine();
                    break;
                case REMAINING:
                    this.stockStatus();
                    break;
                case EXIT:
                    t = false;
                    break;
                default:
                    System.out.println("Try again, please.");
            }
        }
    }

    public void stockStatus() {
        System.out.println();
        System.out.printf("The coffee machine has: \n"
                        + "%d ml of water\n"
                        + "%d ml of milk\n"
                        + "%d g of coffee beans\n"
                        + "%d disposable cups\n"
                        + "$%d of money\n",
                this.water, this.milk, this.beans, this.cups, this.money);
        System.out.println();
    }

    public void fillMachine() {
        Scanner s = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add:");
        this.water += s.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        this.milk += s.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        this.beans += s.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add: ");
        this.cups += s.nextInt();
        System.out.println();
    }

    public void buyFromMachine() {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        switch (scan.next().charAt(0)) {
            case '1':
                checkEspresso();
                System.out.println();
                break;
            case '2':
                checkLatte();
                System.out.println();
                break;
            case '3':
                checkCappuccino();
                System.out.println();
                break;
            case 'b':
                System.out.println();
                break;
            default:
                System.out.println("Try again, please.");
        }

    }

    public void takeMoneyFromMachine() {
        System.out.printf("I gave you $%d\n", this.money);
        this.money = 0;
        System.out.println();
    }

    public enum CoffeeType {
        ESPRESSO(250, 0, 16, 4),

        LATTE(350, 75, 20, 7),

        CAPPUCCINO(200, 100, 12, 6);


        private final int water;
        private final int milk;
        private final int beans;
        private final int cost;


        CoffeeType(int water, int milk, int beans, int cost) {
            this.water = water;
            this.milk = milk;
            this.beans = beans;
            this.cost = cost;
        }

        public int needMilk() {
            return this.milk;
        }

        public int needWater() {
            return this.water;
        }

        public int needBeans() {
            return this.beans;
        }

        public int getMoney() {
            return this.cost;
        }
    }

    public void checkEspresso() {
        CoffeeType type;
        type = ESPRESSO;
        if (this.water > type.needWater() && this.milk > type.needMilk() && this.beans > type.needBeans() && this.cups >= 1) {
            this.water -= type.needWater();
            this.milk -= type.needMilk();
            this.beans -= type.needBeans();
            this.cups--;
            this.money += type.getMoney();
            System.out.println("I have enough resources, making you a coffee!");
        } else if (this.water < type.needWater()) {
            System.out.println("Sorry, not enough water!");
        } else if (this.milk < type.needMilk()) {
            System.out.println("Sorry, not enough milk!");
        } else if (this.beans > type.needBeans()) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (this.cups >= 1)
            System.out.println("Sorry, not enough cups!");
    }

    public void checkLatte() {
        CoffeeType type;
        type = LATTE;
        if (this.water > type.needWater() && this.milk > type.needMilk() && this.beans > type.needBeans() && this.cups >= 1) {
            this.water -= type.needWater();
            this.milk -= type.needMilk();
            this.beans -= type.needBeans();
            this.cups--;
            this.money += type.getMoney();
            System.out.println("I have enough resources, making you a coffee!");
        } else if (this.water < type.needWater()) {
            System.out.println("Sorry, not enough water!");
        } else if (this.milk < type.needMilk()) {
            System.out.println("Sorry, not enough milk!");
        } else if (this.beans > type.needBeans()) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (this.cups >= 1)
            System.out.println("Sorry, not enough cups!");
    }

    public void checkCappuccino() {
        CoffeeType type;
        type = CAPPUCCINO;
        if (this.water > type.needWater() && this.milk > type.needMilk() && this.beans > type.needBeans() && this.cups >= 1) {
            this.water -= type.needWater();
            this.milk -= type.needMilk();
            this.beans -= type.needBeans();
            this.cups--;
            this.money += type.getMoney();
            System.out.println("I have enough resources, making you a coffee!");
        } else if (this.water < type.needWater()) {
            System.out.println("Sorry, not enough water!");
        } else if (this.milk < type.needMilk()) {
            System.out.println("Sorry, not enough milk!");
        } else if (this.beans > type.needBeans()) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (this.cups >= 1)
            System.out.println("Sorry, not enough cups!");
    }
}