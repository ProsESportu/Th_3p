import java.util.Scanner;

public class Taxes {
    public static void main(String[] args) {
        final double stateTaxRate = 0.04;
        final double localTaxRate = 0.02;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wartość produktu");
        double value = sc.nextDouble();
        sc.nextLine();
        System.out.println("Wartość produktu: " + value);
        double stateTax = value * stateTaxRate;
        System.out.println("Podatek stanowy: " + stateTax);
        double localTax = value * localTaxRate;
        System.out.println("Podatek lokalny: " + localTax);
        double valueAfterTax = value + localTax + stateTax;
        System.out.println("Łączna cena sprzedaży: " + valueAfterTax);
    }
}
