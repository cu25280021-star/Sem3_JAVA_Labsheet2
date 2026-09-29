import java.util.Random;

public class RandomDivisibleBreak {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("Generating random integers between 1 and 100:");

        while (true) {
            int num = rand.nextInt(100) + 1; // 1 to 100
            System.out.print(num + " ");

            if (num % 7 == 0 && num % 13 == 0) { // Divisible by 91
                System.out.println("
Found number divisible by both 7 and 13: " + num + ". Stopping.");
                break;
            }
        }
    }
}