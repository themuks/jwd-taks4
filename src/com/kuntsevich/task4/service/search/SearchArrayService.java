package com.kuntsevich.task4.service.search;

import com.kuntsevich.task4.entity.CustomArray;
import com.kuntsevich.task4.exception.CustomArrayException;
import com.kuntsevich.task4.service.sort.SortArrayService;

public class SearchArrayService {

    private static final String ARRAY_NULL_MESSAGE = "Array is null";

    public int binarySearch(CustomArray customArray, int number) throws CustomArrayException {
        if (customArray != null) {
            int index = -1;
            int low = 0;
            int high = customArray.size() - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (customArray.get(mid) < number) {
                    low = mid + 1;
                } else if (customArray.get(mid) > number) {
                    high = mid - 1;
                } else if (customArray.get(mid) == number) {
                    index = mid;
                    break;
                }
            }
            return index;
        }
        throw new CustomArrayException(ARRAY_NULL_MESSAGE);
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

    public int sum(CustomArray customArray) {
        int sum = 0;
        for (int i = 0; i < customArray.size(); i++) {
            try {
                sum += customArray.get(i);
            } catch (CustomArrayException e) {
                e.printStackTrace();
            }
        }
        return sum;
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
            return result;
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
        if (number < 0) {
            number *= -1;
        }
        String stringNumber = Integer.toString(number);
        return stringNumber.length();
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
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
