import java.util.Scanner;

public class qn7 {
    
        public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a age");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("You can vote ");
        } else{
            System.out.println("you cannot vote");
        }
        
        }      
    
}