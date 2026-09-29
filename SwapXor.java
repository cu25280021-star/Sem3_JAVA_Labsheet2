import java.util.Scanner;

public class SwapXor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer A: ");
        int a = scanner.nextInt();
        System.out.print("Enter integer B: ");
        int b = scanner.nextInt();

        System.out.println("Before swap: A = " + a + ", B = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swap:  A = " + a + ", B = " + b);
        scanner.close();
    }
}