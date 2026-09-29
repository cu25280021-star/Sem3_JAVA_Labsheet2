import java.util.Scanner;

public class FactorsDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        System.out.print("Factors of " + num + ": ");
        int i = 1;
        if (num <= 0) {
            System.out.println("Please enter a number greater than 0.");
        } else {
            do {
                if (num % i == 0) {
                    System.out.print(i + " ");
                }
                i++;
            } while (i <= num);
            System.out.println();
        }
        scanner.close();
    }
}