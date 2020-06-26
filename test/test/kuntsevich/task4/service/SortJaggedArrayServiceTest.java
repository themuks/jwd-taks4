package test.kuntsevich.task4.service;

import com.kuntsevich.task4.exception.ArrayException;
import com.kuntsevich.task4.exception.CustomArrayException;
import com.kuntsevich.task4.service.ArrayComparator;
import com.kuntsevich.task4.service.SortJaggedArrayService;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

public class SortJaggedArrayServiceTest {

    private SortJaggedArrayService sortJaggedArrayService = new SortJaggedArrayService();

    @Test
    public void testBubbleSortMax() {
        int[][] jaggedArray = new int[][]{{7, 8, 9}, {4, 5, 6}, {1, 2, 3}};
        try {
            sortJaggedArrayService.bubbleSort(jaggedArray, ArrayComparator.MAX_VALUE, false);
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
        try {
            sortJaggedArrayService.bubbleSort(jaggedArray, ArrayComparator.MAX_VALUE, true);
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
        try {
            sortJaggedArrayService.bubbleSort(jaggedArray, ArrayComparator.MIN_VALUE, false);
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
        try {
            sortJaggedArrayService.bubbleSort(jaggedArray, ArrayComparator.MIN_VALUE, true);
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
        try {
            sortJaggedArrayService.bubbleSort(jaggedArray, ArrayComparator.SUM, false);
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
        try {
            sortJaggedArrayService.bubbleSort(jaggedArray, ArrayComparator.SUM, true);
        } catch (CustomArrayException | ArrayException e) {
            fail();
        }
        int[][] expected = new int[][]{{7, 8, 9}, {4, 5, 6}, {1, 2, 3}};
        boolean actual = Arrays.deepEquals(jaggedArray, expected);
        assertTrue(actual);
    }
}