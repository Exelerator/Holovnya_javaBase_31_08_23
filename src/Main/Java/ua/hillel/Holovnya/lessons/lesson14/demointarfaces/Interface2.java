package ua.hillel.Holovnya.lessons.lesson14.demointarfaces;

public interface Interface2 extends Interface1 {

    void methodInterface2();


    default void defaultMethod() {
        System.out.println("From Interface2");
    }
}
