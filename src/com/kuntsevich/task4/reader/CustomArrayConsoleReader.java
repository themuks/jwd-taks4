package com.kuntsevich.task4.reader;

import com.kuntsevich.task4.entity.CustomArray;
import com.kuntsevich.task4.exception.CustomArrayException;

import java.util.Scanner;

public class CustomArrayConsoleReader {

    public CustomArray read(int count) throws CustomArrayException {
        CustomArray customArray = new CustomArray(count);
        Scanner in = new Scanner(System.in);
        int i = 0;
        while (i < count) {
            if (in.hasNextInt()) {
                customArray.add(in.nextInt());
                i++;
            } else {
                in.next();
            }
        }
        return customArray;
    }
}
