package ua.hillel.Holovnya.lesson16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ua.hillel.Holovnya.lessons.lesson16.homework;

public class TestHomework {

    static int [][] array = null;

    @BeforeAll
    public static void beforeAll(){
        array = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]=(int)(Math.random()*11);
            }
        }

        for (int[] ints :array) {
            for (int anInt : ints){
                System.out.println(anInt + "\t");
            }
            System.out.println();
        }
    }
    @Test
    public void  test1(){
        Assertions.assertEquals(-1, homework.averageTwoDimensionalArray(null));

    }
    @Test
    public void test2(){
        Assertions.assertEquals(-2,homework.averageTwoDimensionalArray(new int[0][0]));
    }
    @Test
    public void test3(){
        Assertions.assertNotEquals(-3,homework.averageTwoDimensionalArray(array));
    }
    @Test
    public void test4(){
        Assertions.assertTrue(homework.matrixIsSquare(array));
    }
}
