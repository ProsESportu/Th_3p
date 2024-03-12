package pdf5;

public class Fall {
    public static double fallingDistance(double time) {
        return 0.5 * 9.8 * Math.pow(time, 2);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Czas: " + i + "s, odległość: " + fallingDistance(i) + "m");
        }
    }
}
