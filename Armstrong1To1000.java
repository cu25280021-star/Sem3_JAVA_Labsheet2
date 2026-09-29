public class Armstrong1To1000 {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 1000:");

        for (int num = 1; num <= 1000; num++) {
            int original = num;
            int temp = num;
            int digits = 0;

            // Count digits
            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            temp = num;
            int sum = 0;
            while (temp > 0) {
                int d = temp % 10;
                sum += Math.pow(d, digits);
                temp /= 10;
            }

            if (sum == original) {
                System.out.print(original + " ");
            }
        }
        System.out.println();
    }
}