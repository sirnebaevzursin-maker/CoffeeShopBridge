package coffee;
import machine.CoffeeMachine;

public abstract class Coffee {
    protected CoffeeMachine machine;
    public Coffee(CoffeeMachine machine) {
        this.machine = machine;
    }
    public abstract void prepare();
}