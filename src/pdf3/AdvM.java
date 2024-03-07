package pdf3;

public class AdvM {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1, j = 30; i <= 30 && j > 0; i++, j--) {
            sum += i / j;
        }
        System.out.println(sum);
    }

}
