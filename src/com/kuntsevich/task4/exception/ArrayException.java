package com.kuntsevich.task4.exception;

public class ArrayException extends Exception {

    public ArrayException() {
        super();
    }

    public ArrayException(String message) {
        super(message);
    }

    public ArrayException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArrayException(Throwable cause) {
        super(cause);
    }
}
