import java.util.Scanner;
public class qn9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] marks = new int[5];
        int total = 0;
        double percentage;
        char grade;
        System.out.println("Enter marks for 5 subjects (out of 100):");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = input.nextInt();
            total += marks[i];
        }
        percentage = total / 5.0;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("\nTotal Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        input.close();
    }
}
