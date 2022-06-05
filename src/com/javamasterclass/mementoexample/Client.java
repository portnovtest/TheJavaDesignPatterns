package com.javamasterclass.mementoexample;

public class Client {
    public static void main(String[] args) {
        var caretaker = new FileWriterCaretaker();
        var fileWriter = new FileWriterUtil("data.txt");
        fileWriter.write("First state of Data:\nMyra\nLucy\n");
        System.out.println(fileWriter + "\n\n");
        // save the file
        caretaker.save(fileWriter);
        // now write something else
        fileWriter.write("Second set of Data: \nJason\n");
        System.out.println(fileWriter + "\n\n");
        // undo the last save
        caretaker.undo(fileWriter);
        System.out.println(fileWriter + "\n\n");
    }
}
