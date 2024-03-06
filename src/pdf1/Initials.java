package pdf1;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("first name:");
        String firstName = sc.nextLine();
        System.out.println("first name: " + firstName);
        System.out.println("middle name:");
        String middleName = sc.nextLine();
        System.out.println("middle name: " + middleName);
        System.out.println("last name:");
        String lastName = sc.nextLine();
        System.out.println("last name: " + lastName);
        char firstNameInitial = firstName.charAt(0);
        char middleNameInitial = middleName.charAt(0);
        char lastNameInitial = lastName.charAt(0);

        System.out.println("your initials are: "
                + firstNameInitial
                + " "
                + middleNameInitial
                + " "
                + lastNameInitial);

    }
}
