package com.javamasterclass.interpreterexample;

public class IntToHexExpression implements Expression {
    private int i;

    public IntToHexExpression(int c) {
        i = c;
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getHexadecimalFormat(i);
    }
}
