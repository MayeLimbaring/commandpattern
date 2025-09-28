package com.example.commandpattern;

public class MusicPlayerPlayCommand implements Command {
    private MusicPlayer player;
    public MusicPlayerPlayCommand(MusicPlayer player) { this.player = player; }
    @Override
    public void execute() { player.play(); }
}