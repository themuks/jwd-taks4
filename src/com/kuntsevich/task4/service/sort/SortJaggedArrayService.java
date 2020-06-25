package com.kuntsevich.task4.service.sort;

import com.kuntsevich.task4.exception.ArrayException;
import com.kuntsevich.task4.exception.CustomArrayException;

public class SortJaggedArrayService {

    private static final String ARRAY_NULL_MESSAGE = "Array is null";

    public void bubbleSort(int[][] jaggedArray, CompareService compareService, boolean isReversed) throws CustomArrayException, ArrayException {
        if (jaggedArray != null) {
            int length = jaggedArray.length;
            for (int i = 0; i < length - 1; i++) {
                for (int j = 0; j < length - i - 1; j++) {
                    int characteristic1 = compareService.compareCharacteristic(jaggedArray[j]);
                    int characteristic2 = compareService.compareCharacteristic(jaggedArray[j + 1]);
                    if ((characteristic1 > characteristic2) ^ isReversed) {
                        int[] temp = jaggedArray[j];
                        jaggedArray[j] = jaggedArray[j + 1];
                        jaggedArray[j + 1] = temp;
                    }
                }
            }
        } else {
            throw new CustomArrayException(ARRAY_NULL_MESSAGE);
        }
    }
}
