package Aufgabe_3;

public class CelsiusAndFahrenheit {
    // Temperatur in °C = (Temperatur in °F − 32) / 1,8
    // Temperatur in °F = °C * 1,8 + 32

    public static double fromCelsiusToFahrenheit(double Temperatur_in_Celsius){
        return (Temperatur_in_Celsius * 18) / 10 + 32;

    }
    public static double fromFahrenheitToCelsius (double Temperatur_in_Fahrenheit){
        return (Temperatur_in_Fahrenheit - 32) / 18 * 10;
    }

    public static void main(String[] args) {
        System.out.println(fromFahrenheitToCelsius(120));
    }
}
