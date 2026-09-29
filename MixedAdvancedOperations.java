import java.util.Scanner;

public class MixedAdvancedOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // 1. Check if power of 4 using shift & bitwise operators
        // A power of 4 is > 0, has only 1 set bit (num & (num-1) == 0), and that bit is at an even position (num & 0x55555555 != 0)
        boolean isPowerOf4 = (num > 0) && ((num & (num - 1)) == 0) && ((num & 0x55555555) != 0);
        System.out.println(num + " is " + (isPowerOf4 ? "" : "NOT ") + "a power of 4.");

        // 2. Toggle the 3rd bit (0-indexed 3rd bit = bit position 3, value 8)
        int toggled = num ^ (1 << 3);
        System.out.println("Number after toggling 3rd bit: " + toggled);

        // 3. Multiplication table, skip multiples of 6 (continue), stop if reaching multiple of 48 (break)
        System.out.println("
Multiplication table for " + num + ":");
        for (int i = 1; i <= 20; i++) {
            int val = num * i;

            if (val % 48 == 0) {
                System.out.println("Reached multiple of 48 (" + val + "). Breaking loop.");
                break;
            }

            if (val % 6 == 0) {
                continue; // Skip printing multiples of 6
            }

            System.out.println(num + " x " + i + " = " + val);
        }

        scanner.close();
    }
}