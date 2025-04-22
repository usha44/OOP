import java.util.Scanner;

public class qn2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int sum = a+b;
        int difference =a-b;
        int product = a*b;
        int div = a/b;
        System.out.println("sum " + sum);
        System.out.println("difference " + difference);
        System.out.println("product " + product);
        System.out.println("div " + div);
    }
    
}



