package ua.hillel.Holovnya.lessons.lesson8;

import java.util.Arrays;

public class homework8 {
    public static void main(String[] args) {

        int[] loterey = new int[7];
        int[] player = new int[loterey.length];

        for (int i = 0; i < loterey.length; i++) {
            loterey[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < player.length; i++) {
            player[i] = (int) (Math.random() * 10);
        }
//        System.out.println("loterey= " + Arrays.toString(loterey));
//        System.out.println("player = " + Arrays.toString(player));

        int counter = 0;
        for (int i = 0; i < loterey.length; i++) {
            for (int j = 0; j < loterey.length - 1 - i; j++) {
                counter++;
                if (loterey[j] > loterey[j + 1]) {
                    int temp = loterey[j];
                    loterey[j] = loterey[j + 1];
                    loterey[j + 1] = temp;
                }
            }

        }

        Arrays.sort(player);
//        int counter1 = 0;
//        for (int i = 0; i < player.length; i++) {
//            for (int j = 0; j < player.length - 1 - i; j++) {
//                counter1++;
//                if (player[j] > player[j + 1]) {
//                    int temp = player[j];
//                    player[j] = player[j + 1];
//                    player[j + 1] = temp;
//                }
//            }
//
//        }
        System.out.println("loterey = " + Arrays.toString(loterey));
        System.out.println("player = " + Arrays.toString(player));

        int numbers = 0;
        for (int i = 0; i < 7; i++) {
            if (loterey[i] == player[i]) {
                numbers++;
            }
        }
        System.out.println("Numbers="+numbers);

    }

}



