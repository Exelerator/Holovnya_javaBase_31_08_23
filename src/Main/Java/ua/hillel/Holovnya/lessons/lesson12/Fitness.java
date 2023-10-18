package ua.hillel.Holovnya.lessons.lesson12;

public class Fitness {

    private final String name;
    private final int dayBorn;
    private final int monthBorn;
    private final int yearBorn;
    private final String email;
    private final String phoneNumber;
    private int age;
    private String twoName;
    private int weight;
    private String pressure;
    private int dayStepScore;

    public Fitness(String name, String twoName,int dayBorn, int monthBorn, int yearBorn, String email, String phoneNumber,
                    int weight, String pressure, int dayStepScore) {
        this.name = name;
        this.dayBorn = dayBorn;
        this.monthBorn = monthBorn;
        this.yearBorn = yearBorn;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.twoName = twoName;
        this.weight = weight;
        this.pressure = pressure;
        this.dayStepScore = dayStepScore;
    }



    public String getName() {
        return name;
    }

    public int getDayBorn() {
        return dayBorn;
    }

    public int getMonthBorn() {
        return monthBorn;
    }

    public int getYearBorn() {
        return yearBorn;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getTwoName() {
        return twoName;
    }

    public void setTwoName(String twoName) {
        this.twoName = twoName;
    }

    public int getWeight() {
        return weight;
    }

    public String getPressure() {
        return pressure;
    }

    public int getDayStepScore() {
        return dayStepScore;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setDayStepScore(int dayStepScore) {
        this.dayStepScore = dayStepScore;
    }
    public int getAge() {
        age = 2023 - yearBorn;
        return age;
    }

    public void printAccounInfo(){
        System.out.println("Account info: "+
                "name = " + getName() +
                ", twoname = " + getTwoName() +
                ", day born = " + getDayBorn() +
                ", month born = " + getMonthBorn() +
                ", year born = " + getYearBorn() +
                ", age = " + getAge() +
                ", phone number = " + getPhoneNumber() +
                ", eMail = " + getEmail() +
                ", weight = " + getWeight() + "kg" +
                ", pressure = " + getPressure() +
                ", day step score = " + getDayStepScore());
    }
}
