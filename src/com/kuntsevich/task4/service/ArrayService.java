package com.kuntsevich.task4.service;

import com.kuntsevich.task4.entity.CustomArray;
import com.kuntsevich.task4.exception.CustomArrayException;

public class ArrayService {

    private static final String ARRAY_NULL_MESSAGE = "Array is null";

    public void bubbleSort(CustomArray customArray) {
        if (customArray != null) {
            int length = customArray.size();
            for (int i = 0; i < length - 1; i++) {
                for (int j = 0; j < length - i - 1; j++) {
                    try {
                        // TODO: 22.06.2020 Add option to choose sort rules
                        if (customArray.get(j) > customArray.get(i)) {
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
    }

    public void quickSort(CustomArray customArray) {
        if (customArray != null) {
            // TODO: 22.06.2020
        }
    }

    public void insertSort(CustomArray customArray) {
        if (customArray != null) {
            // TODO: 22.06.2020
        }
    }

    public int binarySearch(CustomArray customArray, int number) {
        if (customArray != null) {
            // TODO: 22.06.2020
        }
        return -1;
    }

    public int max(CustomArray customArray) throws CustomArrayException {
        if (customArray != null) {
            int max = customArray.get(0);
            for (int i = 1; i < customArray.size(); i++) {
                int number = customArray.get(i);
                if (max < number) {
                    max = number;
                }
            }
            return max;
        }
        throw new CustomArrayException(ARRAY_NULL_MESSAGE);
    }

    public int min(CustomArray customArray) throws CustomArrayException {
        if (customArray != null) {
            int min = customArray.get(0);
            for (int i = 1; i < customArray.size(); i++) {
                int number = customArray.get(i);
                if (min > number) {
                    min = number;
                }
            }
            return min;
        }
        throw new CustomArrayException(ARRAY_NULL_MESSAGE);
    }

    public CustomArray allPrimeNumbers(CustomArray customArray) throws CustomArrayException {
        if (customArray != null) {
            CustomArray result = new CustomArray();
            for (int i = 0; i < customArray.size(); i++) {
                int number = customArray.get(i);
                if (isPrime(number)) {
                    result.add(number);
                }
            }
            return result;
        }
        throw new CustomArrayException(ARRAY_NULL_MESSAGE);
    }

    public CustomArray allFibonachiNumbers(CustomArray customArray) throws CustomArrayException {
        if (customArray != null) {
            CustomArray result = new CustomArray();
            for (int i = 0; i < customArray.size(); i++) {
                int number = customArray.get(i);
                if (isFibonachi(number)) {
                    result.add(number);
                }
            }
            return customArray;
        }
        throw new CustomArrayException(ARRAY_NULL_MESSAGE);
    }

    public CustomArray numbersWithoutRepetition(CustomArray customArray, int digitsCount) throws CustomArrayException {
        if (customArray != null) {
            CustomArray result;
            if (digitsCount > 0) {
                result = new CustomArray();
                for (int i = 0; i < customArray.size(); i++) {
                    int number = customArray.get(i);
                    if (numberLength(number) == digitsCount && isDigitsDifferent(number)) {
                        result.add(number);
                    }
                }
            } else {
                result = new CustomArray(0);
            }
            return result;
        }
        throw new CustomArrayException(ARRAY_NULL_MESSAGE);
    }

    private boolean isDigitsDifferent(int number) {
        String stringNumber = Integer.toString(number);
        int numberLength = numberLength(number);
        for (int i = 0; i < numberLength; i++) {
            for (int j = i + 1; j < numberLength; j++) {
                if (stringNumber.charAt(i) == stringNumber.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    private int numberLength(int number) {
        String stringNumber = Integer.toString(number);
        return stringNumber.length();
    }

    private boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        if (number % 2 != 0) {
            for (int i = 3; i < Math.round(Math.sqrt(number)); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private boolean isFibonachi(int number) {
        int n0 = 1;
        int n1 = 1;
        int n2;
        while (n1 <= number) {
            if (number == n1) {
                return true;
            }
            n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
        }
        return false;
    }
}
