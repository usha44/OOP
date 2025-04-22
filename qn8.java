import java.util.Scanner;

public class qn8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single alphabet character: ");
        String input = scanner.nextLine();
        if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
            char ch = Character.toLowerCase(input.charAt(0));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input! Please enter a single alphabet character.");
        }

        scanner.close();
    }
}
