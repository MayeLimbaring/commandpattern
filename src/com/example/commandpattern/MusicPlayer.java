package com.example.commandpattern;

public class MusicPlayer {
    private int songNumber = 1;

    public void play() { System.out.println("Playing song " + songNumber); }
    public void stop() { System.out.println("Music stopped"); }
    public void next() {
        songNumber++;
        System.out.println("Skipping to song " + songNumber);
        play();
    }
}
