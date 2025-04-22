import java.util.Scanner;

public class qn19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().toLowerCase().charAt(0); 
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                System.out.println(ch + " is not a vowel.");
        }

        scanner.close();
    }
}
