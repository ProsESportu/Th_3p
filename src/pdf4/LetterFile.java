package pdf4;

import java.io.File;
import java.util.Scanner;

public class LetterFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku: ");
        String fileName = sc.nextLine();
        System.out.println("Podana nazwa pliku: " + fileName);
        System.out.println("Podaj szukaną literę: ");
        char letter = sc.nextLine().charAt(0);
        System.out.println("Podana litera: " + letter);
        int count = 0;
        File file = new File(fileName);
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == letter) {
                        count++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Błąd odczytu pliku");
        }
        System.out.println("Litera " + letter + " występuje w pliku " + count + " razy");
    }
}
