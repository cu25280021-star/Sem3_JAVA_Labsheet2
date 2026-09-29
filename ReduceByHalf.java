import java.util.Scanner;

public class ReduceByHalf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();

        int steps = 0;
        double current = num;
        while (current >= 1) {
            current /= 2;
            steps++;
        }

        System.out.println("Final value: " + current);
        System.out.println("Number of steps: " + steps);
        scanner.close();
    }
}