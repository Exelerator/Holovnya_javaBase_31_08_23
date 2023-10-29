package ua.hillel.Holovnya.lessons.lesson15.homework;

public class Drinks {

    private static int counterDrinks;
    private static final double COFFEE_PRICE = 19.99;
    private static final double TEA_PRICE = 14.99;
    private static final double LEMONADE_PRICE = 21.99;
    private static final double MOJITO_PRICE = 35.99;
    private static final double MINERAL_WATER_PRICE = 11.99;
    private static final double COCA_COLA_PRICE = 17.99;

    public Drinks(){
        counterDrinks++;
    }

    public static int getCounterDrinks() {
        return counterDrinks;
    }

    public static double getCoffeePrice() {
        return COFFEE_PRICE;
    }

    public static double getTeaPrice(){
        return TEA_PRICE;
    }

    public static double getLemonadePrice(){
        return LEMONADE_PRICE;
    }

    public static double getMojitoPrice(){
        return MOJITO_PRICE;
    }

    public static double getMineralWaterPrice(){
        return MINERAL_WATER_PRICE;
    }

    public static double getCocaColaPrice(){
        return COCA_COLA_PRICE;
    }

    public static void prepareTea(){
        System.out.println("Tea preparing");
    }
    public static void prepareCoffee(){
        System.out.println("Coffee preparing");
    }
    public static void prepareLemonade(){
        System.out.println("Lemonade preparing");
    }
    public static void prepareMojito(){
        System.out.println("Mojito preparing");
    }
    public static void prepareMineralWater(){
        System.out.println("Mineral water preparing");
    }
    public static void prepareCocaCola(){
        System.out.println("Coca-Cola preparing");
    }
}

