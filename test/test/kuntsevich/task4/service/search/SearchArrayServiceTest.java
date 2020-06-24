package test.kuntsevich.task4.service.search;

import com.kuntsevich.task4.entity.CustomArray;
import com.kuntsevich.task4.exception.CustomArrayException;
import com.kuntsevich.task4.service.search.SearchArrayService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SearchArrayServiceTest {

    private SearchArrayService searchArrayService = new SearchArrayService();

    @Test
    public void testBinarySearchPositive() {
        int[] array = new int[]{-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        try {
            CustomArray customArray = new CustomArray(array);
            int actual = searchArrayService.binarySearch(customArray, 0);
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
            int actual = searchArrayService.binarySearch(customArray, 10);
            int expected = -1;
            assertEquals(actual, expected);
        } catch (CustomArrayException e) {
            fail();
        }
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void testBinarySearchException() throws CustomArrayException {
        searchArrayService.binarySearch(null, 10);
    }

    @Test
    public void testMaxPositive() {
        int[] array = new int[]{-5, -4, -3, -2, -1, 100, 1, 2, 3, 4, 5};
        try {
            CustomArray customArray = new CustomArray(array);
            int actual = searchArrayService.max(customArray);
            int expected = 100;
            assertEquals(actual, expected);
        } catch (CustomArrayException e) {
            fail();
        }
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void testMaxException() throws CustomArrayException {
        searchArrayService.max(null);
    }

    @Test
    public void testMinPositive() {
        int[] array = new int[]{-5, -4, -3, -2, -1, -100, 1, 2, 3, 4, 5};
        try {
            CustomArray customArray = new CustomArray(array);
            int actual = searchArrayService.min(customArray);
            int expected = -100;
            assertEquals(actual, expected);
        } catch (CustomArrayException e) {
            fail();
        }
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void testMinException() throws CustomArrayException {
        searchArrayService.min(null);
    }

    @Test
    public void testSum() {
        int[] array = new int[]{-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        try {
            CustomArray customArray = new CustomArray(array);
            int actual = searchArrayService.sum(customArray);
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
            CustomArray actual = searchArrayService.allPrimeNumbers(customArray);
            int[] expectedArray = new int[]{2, 3, 5};
            CustomArray expected = new CustomArray(expectedArray);
            assertEquals(actual, expected);
        } catch (CustomArrayException e) {
            fail();
        }
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void testAllPrimeNumbersException() throws CustomArrayException {
        searchArrayService.allPrimeNumbers(null);
    }

    @Test
    public void testAllFibonachiNumbersPositive() {
        int[] array = new int[]{-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        try {
            CustomArray customArray = new CustomArray(array);
            CustomArray actual = searchArrayService.allFibonachiNumbers(customArray);
            int[] expectedArray = new int[]{1, 2, 3, 5};
            CustomArray expected = new CustomArray(expectedArray);
            assertEquals(actual, expected);
        } catch (CustomArrayException e) {
            fail();
        }
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void testAllFibonachiNumbersException() throws CustomArrayException {
        searchArrayService.allFibonachiNumbers(null);
    }

    @Test
    public void testNumbersWithoutRepetitionPositive() {
        int[] array = new int[]{-5, -4, -3, -2, -1, 0, 11, 22, 31, 42, 54};
        try {
            CustomArray customArray = new CustomArray(array);
            CustomArray actual = searchArrayService.numbersWithoutRepetition(customArray, 2);
            int[] expectedArray = new int[]{31, 42, 54};
            CustomArray expected = new CustomArray(expectedArray);
            assertEquals(actual, expected);
        } catch (CustomArrayException e) {
            fail();
        }
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void testNumbersWithoutRepetitionException() throws CustomArrayException {
        searchArrayService.numbersWithoutRepetition(null, 3);
    }
}