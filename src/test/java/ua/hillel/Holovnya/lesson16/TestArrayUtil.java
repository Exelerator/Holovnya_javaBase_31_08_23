package ua.hillel.Holovnya.lesson16;

import org.junit.jupiter.api.*;
import ua.hillel.Holovnya.lessons.lesson16.ArrayUtil;

public class TestArrayUtil {
    static int[] array = null;

    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll");
        array = new int[]{1, 2, 3, 4, 5};
    }

    @BeforeEach
    void beforeEach() {
        array = new int[]{1, ((int) Math.random() * 101), 3, 4, 5};
    }

    @Test
    void testMethod1() {
        System.out.println("testMethod1");
        int indexElement = ArrayUtil.getIndexElement(array, 3);
        Assertions.assertTrue(indexElement == 2);
    }

    @Test
    void testMethod2() {
        System.out.println("testMethod2");
        int indexElement = ArrayUtil.getIndexElement(array, 3);
        Assertions.assertEquals(2, indexElement);
    }

    @Test
    void testMethod3() {
        System.out.println("testMethod3");
        int[] array = null;
        int indexElement = ArrayUtil.getIndexElement(array, 3);
        Assertions.assertEquals(-3, indexElement);
    }

    @Test
    void testMethod4() {
        System.out.println("testMethod4");
        int[] array = {};
        int indexElement = ArrayUtil.getIndexElement(array, 3);
        Assertions.assertEquals(-2, indexElement);
    }

    @Test
    void testMethod5() {
        System.out.println("testMethod5");
        int[] array = {1};
        int indexElement = ArrayUtil.getIndexElement(array, 777);
        Assertions.assertEquals(-1, indexElement);
    }

    @AfterEach
    void afterEach() {
        System.out.println("afterEach");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("AfterAll");
        array = null;
    }
}