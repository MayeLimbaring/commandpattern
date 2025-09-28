package com.example.commandpattern;

public class ThermostatIncreaseCommand implements Command {
    private Thermostat thermostat;
    public ThermostatIncreaseCommand(Thermostat thermostat) { this.thermostat = thermostat; }
    @Override
    public void execute() { thermostat.increase(); }
}
