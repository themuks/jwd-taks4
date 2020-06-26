package test.kuntsevich.task4.service;

import com.kuntsevich.task4.entity.CustomArray;
import com.kuntsevich.task4.exception.CustomArrayException;
import com.kuntsevich.task4.service.CustomArrayService;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CustomArrayServiceTest {

    private CustomArrayService customArrayService = new CustomArrayService();

    @Test
    public void testBinarySearchPositive() {
        int[] array = new int[]{-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        try {
            CustomArray customArray = new CustomArray(array);
            int actual = customArrayService.binarySearch(customArray, 0);
            int expected = 5;
            assertEquals(actual, expected);
        } catch (CustomArrayException e) {
            fail();
        }
    }

    @Test
    public void testBinarySearchNegative() {
        int[] array = new int[]{-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        try {
            CustomArray customArray = new CustomArray(array);
            int actual = customArrayService.binarySearch(customArray, 10);
            int expected = -1;
            assertEquals(actual, expected);
        } catch (CustomArrayException e) {
            fail();
        }
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void testBinarySearchException() throws CustomArrayException {
        customArrayService.binarySearch(null, 10);
    }

    @Test
    public void testMaxPositive() {
        int[] array = new int[]{-5, -4, -3, -2, -1, 100, 1, 2, 3, 4, 5};
        try {
            CustomArray customArray = new CustomArray(array);
            int actual = customArrayService.max(customArray);
            int expected = 100;
            assertEquals(actual, expected);
        } catch (CustomArrayException e) {
            fail();
        }
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void testMaxException() throws CustomArrayException {
        customArrayService.max(null);
    }

    @Test
    public void testMinPositive() {
        int[] array = new int[]{-5, -4, -3, -2, -1, -100, 1, 2, 3, 4, 5};
        try {
            CustomArray customArray = new CustomArray(array);
            int actual = customArrayService.min(customArray);
            int expected = -100;
            assertEquals(actual, expected);
        } catch (CustomArrayException e) {
            fail();
        }
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void testMinException() throws CustomArrayException {
        customArrayService.min(null);
    }

    @Test
    public void testSum() {
        int[] array = new int[]{-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        try {
            CustomArray customArray = new CustomArray(array);
            int actual = customArrayService.sum(customArray);
            int expected = 0;
            assertEquals(actual, expected);
        } catch (CustomArrayException e) {
            fail();
        }
    }

    @Test
    public void testAllPrimeNumbersPositive() {
        int[] array = new int[]{-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        try {
            CustomArray customArray = new CustomArray(array);
            CustomArray actual = customArrayService.allPrimeNumbers(customArray);
            int[] expectedArray = new int[]{2, 3, 5};
            CustomArray expected = new CustomArray(expectedArray);
            assertEquals(actual, expected);
        } catch (CustomArrayException e) {
            fail();
        }
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void testAllPrimeNumbersException() throws CustomArrayException {
        customArrayService.allPrimeNumbers(null);
    }

    @Test
    public void testAllFibonacciNumbersPositive() {
        int[] array = new int[]{-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        try {
            CustomArray customArray = new CustomArray(array);
            CustomArray actual = customArrayService.allFibonacciNumbers(customArray);
            int[] expectedArray = new int[]{1, 2, 3, 5};
            CustomArray expected = new CustomArray(expectedArray);
            assertEquals(actual, expected);
        } catch (CustomArrayException e) {
            fail();
        }
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void testAllFibonacciNumbersException() throws CustomArrayException {
        customArrayService.allFibonacciNumbers(null);
    }

    @Test
    public void testNumbersWithoutRepetitionPositive() {
        int[] array = new int[]{-5, -4, -3, -2, -1, 0, 11, 22, 31, 42, 54};
        try {
            CustomArray customArray = new CustomArray(array);
            CustomArray actual = customArrayService.numbersWithoutRepetition(customArray, 2);
            int[] expectedArray = new int[]{31, 42, 54};
            CustomArray expected = new CustomArray(expectedArray);
            assertEquals(actual, expected);
        } catch (CustomArrayException e) {
            fail();
        }
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void testNumbersWithoutRepetitionException() throws CustomArrayException {
        customArrayService.numbersWithoutRepetition(null, 3);
    }
}