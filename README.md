# Coffee Shop Bridge Pattern

## Description

This project is a simple Coffee Shop system created using the Bridge Design Pattern.

The main idea of this project is to separate coffee types from coffee preparation methods.
The coffee type and coffee machine can be changed independently without changing the existing code.

## Design Pattern Used

### Bridge Pattern

Bridge Pattern is a structural design pattern that separates abstraction from implementation.

In this project:

- Coffee represents the abstraction side.
- CoffeeMachine represents the implementation side.

This allows different coffee types to work with different coffee machines.

## Project Structure
coffee
│
├── Coffee.java
├── Espresso.java
└── Latte.java
machine
│
├── CoffeeMachine.java
├── AutomaticMachine.java
└── TraditionalMachine.java
main
└── Main.java

## Classes Description

### Coffee Package

**Coffee.java**

Abstract class that stores a reference to CoffeeMachine.
It connects the coffee type with the machine implementation.

**Espresso.java**

A concrete coffee type that extends Coffee.
It prepares Espresso using the selected coffee machine.

**Latte.java**

A concrete coffee type that extends Coffee.
It prepares Latte using the selected coffee machine.

---

### Machine Package

**CoffeeMachine.java**

Interface that defines the method for making coffee.

**AutomaticMachine.java**

Implementation of CoffeeMachine that prepares coffee using an automatic machine.

**TraditionalMachine.java**

Implementation of CoffeeMachine that prepares coffee using a traditional machine.

---

### Main Package

**Main.java**

The client class that connects coffee types with different machines and demonstrates how Bridge Pattern works.

## Example Output
Preparing Espresso
Making Espresso using automatic machine
Preparing Latte
Making Latte using traditional machine

## Conclusion

The Bridge Pattern helps to avoid creating many classes when we have different coffee types and different preparation methods.

New coffee types or new machines can be added easily without modifying existing classes.