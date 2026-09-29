import java.util.Scanner;

public class StringCompareCustom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.next();
        System.out.print("Enter second string: ");
        String str2 = scanner.next();

        int len1 = str1.length();
        int len2 = str2.length();
        int minLen = Math.min(len1, len2);
        int comparison = 0;

        for (int i = 0; i < minLen; i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            if (c1 != c2) {
                if (c1 < c2) {
                    comparison = -1;
                } else {
                    comparison = 1;
                }
                break;
            }
        }

        if (comparison == 0) {
            if (len1 < len2) comparison = -1;
            else if (len1 > len2) comparison = 1;
        }

        if (comparison < 0) {
            System.out.println(""" + str1 + "" comes before "" + str2 + "" lexicographically.");
        } else if (comparison > 0) {
            System.out.println(""" + str2 + "" comes before "" + str1 + "" lexicographically.");
        } else {
            System.out.println("Both strings are identical.");
        }
        scanner.close();
    }
}