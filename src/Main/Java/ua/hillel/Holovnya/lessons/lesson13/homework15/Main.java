package ua.hillel.Holovnya.lessons.lesson13.homework15;

public class Main {
    public static void main(String[] args) {

        MusicStyles[] bands = {
                new PopMusic("ABBA"),
                new RockMusic("30 Seconds to Mars"),
                new ClassicMusic("Operababes")
        };
        for (MusicStyles style : bands ) {
            style.playMusic();


        }
    }
}
