public class FibonacciFor {
    public static void main(String[] args) {
        int n = 20;
        long a = 0, b = 1;

        System.out.println("First " + n + " terms of Fibonacci sequence:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + (i == n ? "" : ", "));
            long next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}