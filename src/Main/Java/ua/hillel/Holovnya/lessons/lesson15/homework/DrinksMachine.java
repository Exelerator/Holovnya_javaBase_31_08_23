package ua.hillel.Holovnya.lessons.lesson15.homework;

public enum DrinksMachine {

    COFFEE("Coffee"),
    TEA("Tea"),
    LEMONADE("Lemonade"),
    MOJITO("Mojito"),
    MINERAL_WATER("Mineral water"),
    COCA_COLA("Coca-cola");

    private final String title;

    DrinksMachine(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
