import java.util.Scanner;

public class CharacterTypeTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        String result = ("AEIOUaeiou".indexOf(ch) != -1) ? "Vowel" :
                        ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) ? "Consonant" :
                        (ch >= '0' && ch <= '9') ? "Digit" : "Special Symbol";

        System.out.println("Character '" + ch + "' is a: " + result);
        scanner.close();
    }
}