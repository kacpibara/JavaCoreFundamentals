package _14;

public class SmartThermostat implements SmartDevice{
    double currentTemp;
    double targetTemp;

    public SmartThermostat(double currentTemp, double targetTemp) {
        this.currentTemp = currentTemp;
        this.targetTemp = targetTemp;
    }

    @Override
    public String getStatus() {
        return "Thermostat: Current temp is " + currentTemp + "°C and target temp is " + targetTemp + "°C";
    }
}
