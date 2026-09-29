import java.util.Scanner;

public class ReverseDigitsWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        int temp = num;
        int reversed = 0;

        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        System.out.println("Reversed number: " + reversed);
        scanner.close();
    }
}