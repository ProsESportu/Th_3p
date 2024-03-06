package pdf1;

public class EnergyDrink {
    public static void main(String[] args) {
        final double customers = 12_467;
        final double oneBuy = 0.14;
        final double citrusBuy = 0.64;
        double customersBuy = customers * oneBuy;
        System.out.println("Kupuje napój energetyczny: " + customersBuy);
        double customersCitrusBuy = customersBuy * citrusBuy;
        System.out.println("Kupuje napój energetyczny o smaku cytrusowym: " + customersCitrusBuy);
    }
}
