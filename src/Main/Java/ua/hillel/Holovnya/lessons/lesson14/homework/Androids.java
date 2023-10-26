package ua.hillel.Holovnya.lessons.lesson14.homework;

public class Androids implements LinuxOS,Smartphones{
    @Override
    public void linuxOS() {
        System.out.println("LinuxOS can be updates");

    }

    @Override
    public void call() {
        System.out.println("Android-phone is calling");

    }

    @Override
    public void sms() {
        System.out.println("Android-phone received an SMS");

    }

    @Override
    public void internet() {
        System.out.println("Android-phone has internet");

    }
}
