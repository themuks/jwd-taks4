package com.kuntsevich.task4.file;

import com.kuntsevich.task4.entity.CustomArray;
import com.kuntsevich.task4.exception.CustomArrayException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CustomArrayFileReader {

    public CustomArray read(File file, int count) throws CustomArrayException {
        CustomArray customArray = new CustomArray(count);
        if (file.exists() && file.isFile()) {
            try (Scanner in = new Scanner(file)) {
                while (in.hasNextLine()) {
                    if (in.hasNextInt()) {
                        int number = in.nextInt();
                        customArray.add(number);
                    } else {
                        in.next();
                    }
                }
            } catch (FileNotFoundException e) {
                throw new CustomArrayException("Can't read custom array from file");
            }
        } else {
            throw new CustomArrayException("Can't read custom array from file");
        }
        return customArray;
    }
}
