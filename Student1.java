public class Student1 {
    private String name;
    private String id;
    private double gpa;

    public Student1(String n, String i, double g) {
        name = n;
        id = i;
        gpa = g;
    }

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

    public double getGpa() {
        return gpa;
    }

    public static void main(String[] args) {
        Student1 s = new Student1("Anil", "S101", 3.8);
        s.setName("Sunil");
        s.setId("S102");

        System.out.println("Name: " + s.getName());
        System.out.println("ID: " + s.getId());
        System.out.println("GPA: " + s.getGpa());
    }
}
