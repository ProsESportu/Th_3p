public class Shares {
    public static void main(String[] args) {
        final double sharesCount = 600;
        final double sharePrice = 21.77;
        final double commission = 0.02;
        double sharesValue = sharesCount * sharePrice;
        System.out.println("Wartość akcji: " + sharesValue);
        double commissionValue = sharesValue * commission;
        System.out.println("Wartość prowizji: " + commissionValue);
        double totalValue = sharesValue + commissionValue;
        System.out.println("Łączna wartość: " + totalValue);
    }
}
