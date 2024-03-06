package pdf2;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        final double price=99;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilość zakupionych produktów: ");
        int quantity = sc.nextInt();
        sc.nextLine();
        System.out.println("Ilość: " + quantity);
        double discount=0;
        if(quantity>=100){
            discount=0.5;
        }
        else if(quantity>=50){
            discount=0.4;
        }
        else if(quantity>=20){
            discount=0.3;
        }
        else if(quantity>=10){
            discount=0.2;
        }
        System.out.println("Rabat: " + discount*100+"%");
        double total=price*quantity*(1-discount);
        System.out.println("Cena: " + total);

    }
}
