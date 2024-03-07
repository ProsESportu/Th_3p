package pdf4;

import java.io.File;
import java.util.Scanner;

public class RowNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku: ");
        String fileName = sc.nextLine();
        System.out.println("Podana nazwa pliku: " + fileName);
        File file = new File(fileName);
        try (Scanner fileScanner = new Scanner(file)) {

            for (int i = 1; fileScanner.hasNextLine(); i++) {

                String line = fileScanner.nextLine();
                System.out.println(i + ": " + line);
            }
        } catch (Exception e) {
            System.out.println("Błąd odczytu pliku");
        }
    }
}
