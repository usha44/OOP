import java.util.Scanner;
public class qn10 {
    public static void main(String[] args) {
        
    
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the year");
        int year= sc.nextInt();
        sc.close();
        if(year% 4== 0) {
            System.out.println(year+" is  leap year");
            }
        
        else  {
            System.out.println(year+ "is not leap year");
        }
    }
}   
