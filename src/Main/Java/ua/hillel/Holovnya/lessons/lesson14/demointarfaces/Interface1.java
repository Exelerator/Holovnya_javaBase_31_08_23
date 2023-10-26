package ua.hillel.Holovnya.lessons.lesson14.demointarfaces;

public interface Interface1 {

    void methodInterface1();


    default void defaultMethod() {
        System.out.println("From Interface1");
    }
}
