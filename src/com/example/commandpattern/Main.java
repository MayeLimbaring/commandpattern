package com.example.commandpattern;

public class Main {
    public static void main(String[] args) {
        // Create devices
        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();

        // Create commands
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        Command increaseTemp = new ThermostatIncreaseCommand(thermostat);
        Command decreaseTemp = new ThermostatDecreaseCommand(thermostat);
        Command playMusic = new MusicPlayerPlayCommand(musicPlayer);
        Command stopMusic = new MusicPlayerStopCommand(musicPlayer);

        // Remote Control
        RemoteControl remote = new RemoteControl();

        // Control Light
        remote.setCommand(lightOn);
        remote.pressButton();

        remote.setCommand(lightOff);
        remote.pressButton();

        // Control Thermostat
        remote.setCommand(increaseTemp);
        remote.pressButton();

        remote.setCommand(decreaseTemp);
        remote.pressButton();

        // Control Music Player
        remote.setCommand(playMusic);
        remote.pressButton();

        remote.setCommand(stopMusic);
        remote.pressButton();
    }
}
