public class Acme {
    public static void main(String[] args) {
        final double sharesCount = 1000;
        final double shareBuyPrice = 32.87;
        final double shareSellPrice = 33.92;
        final double commission = 0.02;
        double sharesBuyPrice = sharesCount * shareBuyPrice;
        System.out.println("Cena kupna akcji: " + sharesBuyPrice);
        double commissionValue = sharesBuyPrice * commission;
        System.out.println("Wartość prowizji przy kupnie: " + commissionValue);
        double totalBuyValue = sharesBuyPrice + commissionValue;
        System.out.println("Łączna wartość przy zakupie: " + totalBuyValue);
        double sharesSellPrice = sharesCount * shareSellPrice;
        System.out.println("Cena sprzedaży akcji: " + sharesSellPrice);
        commissionValue = sharesSellPrice * commission;
        System.out.println("Wartość prowizji przy sprzedaży: " + commissionValue);
        double totalSellValue = sharesSellPrice - commissionValue;
        System.out.println("Łączna wartość przy sprzedaży: " + totalSellValue);
        double profit = totalSellValue - totalBuyValue;
        System.out.println("Zysk: " + profit);
    }
}
