package com.kuntsevich.task4.parser;

import com.kuntsevich.task4.exception.InvalidDataException;

public class NumberParser {

    public int parseInt(String data) throws InvalidDataException {
        int result = 0;
        if (data.matches("-?\\d{1,6}")) {
            result = Integer.parseInt(data);
        } else {
            throw new InvalidDataException("Invalid integer string");
        }
        return result;
    }
}
