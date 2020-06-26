package com.kuntsevich.task4.reader;

import com.kuntsevich.task4.entity.CustomArray;
import com.kuntsevich.task4.exception.CustomArrayException;
import com.kuntsevich.task4.exception.InvalidDataException;
import com.kuntsevich.task4.parser.NumberParser;

import java.util.Scanner;

public class CustomArrayConsoleReader {

    public CustomArray read(int count) throws CustomArrayException, InvalidDataException {
        CustomArray customArray = new CustomArray(count);
        NumberParser numberParser = new NumberParser();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < count; i++) {
            String line = in.next();
            int number = numberParser.parseInt(line);
            customArray.add(number);
        }
        return customArray;
    }
}
