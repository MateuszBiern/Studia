

package org.example.test;


import org.example.converter.CelsiusConverter;
import org.example.converter.FahrenheitConverter;
import org.example.converter.TemperatureConverter;



public class TemperatureConverterTest {

    public static void main(String[] args) {
        testTemperatureConversion();
    }

    public static void testTemperatureConversion() {
        TemperatureConverter converter = new TemperatureConverter();


        double celsius = converter.convertToCelsius(32);
        assertEquals(0, celsius, 0.01);


        CelsiusConverter celsiusConverter = new CelsiusConverter();
        double fahrenheit = celsiusConverter.convertToFahrenheit(25);
        assertEquals(77, fahrenheit, 0.01);

        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        celsius = fahrenheitConverter.convertToCelsius(98.6);
        assertEquals(37, celsius, 0.01);
    }

    public static void assertEquals(double expected, double actual, double delta) {
        if (Math.abs(expected - actual) > delta) {
            System.err.println("Assertion failed! Expected: " + expected + ", Actual: " + actual);
        } else {
            System.out.println("Assertion succeeded! Expected: " + expected + ", Actual: " + actual);
        }
    }
}
