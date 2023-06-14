package org.example.converter;

public class FahrenheitConverter {
    public double convertToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
