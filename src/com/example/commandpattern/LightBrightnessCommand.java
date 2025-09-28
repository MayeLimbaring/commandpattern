package com.example.commandpattern;

import java.util.Scanner;

public class LightBrightnessCommand implements Command {
    private Light light;

    public LightBrightnessCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter brightness (0-100): ");
        int brightness = scanner.nextInt();
        light.setBrightness(brightness);
    }
}
