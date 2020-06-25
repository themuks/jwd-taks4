package test.kuntsevich.task4.service.sort;

import com.kuntsevich.task4.exception.ArrayException;
import com.kuntsevich.task4.exception.CustomArrayException;
import com.kuntsevich.task4.service.sort.*;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

public class SortJaggedArrayServiceTest {

    private SortJaggedArrayService sortJaggedArrayService = new SortJaggedArrayService();

    @Test
    public void testBubbleSortMax() {
        int[][] jaggedArray = new int[][]{{7, 8, 9}, {4, 5, 6}, {1, 2, 3}};
        CompareService compareService = new MaxCompareService();
        try {
            sortJaggedArrayService.bubbleSort(jaggedArray, compareService, false);
        } catch (CustomArrayException | ArrayException e) {
            fail();
        }
        int[][] expected = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        boolean actual = Arrays.deepEquals(jaggedArray, expected);
        assertTrue(actual);
    }

    @Test
    public void testBubbleSortMaxReversed() {
        int[][] jaggedArray = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        CompareService compareService = new MaxCompareService();
        try {
            sortJaggedArrayService.bubbleSort(jaggedArray, compareService, true);
        } catch (CustomArrayException | ArrayException e) {
            fail();
        }
        int[][] expected = new int[][]{{7, 8, 9}, {4, 5, 6}, {1, 2, 3}};
        boolean actual = Arrays.deepEquals(jaggedArray, expected);
        assertTrue(actual);
    }

    @Test
    public void testBubbleSortMin() {
        int[][] jaggedArray = new int[][]{{7, 8, 9}, {4, 5, 6}, {1, 2, 3}};
        CompareService compareService = new MinCompareService();
        try {
            sortJaggedArrayService.bubbleSort(jaggedArray, compareService, false);
        } catch (CustomArrayException | ArrayException e) {
            fail();
        }
        int[][] expected = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        boolean actual = Arrays.deepEquals(jaggedArray, expected);
        assertTrue(actual);
    }

    @Test
    public void testBubbleSortMinReversed() {
        int[][] jaggedArray = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        CompareService compareService = new MinCompareService();
        try {
            sortJaggedArrayService.bubbleSort(jaggedArray, compareService, true);
        } catch (CustomArrayException | ArrayException e) {
            fail();
        }
        int[][] expected = new int[][]{{7, 8, 9}, {4, 5, 6}, {1, 2, 3}};
        boolean actual = Arrays.deepEquals(jaggedArray, expected);
        assertTrue(actual);
    }

    @Test
    public void testBubbleSortSum() {
        int[][] jaggedArray = new int[][]{{7, 8, 9}, {4, 5, 6}, {1, 2, 3}};
        CompareService compareService = new SumCompareService();
        try {
            sortJaggedArrayService.bubbleSort(jaggedArray, compareService, false);
        } catch (CustomArrayException | ArrayException e) {
            fail();
        }
        int[][] expected = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        boolean actual = Arrays.deepEquals(jaggedArray, expected);
        assertTrue(actual);
    }

    @Test
    public void testBubbleSortSumReversed() {
        int[][] jaggedArray = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        CompareService compareService = new SumCompareService();
        try {
            sortJaggedArrayService.bubbleSort(jaggedArray, compareService, true);
        } catch (CustomArrayException | ArrayException e) {
            fail();
        }
        int[][] expected = new int[][]{{7, 8, 9}, {4, 5, 6}, {1, 2, 3}};
        boolean actual = Arrays.deepEquals(jaggedArray, expected);
        assertTrue(actual);
    }
}