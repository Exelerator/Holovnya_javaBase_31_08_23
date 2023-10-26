package ua.hillel.Holovnya.lessons.lesson14.demointarfaces;

public interface Interface4  extends Interface1,Interface2{


    @Override
    default void defaultMethod() {
//        Interface1.super.defaultMethod();
        Interface2.super.defaultMethod();

        System.out.println("From Interface4");
    }
}
