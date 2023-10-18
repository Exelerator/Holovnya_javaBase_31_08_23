package ua.hillel.Holovnya.lessons.lesson11;

public class Car {

//    Car(String param1) {
//        model = param1;
//    }

//    Car() {
//
//    }
//
//    Car(String param1) {
//        model = param1;
//    }
//
//    Car(int param2) {
//        year = param2;
//    }
//
//    Car(String param1, int param2) {
//        model = param1;
//        year = param2;
//    }

    final String model;
    final int year;
//
//    Car(String model, int year) {
//        this.model = model;
//        this.year = year;
//    }


    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void start() {
        System.out.println(model + " start...");
    }

    void stop() {
        System.out.println(model + " stop...");

    }

    void run() {
        System.out.println(model + " run...");

    }

    String getInfo() {
        return "Car model: " + model + ", year " + year;
    }
}
