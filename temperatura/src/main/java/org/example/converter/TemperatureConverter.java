package org.example.converter;

public class TemperatureConverter {
    public double convertToCelsius(double temperature) {
        return (temperature - 32) * 5 / 9;
    }
}
