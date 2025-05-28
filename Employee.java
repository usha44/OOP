public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String n, String j, double s) {
        name = n;
        jobTitle = j;
        salary = s;
    }

    public void updateSalary(double percent) {
        salary = salary + (salary * percent / 100);
    }

    public void printEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("John", "Manager", 30000);
        emp.printEmployee();

        emp.updateSalary(10);
        System.out.println("After 10% Salary Increase:");
        emp.printEmployee();
    }
}
