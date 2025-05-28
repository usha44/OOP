public class Employee1 {
    private String name;
    private String id;
    private double salary;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setId(String i) {
        id = i;
    }

    public String getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void updateSalary(double change) {
        if (salary + change >= 0) {
            salary += change;
        }
    }

    public static void main(String[] args) {
        Employee1 emp = new Employee1();
        emp.setName("Rita");
        emp.setId("E001");
        emp.updateSalary(20000);  // set salary
        emp.updateSalary(5000);   // increase

        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
    }
}
