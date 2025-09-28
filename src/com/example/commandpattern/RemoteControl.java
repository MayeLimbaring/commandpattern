package com.example.commandpattern;

import java.util.Scanner;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) { this.command = command; }
    public void pressButton() { if (command != null) command.execute(); }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Light light = new Light();
        MusicPlayer player = new MusicPlayer();
        Thermostat thermostat = new Thermostat();

        RemoteControl remote = new RemoteControl();

        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        MusicPlayerPlayCommand playMusic = new MusicPlayerPlayCommand(player);
        MusicPlayerStopCommand stopMusic = new MusicPlayerStopCommand(player);
        ThermostatIncreaseCommand increaseTemp = new ThermostatIncreaseCommand(thermostat);
        ThermostatDecreaseCommand decreaseTemp = new ThermostatDecreaseCommand(thermostat);

        while (true) {
            System.out.println("\nChoose action:");
            System.out.println("1. Turn Light ON");
            System.out.println("2. Turn Light OFF");
            System.out.println("3. Play Music");
            System.out.println("4. Stop Music");
            System.out.println("5. Increase Temperature");
            System.out.println("6. Decrease Temperature");
            System.out.println("7. Set Light Brightness");
            System.out.println("8. Next Music Track");
            System.out.println("0. Exit");
            System.out.print("Choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> remote.setCommand(lightOn);
                case 2 -> remote.setCommand(lightOff);
                case 3 -> remote.setCommand(playMusic);
                case 4 -> remote.setCommand(stopMusic);
                case 5 -> remote.setCommand(increaseTemp);
                case 6 -> remote.setCommand(decreaseTemp);
                case 7 -> remote.setCommand(new LightBrightnessCommand(light));
                case 8 -> remote.setCommand(new MusicPlayerNextCommand(player));
                case 0 -> { System.out.println("Exiting..."); return; }
                default -> { System.out.println("Invalid choice!"); continue; }
            }

            remote.pressButton();
        }
    }
}
