package pdf4;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę pięter: ");
        int floors = sc.nextInt();
        sc.nextLine();
        while (floors < 1) {
            System.out.println("Podaj liczbę pięter(większa od 0)");
            floors = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Podałeś liczbę pięter: " + floors);
        int totalRooms = 0;
        int totalOccupiedRooms = 0;
        for (int i = 0; i < floors; i++) {
            System.out.println("Podaj liczbę pokoi na " + i + " piętrze: ");
            int floorRooms = sc.nextInt();
            sc.nextLine();
            while (floorRooms < 10) {
                System.out.println("Podaj liczbę pokoi(większa od 10)");
                floorRooms = sc.nextInt();
                sc.nextLine();
            }
            System.out.println("Podałeś liczbę pokoi na " + i + " piętrze: " + floorRooms);
            System.out.println("Podaj liczbę zajętych pokoi na " + i + " piętrze: ");
            int occupiedRooms = sc.nextInt();
            sc.nextLine();
            System.out.println("Podałeś liczbę zajętych pokoi na " + i + " piętrze: " + occupiedRooms);
            double occupancyRate = (double) occupiedRooms / floorRooms;
            System.out.println("Obłożenie na " + i + " piętrze wynosi: " + occupancyRate);
            totalRooms += floorRooms;
            totalOccupiedRooms += occupiedRooms;

        }
        double totalOccupancyRate = (double) totalOccupiedRooms / totalRooms;
        System.out.println("Obłożenie całego hotelu wynosi: " + totalOccupancyRate);
    }

}
