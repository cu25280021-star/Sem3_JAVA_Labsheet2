import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter annual interest rate (in %): ");
        double rate = scanner.nextDouble();
        System.out.print("Enter time (in years): ");
        double time = scanner.nextDouble();

        double amount = principal * Math.pow((1 + rate / 100.0), time);
        double ci = amount - principal;

        System.out.println("Compound Interest: " + ci);
        System.out.println("Total Amount: " + amount);
        scanner.close();
    }
}