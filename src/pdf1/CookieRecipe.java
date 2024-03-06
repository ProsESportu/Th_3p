package pdf1;

public class CookieRecipe {
    public static void main(String[] args) {
        final double sugar = 1.5;
        final double butter = 1;
        final double flour = 2.75;
        final double cookies = 48;
        final double sugarPerCookie = sugar / cookies;
        System.out.println("Cukier na jedno ciastko: " + sugarPerCookie);
        final double butterPerCookie = butter / cookies;
        System.out.println("Masło na jedno ciastko: " + butterPerCookie);
        final double flourPerCookie = flour / cookies;
        System.out.println("Mąka na jedno ciastko: " + flourPerCookie);
    }
}
