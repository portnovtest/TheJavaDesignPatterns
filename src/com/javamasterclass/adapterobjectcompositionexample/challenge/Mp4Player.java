package com.javamasterclass.adapterobjectcompositionexample.challenge;

public class Mp4Player implements AdvancedMediaPlayer {
    String myFile;

    @Override
    public void loadFileName(String fileName) {
        myFile = fileName;
    }

    @Override
    public void listen() {
        System.out.println("Playing mp4 file. Name: " + myFile);
    }
}
