package main;
import coffee.Coffee;
import coffee.Espresso;
import coffee.Latte;
import machine.AutomaticMachine;
import machine.TraditionalMachine;

public class Main {
    public static void main(String[] args) {
        Coffee espresso =
                new Espresso(new AutomaticMachine());
        espresso.prepare();

        Coffee latte =
                new Latte(new TraditionalMachine());
        latte.prepare();
    }
}