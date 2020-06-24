package com.kuntsevich.task4.service.sort;

public class SumCompareService implements CompareService {

    @Override
    public int compareCharacteristic(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
