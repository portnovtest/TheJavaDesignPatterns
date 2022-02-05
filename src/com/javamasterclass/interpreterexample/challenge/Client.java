package com.javamasterclass.interpreterexample.challenge;

public class Client {
    public static Expression getMaleExpression() {
        var robert = new TerminalExpression("Robert");
        var john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWomanExpression() {
        var julie = new TerminalExpression("Julie");
        var married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        var isMale = getMaleExpression();
        var isMarriedWoman = getMarriedWomanExpression();
        var ic = new Context("John");
        System.out.println("John is male? " + isMale.interpret(ic));

        var ic2 = new Context("Married Julie");
        System.out.println("Julie is a married woman? " + isMarriedWoman.interpret(ic2));

        var ic3 = new Context("Lucy");
        System.out.println("Lucy is male? " + isMale.interpret(ic3));
    }
}
