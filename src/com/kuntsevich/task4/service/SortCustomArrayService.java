package com.kuntsevich.task4.service;

import com.kuntsevich.task4.entity.CustomArray;
import com.kuntsevich.task4.exception.CustomArrayException;

public class SortCustomArrayService {

    private static final String ARRAY_NULL_MESSAGE = "Array is null";

    public void bubbleSort(CustomArray customArray) throws CustomArrayException {
        if (customArray == null) {
            throw new CustomArrayException(ARRAY_NULL_MESSAGE);
        }
        int length = customArray.size();
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                try {
                    if (customArray.get(j) > customArray.get(j + 1)) {
                        int temp = customArray.get(j);
                        customArray.set(customArray.get(j + 1), j);
                        customArray.set(temp, j + 1);
                    }
                } catch (CustomArrayException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void quickSort(CustomArray customArray, int low, int high) throws CustomArrayException {
        if (customArray == null) {
            throw new CustomArrayException(ARRAY_NULL_MESSAGE);
        }
        if (low >= high) {
            return;
        }
        int middle = low + (high - low) / 2;
        int pivot = customArray.get(middle);
        int i = low;
        int j = high;
        while (i <= j) {
            while (customArray.get(i) < pivot) {
                i++;
            }
            while (customArray.get(j) > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = customArray.get(i);
                customArray.set(customArray.get(j), i);
                customArray.set(temp, j);
                i++;
                j--;
            }
            if (low < j) {
                quickSort(customArray, low, j);
            }
            if (high > i) {
                quickSort(customArray, i, high);
            }
        }
    }

    public void insertSort(CustomArray customArray) throws CustomArrayException {
        if (customArray == null) {
            throw new CustomArrayException(ARRAY_NULL_MESSAGE);
        }
        int n = customArray.size();
        for (int i = 1; i < n; i++) {
            int key = customArray.get(i);
            int j = i - 1;
            while ((j > -1) && (customArray.get(j) > key)) {
                customArray.set(customArray.get(j), j + 1);
                j--;
            }
            customArray.set(key, j + 1);
        }
    }
}
