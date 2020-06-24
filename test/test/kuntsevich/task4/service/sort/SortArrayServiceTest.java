package test.kuntsevich.task4.service.sort;

import com.kuntsevich.task4.entity.CustomArray;
import com.kuntsevich.task4.exception.CustomArrayException;
import com.kuntsevich.task4.service.sort.SortArrayService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SortArrayServiceTest {

    private SortArrayService sortArrayService = new SortArrayService();

    @DataProvider(name = "sortArrays")
    public Object[][] createData() {
        Object[][] result = new Object[3][2];
        try {
            result[0][0] = new CustomArray(new int[]{-2, -1, 0, 1, 2});
            result[0][1] = new CustomArray(new int[]{-2, -1, 0, 1, 2});
            result[1][0] = new CustomArray(new int[]{2, 1, 0, -1, -2});
            result[1][1] = new CustomArray(new int[]{-2, -1, 0, 1, 2});
            result[2][0] = new CustomArray(new int[]{0, -2, 2, 1, -1});
            result[2][1] = new CustomArray(new int[]{-2, -1, 0, 1, 2});
        } catch (CustomArrayException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Test(dataProvider = "sortArrays")
    public void testBubbleSortPositive(CustomArray customArray, CustomArray expectedCustomArray) {
        try {
            sortArrayService.bubbleSort(customArray);
        } catch (CustomArrayException e) {
            fail();
        }
        assertEquals(customArray, expectedCustomArray);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void testBubbleSortException() throws CustomArrayException {
        sortArrayService.bubbleSort(null);
    }

    @Test(dataProvider = "sortArrays")
    public void testQuickSortPositive(CustomArray customArray, CustomArray expectedCustomArray) {
        try {
            sortArrayService.quickSort(customArray, 0, customArray.size() - 1);
        } catch (CustomArrayException e) {
            fail();
        }
        assertEquals(customArray, expectedCustomArray);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void testQuickSortException() throws CustomArrayException {
        sortArrayService.quickSort(null, 0, 1);
    }

    @Test(dataProvider = "sortArrays")
    public void testInsertSortPositive(CustomArray customArray, CustomArray expectedCustomArray) {
        try {
            sortArrayService.insertSort(customArray);
        } catch (CustomArrayException e) {
            fail();
        }
        assertEquals(customArray, expectedCustomArray);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void testInsertSortException() throws CustomArrayException {
        sortArrayService.insertSort(null);
    }
}