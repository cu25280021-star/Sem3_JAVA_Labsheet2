import java.util.Scanner;

public class PalindromeWhile {
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

        if (num == reversed) {
            System.out.println(num + " is a Palindrome.");
        } else {
            System.out.println(num + " is NOT a Palindrome.");
        }
        scanner.close();
    }
}