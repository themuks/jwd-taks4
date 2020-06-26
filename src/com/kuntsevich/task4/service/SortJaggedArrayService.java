package com.kuntsevich.task4.service;

import com.kuntsevich.task4.exception.ArrayException;
import com.kuntsevich.task4.exception.CustomArrayException;

public class SortJaggedArrayService {

    public void bubbleSort(int[][] jaggedArray, ArrayComparator arrayComparator, boolean isReversed) throws CustomArrayException, ArrayException {
        if (jaggedArray == null || arrayComparator == null) {
            throw new CustomArrayException("One or more parameter is null");
        }
        int length = jaggedArray.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                int result = arrayComparator.compare(jaggedArray[j], jaggedArray[j + 1]);
                boolean flag = false;
                if (result == 1) {
                    flag = true;
                }
                if (flag ^ isReversed) {
                    int[] temp = jaggedArray[j];
                    jaggedArray[j] = jaggedArray[j + 1];
                    jaggedArray[j + 1] = temp;
                }
            }
        }
    }
}
