package com.example.commandpattern;

public class MusicPlayerStopCommand implements Command {
    private MusicPlayer player;
    public MusicPlayerStopCommand(MusicPlayer player) { this.player = player; }
    @Override
    public void execute() { player.stop(); }
}