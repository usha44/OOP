import java.util.Scanner;

public class qn1 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String fullname = sc.nextLine();
        System.out.println("enter a grettings");
        String grettings = sc.nextLine();
        System.out.println("Hey, my name is "+ fullname+ " and "+ grettings+"." );
       
    }
}