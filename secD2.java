// 2. Create a simple Employee Management System using inheritance:
// ● Define a base class Employee with name and ID.
// ● Create subclasses FullTimeEmployee and PartTimeEmployee with additional
// attributes.
// ● Override a method calculateSalary() in each subclass and display the salary.

// Java program to demonstrate inheritance and method overriding

class Employee {
    String name;
    int id;
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    double calculateSalary() {
        return 0.0;
    }

    void display() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}
class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }
    double calculateSalary() {
        return monthlySalary;
    }
}
class PartTimeEmployee extends Employee {
    int hoursWorked;
    double ratePerHour;

    PartTimeEmployee(String name, int id, int hoursWorked, double ratePerHour) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }
    double calculateSalary() {
        return hoursWorked * ratePerHour;
    }
}
public class secD2 {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee("Manita", 1, 50000);
        PartTimeEmployee pte = new PartTimeEmployee("Nischal", 2, 20, 500);

        fte.display();
        System.out.println("Salary: Rs. " + fte.calculateSalary());

        System.out.println();

        pte.display();
        System.out.println("Salary: Rs. " + pte.calculateSalary());
    }
}