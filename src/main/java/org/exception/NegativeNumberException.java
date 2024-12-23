package org.exception;

public class NegativeNumberException extends Exception {
    private final int invalidValue;

    public NegativeNumberException(int value) {
        super("Negative value: " + value);
        this.invalidValue = value;
    }

    public int getInvalidValue() {
        return invalidValue;
    }
}
