package machine;
public class AutomaticMachine implements CoffeeMachine {
    @Override
    public void makeCoffee(String type) {
        System.out.println(
                "Making " + type + " using automatic machine"
        );
    }
}