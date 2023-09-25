package ua.hillel.Holovnya.lessons.lesson6;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int random = (int) (Math.random() * 11);
        System.out.println(random);
        for (int i = 0; i < 4; i++) {
            System.out.println("Please enter number from 0 to 10");
            if (scanner.hasNextInt()) {
                int userValue = scanner.nextInt();
                if (userValue >= 0 && userValue <= 10) {
                    System.out.println("userValue  = " + userValue);
                    if (userValue == random) {
                        System.out.println("u won=");
                        break;
                    }
                } else {
                    System.out.println("from 0 TO 10");
                }
            } else {
                System.out.println("Try again!");
            }
            scanner.nextLine();
        }


    }
}

