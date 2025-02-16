import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Currency Converter!");
        System.out.print("Enter the base currency (e.g., USD): ");
        String baseCurrency = scanner.nextLine().toUpperCase();
        System.out.print("Enter the target currency (e.g., EUR): ");
        String targetCurrency = scanner.nextLine().toUpperCase();
        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        // Fetching real-time exchange rates (mock data for demonstration)
        double exchangeRate = getExchangeRate(baseCurrency, targetCurrency);

        if (exchangeRate == -1) {
            System.out.println("Invalid currency pair or unable to fetch exchange rate.");
        } else {
            double convertedAmount = amount * exchangeRate;
            System.out.printf("%.2f %s = %.2f %s%n", amount, baseCurrency, convertedAmount, targetCurrency);
        }

        scanner.close();
    }

    private static double getExchangeRate(String baseCurrency, String targetCurrency) {
        // Mock exchange rates (replace with API call in real implementation)
        if (baseCurrency.equals("USD") && targetCurrency.equals("EUR")) {
            return 0.85;
        } else if (baseCurrency.equals("EUR") && targetCurrency.equals("USD")) {
            return 1.18;
        } else if (baseCurrency.equals("USD") && targetCurrency.equals("INR")) {
            return 74.50;
        } else if (baseCurrency.equals("INR") && targetCurrency.equals("USD")) {
            return 0.013;
        } else {
            return -1; // Invalid currency pair
        }
    }
}