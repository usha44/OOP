import java.util.Scanner;

public class qn12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to input a number
        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();

        // Print the multiplication table using for loop
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }

        scanner.close();
    }
}
