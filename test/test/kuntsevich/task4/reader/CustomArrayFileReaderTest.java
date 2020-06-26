package test.kuntsevich.task4.reader;

import com.kuntsevich.task4.entity.CustomArray;
import com.kuntsevich.task4.exception.CustomArrayException;
import com.kuntsevich.task4.exception.InvalidDataException;
import com.kuntsevich.task4.reader.CustomArrayFileReader;
import org.testng.annotations.Test;

import java.io.File;

import static org.testng.Assert.*;

public class CustomArrayFileReaderTest {

    private CustomArrayFileReader customArrayFileReader = new CustomArrayFileReader();

    @Test
    public void testReadPositive() {
        File file = new File("resources/file/customArray.txt");
        try {
            CustomArray actual = customArrayFileReader.read(file, 11);
            int[] array = new int[]{-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
            CustomArray expected = new CustomArray(array);
            assertEquals(actual, expected);
        } catch (CustomArrayException | InvalidDataException e) {
            fail();
        }
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void testReadException() throws CustomArrayException {
        File file = new File("resources/file/array.txt"); // Not exist
        try {
            customArrayFileReader.read(file, 11);
        } catch (InvalidDataException e) {
            fail();
        }
    }
}