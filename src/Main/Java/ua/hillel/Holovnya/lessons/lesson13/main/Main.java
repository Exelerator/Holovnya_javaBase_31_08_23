package ua.hillel.Holovnya.lessons.lesson13.main;

public class Main {
    public static void main(String[] args) {


        Cat cat = new Cat();
        cat.setName("Barsik");

//        cat.run();
//        cat.swim();

        Animal animal = new Dog();
        animal.setName("Sharik");
//        animal.run();
//
        demo(cat);
        demo(animal);
    }

    static public void demo(Animal animal) {
        if (animal instanceof Dog) {
            ((Dog) animal).gau();
        }

        if (animal instanceof Cat) {
            ((Cat) animal).meow();
        }
    }
    }

