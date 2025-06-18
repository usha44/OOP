// 8. You are building a payroll system for a company. The system has a class Employee with a method calculateSalary() to calculate the salary of an employee. Now, you need to create a derived class Manager that inherits from Employee and overrides the calculateSalary() method to include a bonus calculation based on the performance. Implement the classes and demonstrate method overriding for calculating the salary of a manager.
class Employee {
    double salary;

    Employee(double salary) {
        this.salary = salary;
    }

    double calculateSalary() {
        return salary;
    }
}

class Manager extends Employee {
    double bonus;

    Manager(double salary, double bonus) {
        super(salary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return salary + bonus;
    }
}

public class Q8 {
    public static void main(String[] args) {
        Manager m = new Manager(50000, 10000);
        System.out.println("Manager Salary: $" + m.calculateSalary());
    }
}

