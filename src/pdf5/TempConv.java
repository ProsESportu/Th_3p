package pdf5;

public class TempConv {
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println("Fahrenheit: " + i + ", Celsius: " + fahrenheitToCelsius(i));
        }
    }
}
