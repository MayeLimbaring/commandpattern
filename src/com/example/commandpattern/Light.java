package com.example.commandpattern;

public class Light {
    private int brightness = 100; // default brightness 100%

    public void on() {
        System.out.println("Light is ON at " + brightness + "% brightness");
    }

    public void off() {
        System.out.println("Light is OFF");
    }

    public void setBrightness(int brightness) {
        if (brightness < 0) brightness = 0;
        if (brightness > 100) brightness = 100;
        this.brightness = brightness;
        System.out.println("Brightness set to " + this.brightness + "%");
    }
}
