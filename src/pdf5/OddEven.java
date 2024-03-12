package pdf5;

import java.util.Random;

public class OddEven {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int evenCount = 0;
        for (int i = 0; i < 100; i++) {
            int number = random.nextInt();
            System.out.println("Liczba " + number + (isEven(number) ? " jest" : " nie jest") + " parzysta.");
            evenCount += isEven(number) ? 1 : 0;
        }
        System.out.println("Liczba parzystych liczb: " + evenCount);
        System.out.println("Liczba nieparzystych liczb: " + (100 - evenCount));
    }

}
