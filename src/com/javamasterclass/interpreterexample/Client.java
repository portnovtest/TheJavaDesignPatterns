package com.javamasterclass.interpreterexample;

public class Client {
    public InterpreterContext ic;

    public Client(InterpreterContext i) {
        ic = i;
    }

    public String interpret(String str) {
        Expression exp;
        // perform the parsing
        var parseInt = Integer.parseInt(str.substring(0, str.indexOf(" ")));
        if (str.contains("Hexadecimal")) {
            exp = new IntToHexExpression(parseInt);
        } else if (str.contains("Binary")) {
            exp = new IntToBinaryExpression(parseInt);
        } else {
            return str;
        }
        return exp.interpret(ic);
    }

    public static void main(String[] args) {
        var str1 = "28 in Binary";
        var str2 = "28 in Hexadecimal";
        var ec = new Client(new InterpreterContext());
        System.out.println(str1 + " = " + ec.interpret(str1));
        System.out.println(str2 + " = " + ec.interpret(str2));

    }
}
