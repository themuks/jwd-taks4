package test.kuntsevich.task4.parser;

import com.kuntsevich.task4.exception.InvalidDataException;
import com.kuntsevich.task4.parser.NumberParser;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberParserTest {

    private NumberParser numberParser = new NumberParser();

    @Test
    public void testParseIntPositive() {
        String data = "-112233";
        try {
            int actual = numberParser.parseInt(data);
            int expected = -112233;
            assertEquals(actual, expected);
        } catch (InvalidDataException e) {
            fail();
        }
    }

    @Test(expectedExceptions = InvalidDataException.class)
    public void testParseIntException() throws InvalidDataException {
        numberParser.parseInt("abc");
    }
}