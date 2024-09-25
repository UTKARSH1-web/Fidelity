public class Assignment6 {
    public static void main(String[] args) {
        final double pizzaPrice = 200.0;
        final double puffPrice = 50.0;
        final double pepsiPrice = 120.0;

        int numberOfPizzas = 5;
        int numberOfPepsi = 6;
        int numberOfPuffs = 2;

        double totalPizzaPrice = pizzaPrice * numberOfPizzas;
        double totalPepsiPrice = pepsiPrice * numberOfPepsi;
        double totalPuffPrice = puffPrice * numberOfPuffs;

        double grandTotal = totalPizzaPrice + totalPuffPrice + totalPepsiPrice;

        System.out.println("Bill Details:");
        System.out.println("Total cost of Pizza Price: " + totalPizzaPrice);
        System.out.println("Total cost of Pepsi Price: " + totalPepsiPrice);
        System.out.println("Total cost of Puff Price: " + totalPuffPrice);
        System.out.println("Grand Total: " + grandTotal);

    }
}
