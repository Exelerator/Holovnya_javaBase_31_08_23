package ua.hillel.Holovnya.lessons.lesson9;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        for (int i = 0; i < 2; i++) {
            System.out.println("Please enter number from 1 to 10");
            if (scanner.hasNextInt()) {
                int userValue = scanner.nextInt();
                if (userValue >= 0 && userValue <= 10) {
                    if (userValue == number) {
                        break;
                    }
                } else {
                    System.out.println("from 1 TO 10");
                }
            } else {
                System.out.println("Try again!");
            }
            scanner.nextLine();
        }


        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[][] array1 = new int[N][M];
        int[][] array2 = new int[M][N];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int) (Math.random() * 11);
            }
        }
        System.out.println("Matrix N x M:");

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = array1[j][i];
            }
        }
        System.out.println("Matrix M x N:");


        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
