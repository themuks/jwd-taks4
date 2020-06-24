package com.kuntsevich.task4.entity;

import com.kuntsevich.task4.exception.CustomArrayException;

public class CustomArray {

    private static final int DEFAULT_SIZE = 128;

    private int[] array;
    private int currentNumberIndex;

    public CustomArray() {
        array = new int[DEFAULT_SIZE];
        currentNumberIndex = -1;
    }

    public CustomArray(int size) throws CustomArrayException {
        if (size > 1) {
            array = new int[size];
            currentNumberIndex = -1;
        } else {
            throw new CustomArrayException("Invalid size");
        }
    }

    public CustomArray(int[] array) throws CustomArrayException {
        if (array != null) {
            if (array.length > 1) {
                this.array = array;
                currentNumberIndex = array.length - 1;
            } else {
                throw new CustomArrayException("Invalid size");
            }
        } else {
            throw new CustomArrayException("Array is null");
        }
    }

    public int get(int index) throws CustomArrayException {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            throw new CustomArrayException("Array index out of bounds");
        }
    }

    public boolean set(int number, int index) {
        if (index >= 0 && index < array.length) {
            array[index] = number;
            return true;
        }
        return false;
    }

    public boolean add(int number) {
        if (currentNumberIndex < array.length - 1) {
            currentNumberIndex++;
            array[currentNumberIndex] = number;
            return true;
        }
        return false;
    }

    public boolean remove() {
        if (currentNumberIndex >= 0) {
            currentNumberIndex--;
            return true;
        }
        return false;
    }

    public int size() {
        return currentNumberIndex + 1;
    }

    public void clear() {
        currentNumberIndex = -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomArray customArray = (CustomArray) o;
        if (this.size() == customArray.size()) {
            for (int i = 0; i < this.size(); i++) {
                try {
                    if (this.get(i) != customArray.get(i)) {
                        return false;
                    }
                } catch (CustomArrayException e) {
                    e.printStackTrace();
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 1;
        for (int i = 0; i < this.size(); i++) {
            try {
                result = 31 * result + this.get(i);
            } catch (CustomArrayException e) {
                e.printStackTrace();
            }
        }
        result = 31 * result + currentNumberIndex;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomArray{");
        sb.append("array=[");
        for (int i = 0; i < this.size(); i++) {
            try {
                sb.append(this.get(i));
            } catch (CustomArrayException e) {
                e.printStackTrace();
            }
            if (i != this.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
        sb.append(", currentNumberIndex=").append(currentNumberIndex);
        sb.append('}');
        return sb.toString();
    }
}
