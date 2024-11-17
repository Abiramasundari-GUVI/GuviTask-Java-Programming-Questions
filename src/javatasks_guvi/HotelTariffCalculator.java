package javatasks_guvi;
import java.util.Scanner;

public class HotelTariffCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input month, room rent per day, and number of days stayed
        System.out.println("****Enter Month,Rent per Day, No of Staying Days****");
        int month = scanner.nextInt();
        double rentPerDay = scanner.nextDouble();
        int daysStayed = scanner.nextInt();

        // Determine if it is peak season
        boolean isPeakSeason;
        switch (month) {
            case 4: case 5: case 6: case 11: case 12:
                isPeakSeason = true;
                break;
            default:
                isPeakSeason = false;
        }

        // Calculate the total tariff
        double totalTariff = rentPerDay * daysStayed;
        if (isPeakSeason) {
            totalTariff *= 1.20; // Increase by 20% in peak season
        }

        // Print the total tariff with 2 decimal places
        System.out.println("****Total Tariff Amount****");
        System.out.printf("%.2f", totalTariff);
        scanner.close();
    }
}
