package com.example.commandpattern;

public class MusicPlayerNextCommand implements Command {
    private MusicPlayer player;

    public MusicPlayerNextCommand(MusicPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.next();
    }
}
