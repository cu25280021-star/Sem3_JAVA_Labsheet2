import java.util.Scanner;

public class UnaryNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        int negativeNum = -num;
        System.out.println("Original value: " + num);
        System.out.println("Negative value: " + negativeNum);
        scanner.close();
    }
}