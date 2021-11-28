package com.javamasterclass.adapterobjectcompositionexample.challenge;

public class Client {
    public static void main(String[] args) {
        var audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "philMusicMp3");

        var mp4Player = new Mp4Player();
        var advancedMediaPlayerAdapter = new AdvancedMediaPlayerAdapter(mp4Player);
        advancedMediaPlayerAdapter.play("mp4", "alone.mp4");

        var vlcPlayer = new VlcPlayer();
        var advancedMediaPlayerAdapter2 = new AdvancedMediaPlayerAdapter(vlcPlayer);
        advancedMediaPlayerAdapter2.play("vlc", "far_far_away.vlc");


        audioPlayer.play("vlc", "far_far_away.vlc");


    }
}
