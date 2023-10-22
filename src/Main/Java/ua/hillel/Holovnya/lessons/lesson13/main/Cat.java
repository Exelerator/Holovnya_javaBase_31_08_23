package ua.hillel.Holovnya.lessons.lesson13.main;

public class Cat extends Animal {
    @Override
    public void run() {
        System.out.println("Cat " + getName() + " run");
    }


    public void meow() {
        System.out.println(getName() + " meow meow meow");
    }

}
