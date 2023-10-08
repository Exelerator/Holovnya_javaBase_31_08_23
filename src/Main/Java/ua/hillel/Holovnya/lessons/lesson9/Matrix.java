package ua.hillel.Holovnya.lessons.lesson9;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int temp=0;
        System.out.println("Please enter numbers ");
        while (true) {
            if (scanner.hasNextInt()) {
                if (temp < 0) {
                    System.out.println("Please enter number");
                } else {
                    break;
                }
                scanner.nextLine();
            } else {
                System.out.println("Wrong data");
                scanner.nextLine();
            }
        }

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[][] array1 = new int[N][M];
        int[][] array2 = new int[M][N];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("Matrix N x M:");

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + "\t");
            } System.out.println();
        }
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                int number = array1[i][j];
                array2[i][j] = array1[j][i];
                array2[j][i] = number;
            }
        }
        System.out.println("Matrix M x N:");


        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }

        }
    }
