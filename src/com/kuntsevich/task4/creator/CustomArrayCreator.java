package com.kuntsevich.task4.creator;

import com.kuntsevich.task4.entity.CustomArray;
import com.kuntsevich.task4.exception.CustomArrayException;

import java.util.Random;

public class CustomArrayCreator {

    public CustomArray createRandomCustomArray(int size) throws CustomArrayException {
        CustomArray customArray = new CustomArray(size);
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int number = random.nextInt();
            customArray.add(number);
        }
        return customArray;
    }
}
