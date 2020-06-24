package com.kuntsevich.task4.service.sort;

import com.kuntsevich.task4.entity.ArrayException;

public class MinCompareService implements CompareService {

    @Override
    public int compareCharacteristic(int[] array) throws ArrayException {
        if (array != null && array.length > 0) {
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                int number = array[i];
                if (min > number) {
                    min = number;
                }
            }
            return min;
        }
        throw new ArrayException("Array is null or is empty");
    }
}