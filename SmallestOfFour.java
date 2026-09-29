import java.util.Scanner;

public class SmallestOfFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter four numbers: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();

        double smallest = (a <= b && a <= c && a <= d) ? a :
                           (b <= c && b <= d) ? b :
                           (c <= d) ? c : d;

        System.out.println("The smallest number is: " + smallest);
        scanner.close();
    }
}