import java.util.Scanner;

public class RotateLeftTwoBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        int rotated = Integer.rotateLeft(num, 2);

        System.out.println("Original integer: " + num + " (Binary: " + Integer.toBinaryString(num) + ")");
        System.out.println("Rotated left by 2: " + rotated + " (Binary: " + Integer.toBinaryString(rotated) + ")");
        scanner.close();
    }
}