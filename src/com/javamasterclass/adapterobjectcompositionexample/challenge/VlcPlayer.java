package com.javamasterclass.adapterobjectcompositionexample.challenge;

public class VlcPlayer implements AdvancedMediaPlayer {
    String myFile;

    @Override
    public void loadFileName(String fileName) {
        myFile = fileName;
    }

    @Override
    public void listen() {
        System.out.println("Playing vlc file. Name: " + myFile);
    }
}
