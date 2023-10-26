package ua.hillel.Holovnya.lessons.lesson14.homework;

public class Main {
    public static void main(String[] args) {

        Androids Huawei = new Androids();
        IPhones apple = new IPhones();

        Huawei.sms();
        Huawei.call();
        Huawei.internet();
        Huawei.linuxOS();

        System.out.println();

        apple.call();
        apple.sms();
        apple.internet();
        apple.iOS();
    }
}
