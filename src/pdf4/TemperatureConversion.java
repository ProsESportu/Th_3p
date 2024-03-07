package pdf4;

public class TemperatureConversion {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println("Celsius: " + i + " Fahrenheit: " + celsiusToFahrenheit(i));
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }
}
