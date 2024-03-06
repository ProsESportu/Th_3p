import java.util.Scanner;

public class Grapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj długość rzędu winogron");
        double length = sc.nextDouble();
        sc.nextLine();
        System.out.println("długość: " + length);
        System.out.println("Podaj miejsce na okratowanie");
        double fence = sc.nextDouble();
        sc.nextLine();
        System.out.println("okratowanie: " + fence);
        System.out.println("Podaj odległość między sadzonkami");
        double distance = sc.nextDouble();
        sc.nextLine();
        System.out.println("odległość: " + distance);
        double count = (length - 2 * fence) / distance;
        System.out.println("liczba sadzonek: " + count);
    }
}
