package com.kuntsevich.task4.reader;

import com.kuntsevich.task4.entity.CustomArray;
import com.kuntsevich.task4.exception.CustomArrayException;
import com.kuntsevich.task4.exception.InvalidDataException;
import com.kuntsevich.task4.parser.NumberParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CustomArrayFileReader {

    public CustomArray read(File file, int count) throws CustomArrayException, InvalidDataException {
        CustomArray customArray = new CustomArray(count);
        NumberParser numberParser = new NumberParser();
        if (!file.exists() || !file.isFile()) {
            throw new CustomArrayException("Can't read custom array from file");
        }
        try (Scanner in = new Scanner(file)) {
            while (in.hasNextLine()) {
                String line = in.next();
                int number = numberParser.parseInt(line);
                customArray.add(number);
            }
        } catch (FileNotFoundException e) {
            throw new CustomArrayException("Can't read custom array from file");
        }
        return customArray;
    }
}
