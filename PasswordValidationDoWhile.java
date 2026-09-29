import java.util.Scanner;

public class PasswordValidationDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String CORRECT_PASSWORD = "JavaPass123";
        String inputPass;

        do {
            System.out.print("Enter password: ");
            inputPass = scanner.next();
            if (!inputPass.equals(CORRECT_PASSWORD)) {
                System.out.println("Incorrect password! Try again.");
            }
        } while (!inputPass.equals(CORRECT_PASSWORD));

        System.out.println("Access Granted!");
        scanner.close();
    }
}