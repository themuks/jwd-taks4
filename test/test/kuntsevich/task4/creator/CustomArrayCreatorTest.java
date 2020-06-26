package test.kuntsevich.task4.creator;

import com.kuntsevich.task4.creator.CustomArrayCreator;
import com.kuntsevich.task4.entity.CustomArray;
import com.kuntsevich.task4.exception.CustomArrayException;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CustomArrayCreatorTest {

    private CustomArrayCreator customArrayCreator = new CustomArrayCreator();

    @Test
    public void testCreateRandomCustomArrayPositive() {
        try {
            CustomArray customArray = customArrayCreator.createRandomCustomArray(10);
            int actual = customArray.size();
            int expected = 10;
            assertEquals(actual, expected);
        } catch (CustomArrayException e) {
            fail();
        }
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void testCreateRandomCustomArrayException() throws CustomArrayException {
        customArrayCreator.createRandomCustomArray(1);
    }
}