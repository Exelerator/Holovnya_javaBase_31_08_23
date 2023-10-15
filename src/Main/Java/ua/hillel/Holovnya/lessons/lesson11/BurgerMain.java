package ua.hillel.Holovnya.lessons.lesson11;

public class BurgerMain {
    public static void main(String[] args) {

        Burger normalBurger = new Burger("roll", "meat",
                "green","cheese","mayommaise");
        Burger dietBurger = new Burger("roll","meat","green","cheese");

        Burger doubleMeatBurger = new Burger("roll","meat","doubleMeat","green","cheese","mayonnaise");
    }
}
