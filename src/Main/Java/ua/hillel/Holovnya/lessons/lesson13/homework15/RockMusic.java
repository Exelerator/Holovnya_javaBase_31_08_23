package ua.hillel.Holovnya.lessons.lesson13.homework15;

public class RockMusic extends MusicStyles {

    public RockMusic(String bandName) {
        super(bandName);
    }

    @Override
    public void playMusic() {
        System.out.println("Band " + getBandName() + " play Rock music");
    }
}
