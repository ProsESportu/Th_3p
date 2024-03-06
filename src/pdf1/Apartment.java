package pdf1;

public class Apartment {
    public static void main(String[] args) {
        int pom1x = 3;
        int pom1y = 4;
        int pom2x = 2;
        int pom2y = 3;
        int pom3x = 2;
        int pom3y = 2;

        int pom1P = pom1x * pom1y;
        System.out.println("Pomieszczenie 1 i 2: "
                + pom1P
                + " m^2");
        int pom2P = pom2x * pom2y;
        System.out.println("Pomieszczenie 3: "
                + pom2P
                + " m^2");
        int pom3P = pom3x * pom3y;
        System.out.println("Pomieszczenie 4: "
                + pom3P
                + " m^2");
        int pom1Count = 2;
        int powCal = pom1P * pom1Count + pom2P + pom3P;
        System.out.println("Powierzchnia całkowita mieszkania: "
                + powCal
                + " m^2");
        int peopleCount=4;
        int powPerPerson=powCal/peopleCount;
        System.out.println("Powierzchnia na osobe: "+powPerPerson+" m^2");
    }
}
