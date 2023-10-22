package ua.hillel.Holovnya.lessons.lesson13.homework15;

public class PopMusic extends MusicStyles {

    public PopMusic(String bandName) {
        super(bandName);
    }

    @Override
    public void playMusic() {
        System.out.println("Band " + getBandName() + " play Pop music");

    }
}
