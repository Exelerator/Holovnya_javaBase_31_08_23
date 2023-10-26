package ua.hillel.Holovnya.lessons.lesson14.interfaces;

public class Airplane implements Flyible{


    @Override
    public void fly() {
        System.out.println("Airplane fly");
    }
    @Override
    public void fly2() {
//        Flyible.super.fly2();
//        Flyible2.super.fly2();
        System.out.println("my method");
    }

}
