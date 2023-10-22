package ua.hillel.Holovnya.lessons.lesson13.main;

public class Dog extends Animal {
    @Override
    public void run() {
        System.out.println("Dog " + getName() + "run");

    }
    public void gau() {
        System.out.println(getName() + " gau gau gau");
    }
}
