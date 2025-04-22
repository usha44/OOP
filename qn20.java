import java.util.Scanner;
public class qn20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        boolean isPerfectSquare = false;
        for (int i = 1; i <= num / 2; i++) {
            if (i * i == num) {
                isPerfectSquare = true;
                break;
            }
        }
        if (num == 0 || num == 1) {
            isPerfectSquare = true;
        }
        if (isPerfectSquare) {
            System.out.println(num + " is a perfect square.");
        } else {
            System.out.println(num + " is not a perfect square.");
        }

        scanner.close();
    }
}
