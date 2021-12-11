package com.javamasterclass.decoratorexample2;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Client {
    public static void main(String[] args) {
        int c;

        var bytes = "Phil D aaaBBBcccDDD".getBytes();
        try {
            var in = new LowerCaseInputStream(new ByteArrayInputStream(bytes));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
