package lab.assignment.afterrefactoring.clientcode;

import lab.assignment.afterrefactoring.CapuccinoCoffee;
import lab.assignment.afterrefactoring.MochaCoffee;
import lab.assignment.afterrefactoring.AmericanoCoffee;
import lab.assignment.afterrefactoring.CoffeeTemplate;

public class CoffeeClient {

    public static void main(String[] args) {
        CoffeeTemplate coffeeType = new MochaCoffee();
        coffeeType.prepareCoffee();

        System.out.println("************");

        coffeeType = new CapuccinoCoffee();
        coffeeTypeType.prepareCoffee();

        System.out.println("************");

        coffeeType = new AmericanoCoffee();
        coffeeType.prepareCoffee();
    }
}
