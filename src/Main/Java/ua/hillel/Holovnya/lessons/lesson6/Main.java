package ua.hillel.Holovnya.lessons.lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //        FOR


        /*

        for(  БЛОК ІНІЦІАЛІЗАЦІЇ ІТЕРАТОРА;
              БЛОК УМОВИ ВИХОДУ З ЦИКЛУ;
              БЛОК ЗМІНИ ІТЕРАТОРА (++ або --)
              )
              {
                  код
              }
         */
//              -- BREAK --
//        ОБРИВАННЯ ВСЬОГО ЦИКЛУ

//        -- CONTINUE --
//        ОБРИВАЄ ПОТОЧНУ ІТЕРАЦІЮ

//        for(int i=0;i<5;i++){
//            System.out.println("hello world");
//        }

//        int i=0;
//        for (;i<=10;i+=2){
//            System.out.println(i);
//        }
////
//        for (int i=0;i<10;i++){
//
//            if(i==5 || i==7){
//                continue;
//            }
//            System.out.println(i);
//        }
//        int counter=0;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                counter++;
//                System.out.println("i="+i);
//                System.out.println("j="+j);
//                System.out.println("counter="+counter);
//            }

//            int counter2=0;
//            for (int j = 0; j < 3; j++) {
//                for (int k = 0; k <4 ; k++) {
//                    for (int l = 0; l <5 ; l++) {
//                        for (int m = 0; m <6 ; m++) {
//                            counter2++;
//
//
//                        }
//
//                    }
//
//                }
//
//            }
//        System.out.println("counter2="+counter2);

//        for (int i = 0,j=10; i <10 && j>5 ; i++,j--) {
//            System.out.println("j="+j);
//            System.out.println("i="+i);
//            System.out.println();
//
//        }
//        for (byte i = 0; i <128 ; i++) {
//            System.out.println(i);
//
//        }
//               1)
//        виведення лише парних за допомогою циклу FOR
//        0 2 4 6 8 10 12 14 16 18 20
//        version 1
//        for (int i = 0; i <=20; i+=2) {
//            System.out.println(i);
//        }
//        version 2
//        for (int i = 0; i <=20; i++) {
//            if( i % 2==0){
//                System.out.println(i);
//            }
//
//
//        }

        //        2)
//        Виведіть на екран перші 11 членів послідовності Фібоначчі
//        1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
//        int num1=1;
//        int num2=1;
//        int sum=0;
//        System.out.print(num1+" "+num2+" ");
//        for (int i = 0; i <9 ; i++) {
//            sum=num1+num2;
//            System.out.print(sum+" ");
//            num1=num2;
//            num2=sum;
//
//        }

        // WHILE

//        int i=0;
//        while(i<10){
//        System.out.println(i);
//        i++;
//        }
//        int j=0;
//        do {
//            System.out.println(j);
//        }while (j==1);

//        int i=0;
//        while(i<10){
//            i++;
//            if(i==5){
//                continue;
//            }
//            if (i==7){
//                break;
//            }
//            System.out.println(i);
//
//        }


//        while (true){
//            System.out.println("Please enter integer number from 10 to 20");
//            if (scanner.hasNextInt()){
//                int userValue=scanner.nextInt();
//                if (userValue>=10 && userValue<=20) {
//                    System.out.println("user value =" + userValue);
//                    break;
//                }else{
//                    System.out.println("from  10 to 20");
//                }
//            }else{
//                System.out.println("Wrong data try again");
//            }scanner.nextLine();
//        }

        //        1)
//        a. Зробіть бомбу зі зворотним відліком від 10 до 0 за допомогою циклу WHILE
//        b. додайте до вашої бомби умову, якщо бомба розмінована, вона не вибухне (85 - 100) - win

//        int i=10;
//        while (i>=0){
//            int randomNumber=(int) (Math.random()*101);
//            if (randomNumber >= 85 && randomNumber <= 100) {
//                System.out.println("WIN!");
//                break;
//            }
//            System.out.println(i);
//            if(i ==0){
//                System.out.println("Boom");
//            }
//            i--;
//        }

//        ДЗ
//
//        У Японії числа 4 та 9 вважаються нещасливими.
//        Вам потрібно пронумерувати 100 космічних шатлів для перевезення людей на Марс так,
//        щоб у номерах шатлів не траплялося нещасливих чисел.
//        Напишіть функцію, яка виводить усі номери таких шатлів.


//        int counter = 0;
//        for (int i = 1; i < 100; i++) {
//            if (String.valueOf(i).contains("4") || String.valueOf(i).contains("9")) {
//                continue;
//            }
//            counter++;
//            System.out.println(i);
//        }
//        System.out.println("counter = " + counter);
//        int counter=0;
//        for (int i = 0; counter <=100; i++) {
//            for (int j = 0; j < 9; j++) {
//                if(i!=4&& j!=4)
//                    System.out.println(i+""+j);
//
//            }
//            counter++;
//            System.out.println(i);
//
//        }


    }
}
