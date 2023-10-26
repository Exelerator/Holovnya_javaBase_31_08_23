package ua.hillel.Holovnya.lessons.lesson14.interfaces;

public interface Flyible {

    int distance = 100;


    public abstract void fly();

    default void fly2() {
        System.out.println("method fly2 from interface");
    }

}
