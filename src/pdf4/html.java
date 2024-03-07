package pdf4;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class html {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj swoje imie: ");
        String name = sc.nextLine();
        System.out.println("Opisz siebie: ");
        String description = sc.nextLine();
        PrintWriter out = new PrintWriter("index.html");
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Moja strona</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<center>");
        out.println("<h1>" + name + "</h1>");
        out.println("</center>");
        out.println("<hr />");
        out.println("<p>" + description + "</p>");
        out.println("<hr />");
        out.println("</body>");
        out.println("</html>");
        out.close();
        Desktop.getDesktop().browse(new File("index.html").toURI());


    }
}
