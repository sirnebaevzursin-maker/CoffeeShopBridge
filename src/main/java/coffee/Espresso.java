package coffee;
import machine.CoffeeMachine;

public class Espresso extends Coffee {
    public Espresso(CoffeeMachine machine) {
        super(machine);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Espresso");
        machine.makeCoffee("Espresso");

    }
}