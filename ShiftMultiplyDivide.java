import java.util.Scanner;

public class ShiftMultiplyDivide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.print("Enter power of 2 (k for 2^k): ");
        int k = scanner.nextInt();

        int multiplied = num << k; // Multiply by 2^k
        int divided = num >> k;    // Divide by 2^k

        System.out.println(num + " * 2^" + k + " (using <<) = " + multiplied);
        System.out.println(num + " / 2^" + k + " (using >>) = " + divided);
        scanner.close();
    }
}