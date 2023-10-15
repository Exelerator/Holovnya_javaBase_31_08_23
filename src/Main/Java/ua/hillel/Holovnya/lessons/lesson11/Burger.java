package ua.hillel.Holovnya.lessons.lesson11;

public class Burger {

    String roll;
    String meat;
    String doubleMeat;
    String green;
    String cheese;
    String mayonnaise;

    public Burger(String roll,String meat,String green,String cheese,String mayonnaise){
        this.roll=roll;
        this.meat=meat;
        this.green=green;
        this.cheese=cheese;
        this.mayonnaise=mayonnaise;
        System.out.println(infoNormalBurger());
    }
    public Burger(String roll,String meat,String green,String cheese){
        this.roll=roll;
        this.meat=meat;
        this.green=green;
        this.cheese=cheese;
        System.out.println(infoDietBurger());

    }
    public Burger(String roll,String meat,String doubleMeat,String green,String cheese,String mayonnaise){
        this.roll=roll;
        this.meat=meat;
        this.doubleMeat=doubleMeat;
        this.green=green;
        this.cheese=cheese;
        this.mayonnaise=mayonnaise;
        System.out.println(infoDoubleBurger());
    }
    public String infoNormalBurger(){
        return "Normal burger composition: " +
                roll +
                ", " + meat +
                ", " + green +
                ", " + cheese +
                ", " + mayonnaise;
    }
    public String infoDietBurger(){
        return  "Diet burger composition: " +
                roll +
                ", " + meat +
                ", " + green +
                ", " + cheese;
    }
    public String infoDoubleBurger(){
        return  "Double meat burger composition: " +
                roll +
                ", " + meat +
                ", " + doubleMeat +
                ", " + green +
                ", " + cheese +
                ", " + mayonnaise;
    }
}
