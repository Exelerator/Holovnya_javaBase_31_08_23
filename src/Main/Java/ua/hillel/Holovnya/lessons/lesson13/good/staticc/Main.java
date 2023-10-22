package ua.hillel.Holovnya.lessons.lesson13.good.staticc;

public class Main {
    public static void main(String[] args) {
//        Person.counter = 1;
        Person.demoStaticMethod();


        Person person1 = new Person();
        person1.name = "person1";
        Person person2 = new Person();
        person2.name = "person2";
        Person person3 = new Person();
        person3.name = "person3";

        System.out.println(Person.counter);


    }
}
