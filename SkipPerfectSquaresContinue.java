public class SkipPerfectSquaresContinue {
    public static void main(String[] args) {
        System.out.println("Numbers 1 to 50 (skipping perfect squares):");

        for (int i = 1; i <= 50; i++) {
            int root = (int) Math.sqrt(i);
            if (root * root == i) {
                continue; // Skip perfect square
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}