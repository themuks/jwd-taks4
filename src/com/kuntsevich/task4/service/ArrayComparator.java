package com.kuntsevich.task4.service;

import java.util.Comparator;

public enum ArrayComparator implements Comparator<int[]> {

    SUM() {
        @Override
        public int compare(int[] array1, int[] array2) {
            int sum1 = 0;
            int sum2 = 0;
            for (int value : array1) {
                sum1 += value;
            }
            for (int value : array2) {
                sum2 += value;
            }
            if (sum1 > sum2) {
                return 1;
            } else {
                if (sum1 == sum2) {
                    return 0;
                }
            }
            return -1;
        }
    },

    MAX_VALUE() {
        @Override
        public int compare(int[] array1, int[] array2) {
            if (array1.length == 0) {
                if (array2.length > 0) {
                    return -1;
                }
            }
            if (array2.length == 0) {
                if (array1.length > 0) {
                    return 1;
                }
            }
            if (array1.length == 0 && array2.length == 0) {
                return 0;
            }
            int max1 = array1[0];
            int max2 = array2[0];
            for (int value : array1) {
                if (max1 < value) {
                    max1 = value;
                }
            }
            for (int value : array2) {
                if (max2 < value) {
                    max2 = value;
                }
            }
            if (max1 > max2) {
                return 1;
            } else {
                if (max1 == max2) {
                    return 0;
                }
            }
            return -1;
        }
    },

    MIN_VALUE() {
        @Override
        public int compare(int[] array1, int[] array2) {
            if (array1.length == 0) {
                if (array2.length > 0) {
                    return -1;
                }
            }
            if (array2.length == 0) {
                if (array1.length > 0) {
                    return 1;
                }
            }
            if (array1.length == 0 && array2.length == 0) {
                return 0;
            }
            int min1 = array1[0];
            int min2 = array2[0];
            for (int value : array1) {
                if (min1 > value) {
                    min1 = value;
                }
            }
            for (int value : array2) {
                if (min2 > value) {
                    min2 = value;
                }
            }
            if (min1 > min2) {
                return 1;
            } else {
                if (min1 == min2) {
                    return 0;
                }
            }
            return -1;
        }
    }
}
