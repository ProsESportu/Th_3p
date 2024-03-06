package pdf1;

import java.util.Scanner;

public class FavoriteCity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj swoje ulubione miasto: ");
        String favoriteCity = sc.nextLine();
        System.out.println("ulubione miasto: " + favoriteCity);
        System.out.printf("len: %d \n lower: %s \n upper: %s \n first letter:%s \n", favoriteCity.length(), favoriteCity.toLowerCase(), favoriteCity.toUpperCase(), favoriteCity.charAt(0));

    }
}
