import java.util.Scanner;

public class RainfallAccumulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalRainfall = 0.0;

        for (int day = 1; day <= 7; day++) {
            System.out.print("Enter rainfall for Day " + day + " (mm): ");
            double dailyRainfall = scanner.nextDouble();
            totalRainfall += dailyRainfall;
        }

        System.out.println("Total rainfall over 7 days: " + totalRainfall + " mm");
        scanner.close();
    }
}