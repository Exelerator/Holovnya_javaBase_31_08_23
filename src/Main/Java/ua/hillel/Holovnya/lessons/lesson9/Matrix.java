package ua.hillel.Holovnya.lessons.lesson9;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M;
        int N;

        System.out.println("Please enter two numbers from 1 to 10.");

        while(true) {
            if (scanner.hasNextInt()) {
                M = scanner.nextInt();
                if (M >= 1 && M <= 10) {
                    break;
                } else {
                    System.out.println("Please enter two numbers from 1 to 10");
                }
            } else {
                System.out.println("Wrong data! Try again!");
                scanner.nextLine();
            }
            scanner.nextLine();
        }
        while(true) {
            if (scanner.hasNextInt()) {
                N = scanner.nextInt();
                if (N >= 1 && N <= 10) {
                    break;
                } else {
                    System.out.println("Please enter two numbers from 1 to 10");
                }
            } else {
                System.out.println("Wrong data! Try again!");
                scanner.nextLine();
            }
            scanner.nextLine();
        }
        System.out.println();


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
            for (int j =0; j < array2[i].length; j++) {
                int number = array1[j][i];
                array2[i][j] = array1[j][i];
                array2[i][j] = number;
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
