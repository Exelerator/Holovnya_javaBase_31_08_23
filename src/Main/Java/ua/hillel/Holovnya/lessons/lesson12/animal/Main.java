package ua.hillel.Holovnya.lessons.lesson12.animal;

public class Main {
    public static void main(String[] args) {


        Cat cat1 = new Cat("Barsik", 7, "Black");
        Cat cat2 = new Cat("Barsik", 8, "Black");
        Cat cat3 = new Cat("Barsik", 7, "Black");

//        cat1.eat();

//        System.out.println(cat1 == cat2);
        System.out.println(cat1.equals(cat2));


//        Cat cat=new Cat();
//        cat.name="Barsik";
//        cat.age=7;
//
//        Dog dog =new Dog();
//        dog.name="SHarik";
//        dog.age=6;
//
//        cat.meow();
//        dog.gav();
//
    }
}
