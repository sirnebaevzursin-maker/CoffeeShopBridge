package coffee;
import machine.CoffeeMachine;
public class Latte extends Coffee {
    public Latte(CoffeeMachine machine) {
        super(machine);
    }
    @Override
    public void prepare() {

        System.out.println("Preparing Latte");
        machine.makeCoffee("Latte");
    }
}
