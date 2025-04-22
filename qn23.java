import java.util.Scanner;

public class qn23{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int original = number;

        int reversed = 0;
        for (int n = Math.abs(number); n > 0; n /= 10) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
        }
        if (number < 0) {
            reversed = -reversed;
        }
        if (number == reversed) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        scanner.close();
    }
}
