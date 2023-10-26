package ua.hillel.Holovnya.lessons.lesson14.homework;

public class IPhones implements IOS,Smartphones{

    @Override
    public void iOS() {
        System.out.println("IOS can be updates");

    }

    @Override
    public void call() {
        System.out.println("iPhone is calling");

    }

    @Override
    public void sms() {
        System.out.println("iPhone received an SMS");

    }

    @Override
    public void internet() {
        System.out.println("iPhone has internet");

    }
}
