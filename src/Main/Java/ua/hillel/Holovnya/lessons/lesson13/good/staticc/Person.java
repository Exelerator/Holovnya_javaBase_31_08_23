package ua.hillel.Holovnya.lessons.lesson13.good.staticc;

public class Person {

    public static int counter = 0;

    public String name;

    public Person() {
        counter++;
    }

    public static void demoStaticMethod() {
        System.out.println("static method from Person");
    }

    public void demoNonStaticMethod() {
        System.out.println(name);
        System.out.println(counter);
    }
}
