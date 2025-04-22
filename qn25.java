import java.util.Scanner;

public class qn25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int digitCount = 0;
        
       
        if (number == 0) {
            digitCount = 1;
        } else {
            
            while (number != 0) {
                number = number / 10; 
                digitCount++; 
            }
        }
        
        
        System.out.println("The number has " + digitCount + " digits.");
        
        
        scanner.close();
    }
}

