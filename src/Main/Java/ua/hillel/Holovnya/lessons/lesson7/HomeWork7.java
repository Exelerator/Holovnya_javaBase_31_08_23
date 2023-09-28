package ua.hillel.Holovnya.lessons.lesson7;

import java.util.Arrays;

public class HomeWork7 {
    public static void main(String[] args) {
        int[] team1 = new int[25];
        int[] team2 = new int[team1.length];

        for (int i = 0; i < team1.length; i++) {
            team1[i] = (int) ((Math.random() * 23) + 18);
        }
        for (int i = 0; i < team2.length; i++) {
            team2[i] = (int) ((Math.random() * 23) + 18);
        }
        System.out.println(Arrays.toString(team1));
        System.out.println(Arrays.toString(team2));

        int sumTeam1 = 0;
        int sumTeam2 = 0;

        for (int i = 0; i < team1.length; i++) {
            if (i >= 0) {
                sumTeam1 += team1[i];
            }
        }
        for (int j = 0; j < team2.length; j++) {
            if (j >= 0) {
                sumTeam2 += team2[j];
            }
        }

        System.out.println("sumTeam1=" + sumTeam1 / 25);
        System.out.println("sumTeam2=" + sumTeam2 / 25);

    }
}
