package ua.hillel.Holovnya.lessons.lesson13.homework15;

public abstract class MusicStyles {

    private final String bandName;

    public MusicStyles(String bandName) {
        this.bandName = bandName;
    }

    public abstract void playMusic();

    public String getBandName() {
        return bandName;
    }
}
