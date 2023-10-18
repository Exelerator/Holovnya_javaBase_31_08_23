package ua.hillel.Holovnya.lessons.lesson12;

public class Fitness2 {
    public static void main(String[] args) {


        Fitness user1 = new Fitness("Stas","Holovnya",20,8,1992,
                "holovnya@gmail.com","+380999446347",60,"120x80",9800);
        Fitness user2 = new Fitness("Olay","Shcola",27,7,1998,
                "Shcola@gmail.com","+380999358045",58,"125x75",7500);
        Fitness user3 = new Fitness("Mariya","Holovnya",1,3,2000,
                "Mariya@gmail.com","+38099458574",55,"130x70",6000);

        System.out.println("Before");
        user1.printAccounInfo();
        user2.printAccounInfo();
        user3.printAccounInfo();

        System.out.println();

        user1.setWeight(70);
        user3.setPressure("140x80");
        user3.setTwoName("Shcola");
        user1.setDayStepScore(38000);

        System.out.println("After");
        user1.printAccounInfo();
        user2.printAccounInfo();
        user3.printAccounInfo();


    }
}
