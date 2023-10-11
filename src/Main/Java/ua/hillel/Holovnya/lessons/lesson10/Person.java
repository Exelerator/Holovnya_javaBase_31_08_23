package ua.hillel.Holovnya.lessons.lesson10;

public class Person {
    public static void main(String[] args) {
        System.out.println(personInfo("Will","Smith","New York","2943530457345"));
        System.out.println(personInfo("Jackie","Chan","Shanghai","2131243255"));
        System.out.println(personInfo("Sherlock","Holmes","London","3712341234"));
    }

    static String personInfo(String firstName,String secondName,String city,String phoneNumber) {
        return "Зателефонувати громадянинові " + firstName + " " + secondName + " з міста " + city + " можна за номером " + phoneNumber + ".";

    }

}
