import java.util.Scanner;

public class ArrayMinMaxForEach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for (int val : arr) {
            if (val < min) min = val;
            if (val > max) max = val;
        }

        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
        scanner.close();
    }
}