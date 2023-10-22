package ua.hillel.Holovnya.lessons.lesson13.good.staticc;

public class PersonChild extends  Person{
    public static void demoStaticMethod() {
        System.out.println("static method from PersonChild");
    }

    @Override
    public void demoNonStaticMethod() {
        System.out.println(name);
        System.out.println(counter);
    }
}
