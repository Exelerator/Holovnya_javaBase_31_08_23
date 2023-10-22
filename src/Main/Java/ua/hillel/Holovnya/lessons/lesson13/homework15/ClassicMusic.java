package ua.hillel.Holovnya.lessons.lesson13.homework15;

public class ClassicMusic extends MusicStyles {

    public ClassicMusic(String bandName) {
        super(bandName);
    }

    @Override
    public void playMusic() {
        System.out.println("Band " + getBandName() + " play Classic music");
    }
}
