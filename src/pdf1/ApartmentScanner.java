package pdf1;

import java.util.Scanner;

public class ApartmentScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double apartmentArea = 0;
        for (int i = 1; i < 5; i++) {
            System.out.println("Podaj długość pokoju " + i + " :");
            double roomX = sc.nextDouble();
            sc.nextLine();
            System.out.println("Podana długość wynosi: " + roomX);
            System.out.println("Podaj szerokość pokoju " + i + " :");
            double roomY = sc.nextDouble();
            sc.nextLine();
            System.out.println("Podana szerokość wynosi: " + roomY);
            double roomArea = roomX * roomY;
            apartmentArea += roomArea;
            System.out.println("Powierzchnia pokoju wynosi: " + roomArea);
        }
        System.out.println("Całkowita powierzchnia mieszkania wynosi: " + apartmentArea);
        System.out.println("Podaj ilość osób w mieszkniu:");
        int peopleCount = sc.nextInt();
        sc.nextLine();
        double areaPerPerson = apartmentArea / peopleCount;
        System.out.println("Powierzchnia na osobe: " + areaPerPerson);
    }


}

