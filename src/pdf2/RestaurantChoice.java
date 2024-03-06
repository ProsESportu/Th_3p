package pdf2;

import java.util.Scanner;

public class RestaurantChoice {
    static class Restaurant {
        String name;
        boolean vegan;
        boolean vegetarian;
        boolean glutenFree;

        public Restaurant(String name, boolean vegan, boolean vegetarian, boolean glutenFree) {
            this.name = name;
            this.vegan = vegan;
            this.vegetarian = vegetarian;
            this.glutenFree = glutenFree;
        }
    }

    public static void main(String[] args) {
        final Restaurant[] restaurants = new Restaurant[]{
                new Restaurant("Luksusowe Burgery u Jarka", false, false, false),
                new Restaurant("Pizzeria przy Dworcowej", true, false, true),
                new Restaurant("Kawiarnia na Rogu", true, true, true),
                new Restaurant("Włoskie Specjały", true, false, false),
                new Restaurant("Kuchnia u Szefa", true, true, true)
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Czy któraś z osób jest na diecie wegańskiej? (y/n)");
        boolean vegan = sc.nextLine().equals("y");
        System.out.println("Czy któraś z osób jest na diecie wegetariańskiej? (y/n)");
        boolean vegetarian = sc.nextLine().equals("y");
        System.out.println("Czy któraś z osób jest na diecie bezglutenowej? (y/n)");
        boolean glutenFree = sc.nextLine().equals("y");
        for (Restaurant restaurant : restaurants) {
            if (vegan && !restaurant.vegan) {
                continue;
            }
            if (vegetarian && !restaurant.vegetarian) {
                continue;
            }
            if (glutenFree && !restaurant.glutenFree) {
                continue;
            }
            System.out.println(restaurant.name);
        }
    }

}
