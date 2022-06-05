package com.javamasterclass.mementoexample;

public class FileWriterUtil {
    private String filename;
    private StringBuilder content;

    public FileWriterUtil(String file) {
        this.filename = file;
        this.content = new StringBuilder();
    }

    @Override
    public String toString() {
        return this.content.toString();
    }

    public void write(String str) {
        content.append(str);
    }

    // creates the memento
    public Memento save() {
        return new Memento(this.filename, this.content);
    }

    // restore into its earlier state
    public void undoToLastSave(Object obj) {
        var memento = (Memento) obj;
        this.filename = memento.fileName;
        this.content = memento.content;
    }

    private static class Memento {
        private final String fileName;
        private final StringBuilder content;

        public Memento(String file, StringBuilder content) {
            this.fileName = file;
            // notice the deep copy so that Memento and FileWriterUtil content variables don't refer to same object
            this.content = new StringBuilder(content);
        }
    }
}
