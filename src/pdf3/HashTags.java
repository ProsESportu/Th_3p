package pdf3;

public class HashTags {
    public static void main(String[] args) {
        for (int i = 2; i <= 7; i++) {
            System.out.print("#");

            for (int j=i-2;j>0;j--){
                System.out.print(" ");
            }
            System.out.print("#");
            System.out.println();
        }

    }
}
