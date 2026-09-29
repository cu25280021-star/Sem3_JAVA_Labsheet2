import java.util.Scanner;

public class CoursePassCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter theory percentage: ");
        double theory = scanner.nextDouble();
        System.out.print("Enter practical percentage: ");
        double practical = scanner.nextDouble();

        double overall = (theory + practical) / 2.0;

        if ((theory >= 40 && practical >= 50) || overall >= 50) {
            System.out.println("Student PASSED the course.");
        } else {
            System.out.println("Student FAILED the course.");
        }
        scanner.close();
    }
}