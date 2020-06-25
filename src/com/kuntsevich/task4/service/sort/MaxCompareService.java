package com.kuntsevich.task4.service.sort;

import com.kuntsevich.task4.exception.ArrayException;

public class MaxCompareService implements CompareService {

    @Override
    public int compareCharacteristic(int[] array) throws ArrayException {
        if (array != null && array.length > 0) {
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                int number = array[i];
                if (max < number) {
                    max = number;
                }
            }
            return max;
        }
        throw new ArrayException("Array is null or is empty");
    }
}
