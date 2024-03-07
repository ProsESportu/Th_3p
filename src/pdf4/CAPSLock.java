package pdf4;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class CAPSLock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku: ");
        String infileName = sc.nextLine();
        System.out.println("Podana nazwa pliku: " + infileName);
        System.out.println("Podaj nazwę drugiego pliku: ");
        String outfileName = sc.nextLine();
        System.out.println("Podana nazwa pliku: " + outfileName);
        File infile = new File(infileName);
        File outfile = new File(outfileName);

        try (Scanner in = new Scanner(infile); PrintWriter out = new PrintWriter(outfile)) {
            while (in.hasNextLine()) {
                String line = in.nextLine();
                out.println(line.toUpperCase());
            }
        } catch (Exception e) {
            System.out.println("Błąd odczytu pliku");
        }

    }
}
