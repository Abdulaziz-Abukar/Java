/*
in this lesson, I will create a program that converts Fahrenheit to Celsius.
based on the conversion it will indicate whether it is hot, normal or cold.
 */

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please provide a temperature in Fahrenheit: ");
        double fahrenheitInput = input.nextDouble(); // Use double for more precise calculations

        double fahrenheitToCelsius = (fahrenheitInput - 32) * 5 / 9.0; // Ensure decimal division

        String formattedTemperature = String.format("%.1f°C", fahrenheitToCelsius);

        if (fahrenheitToCelsius >= 100) {
            System.out.println(formattedTemperature + " is above the boiling point of water.");
        } else if (fahrenheitToCelsius > 0 && fahrenheitToCelsius < 100) {
            System.out.println(formattedTemperature + " is good weather outside.");
        } else {
            System.out.println(formattedTemperature + " is freezing weather.");
        }
    }
}

