package ua.hillel.Holovnya.lessons.lesson10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//
//        printHelloWorld();
//        printHelloName("Stas");
//        printHelloName("Olya");
//        printHelloName("Masha");
//
//        int a=7;
//        int b=7;
//        printSum(7,7);
//        System.out.println(getSum(a,b));
//
//       int sum= getSum(a,b);
//
//        System.out.println("sum = " + sum);
//
//        int sum2 = getSum(a, getSum(getSum(1, 2), b));
//
//        System.out.println("sum2 = " + sum2);

//        demoReturn(2);
//        System.out.println(demoManyReturn(1));

//        int[] array = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(array));
//        demoArray(array);
//        demoArray2(array);
//        System.out.println(Arrays.toString(array));


//        printSum2(1);
//        printSum2(1, 2, 3);
//        printSum2(1, 2, 3, 65, 234, 123, 54, 3);
//        printSum2();
//        varArgs
//    }
        //varArgs
//
//        static int getSum ( int a, int b){
////        int sum = a + b;
////        return sum;
//
//            return a + b;
//        }
//        short x1 = 1;
//        getSum(1,2);


        getSum(1, 3, 4);
    }


//                5!
//        1 * 2 * 3 * 4 * 5
//        120
//
//        3!
//        1 * 2 * 3


//        demoRecursion(1);


        int number = 5;
//        int factorial = 1;
//        for (int i = 2; i <= number; i++) {
//            factorial *= i;
//        }
//        System.out.println(factorial);


//        System.out.println(getFactorial(number));

//
//        System.out.println(evclide(7, 8));
//
//

    static int evclide(int n, int m) {
        if (n == m) {
            return n;
        } else if (n > m) {
            return evclide(n-m, m);
        } else {
            return evclide(n, m - n);
        }
    }

    static int getFactorial(int number) {
        if (number == 1) {
            return 1;
        }
        return number * getFactorial(number - 1);
    }

    // BAD RECURSION!!!
//    static void demoRecursion(int x) {
//        demoRecursion(x);
//    }

    static int getSum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    static int getSum(byte a, int b) {
        return a + b;
    }

    static int getSum(short a, int b) {
        return a + b;
    }
    static int getSum(int a, int b, int c) {
        return a + b + c;
    }

    static void demoArray2(int... numbers) {
        numbers[0] = 99;
    }

    static void demoArray(int[] array) {
        array[0] = 99;
    }

    static void printSum2(int... numbers) {
        System.out.println(numbers.length);

        int sum = 0;
        for (int value : numbers) {
            sum += value;
        }

        System.out.println("sum = " + sum);
    }

    static int demoManyReturn ( int x){
            if (x == 1) {
                return 5;
            } else if (x == 2) {
                return 10;
            }

            return 15;

        }
        static void demoReturn ( int x){
            if (x == 1) {
                return;
            }
            System.out.println("ajfhgirqw");
        }
//        static int getSum ( int a, int b){
//            int sum = a + b;
//
//            return sum;
//        }

        static void printHelloWorld () {
            System.out.println("Hello World");
        }

        static void printHelloName (String name){
            System.out.println("Hello " + name);

        }
        static void printSum ( int a, int b){
            System.out.println("sum a + b=" + (a + b));
        }
    }