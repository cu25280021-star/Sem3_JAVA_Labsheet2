import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        int count = 0;
        int temp = num;
        while (temp != 0) {
            count += (temp & 1);
            temp >>>= 1; // Unsigned right shift
        }

        System.out.println("Number of set bits (1s) in " + num + ": " + count);
        scanner.close();
    }
}