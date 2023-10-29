package ua.hillel.Holovnya.lessons.lesson15.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        startDrinkMachine();
    }
    private static void startDrinkMachine(){
        double number = 0 ;
        while (true){
            Scanner scanner=new Scanner(System.in);

            DrinksMachine[] drinksMachines = DrinksMachine.values();
            String userChoice;
            DrinksMachine userDrinksMachine = null;


            while (true){
                System.out.println("Choose your drink from list: " + Arrays.toString(drinksMachines));
                System.out.println("Enter EXIT for finish");
                userChoice=scanner.nextLine().toUpperCase();
                if(userChoice.equals("EXIT")){
                    System.out.println("Count your drinks: " + Drinks.getCounterDrinks());
                    System.out.println("For payment: " + number);
                    break;
                }
                for (DrinksMachine drinks : drinksMachines) {
                    if(drinks.toString().equals(userChoice)){
                        userDrinksMachine = DrinksMachine.valueOf(userChoice);
                        break;
                    }
                }
                if(userDrinksMachine!=null){
                    break;
                }
            }
            if (userDrinksMachine == null){
                break;
            }

            switch (userDrinksMachine) {
                case TEA: {
                    new Drinks();
                    Drinks.prepareTea();
                    System.out.println(DrinksMachine.TEA.getTitle() + " added. " +
                            "status: " + (number += Drinks.getTeaPrice()));
                    break;
                }
                case COFFEE: {
                    new Drinks();
                    Drinks.prepareCoffee();
                    System.out.println(DrinksMachine.COFFEE.getTitle() + " added. " +
                            "status: " + (number += Drinks.getCoffeePrice()));
                    break;
                }
                case LEMONADE: {
                    new Drinks();
                    Drinks.prepareLemonade();
                    System.out.println(DrinksMachine.LEMONADE.getTitle() + " added. " +
                            "status: " + (number += Drinks.getLemonadePrice()));
                    break;
                }
                case MOJITO: {
                    new Drinks();
                    Drinks.prepareMojito();
                    System.out.println(DrinksMachine.MOJITO.getTitle() + " added. " +
                            "status: " + (number += Drinks.getMojitoPrice()));
                    break;
                }
                case MINERAL_WATER: {
                    new Drinks();
                    Drinks.prepareMineralWater();
                    System.out.println(DrinksMachine.MINERAL_WATER.getTitle() + " added. " +
                            "status: " + (number += Drinks.getMineralWaterPrice()));
                    break;
                }
                case COCA_COLA: {
                    new Drinks();
                    Drinks.prepareCocaCola();
                    System.out.println(DrinksMachine.COCA_COLA.getTitle() + " added. " +
                            "status: " + (number += Drinks.getCocaColaPrice()));
                    break;
                }
            }
        }
    }
}
