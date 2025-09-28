package com.example.commandpattern;

public class ThermostatDecreaseCommand implements Command {
    private Thermostat thermostat;
    public ThermostatDecreaseCommand(Thermostat thermostat) { this.thermostat = thermostat; }
    @Override
    public void execute() { thermostat.decrease(); }
}