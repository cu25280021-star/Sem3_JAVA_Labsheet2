import java.util.Scanner;

public class TriangleAngleCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three angles of the triangle: ");
        double a1 = scanner.nextDouble();
        double a2 = scanner.nextDouble();
        double a3 = scanner.nextDouble();

        if (a1 > 0 && a2 > 0 && a3 > 0 && (a1 + a2 + a3 == 180)) {
            System.out.println("The given angles form a valid triangle.");
        } else {
            System.out.println("The given angles do NOT form a valid triangle.");
        }
        scanner.close();
    }
}