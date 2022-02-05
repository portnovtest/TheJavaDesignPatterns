package com.javamasterclass.interpreterexample.challenge;

public class AndExpression implements Expression {
    private Expression exp1, exp2;

    public AndExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public boolean interpret(Context context) {
        return exp1.interpret(context) && exp2.interpret(context);
    }
}
