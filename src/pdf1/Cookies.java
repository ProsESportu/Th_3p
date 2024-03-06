package pdf1;

import java.util.Scanner;

public class Cookies {
    public static void main(String[] args) {
        final double cookiesPerBox = 40;
        final double portionCount = 10;
        final double caloriesPerPortion = 300;
        final double caloriesPerCookie = (portionCount / cookiesPerBox) * caloriesPerPortion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ile ciasteczek zjadłeś?");
        double cookieCount = sc.nextDouble();
        System.out.println("zjedzone ciasteczka: " + cookieCount);
        double calories = cookieCount * caloriesPerCookie;
        System.out.println("zjedzone kalorie: " + calories);

    }
}
