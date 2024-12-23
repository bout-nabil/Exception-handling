package org.Program;

import org.exception.NegativeNumberException;

public class NaturalInteger {
    private int value;

    public NaturalInteger(int value) throws NegativeNumberException {
        if (value < 0) {
            throw new NegativeNumberException(value);
        }
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) throws NegativeNumberException {
        if (value < 0) {
            throw new NegativeNumberException(value);
        }
        this.value = value;
    }

    public void decrement() throws NegativeNumberException {
        if (value - 1 < 0) {
            throw new NegativeNumberException(value - 1);
        }
        value--;
    }
}
