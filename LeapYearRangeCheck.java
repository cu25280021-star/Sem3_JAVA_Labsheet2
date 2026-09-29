import java.util.Scanner;

public class LeapYearRangeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year to check: ");
        int year = scanner.nextInt();
        System.out.print("Enter start year of range: ");
        int startYear = scanner.nextInt();
        System.out.print("Enter end year of range: ");
        int endYear = scanner.nextInt();

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        boolean inRange = (year >= startYear) && (year <= endYear);

        if (isLeap && inRange) {
            System.out.println(year + " is a leap year AND is within the range [" + startYear + ", " + endYear + "].");
        } else {
            System.out.println("Condition NOT met: Year is either not leap or outside the specified range.");
        }
        scanner.close();
    }
}