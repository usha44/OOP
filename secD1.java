// 2. Design a Java class called Student with attributes id, name, and marks:
// ● Create a method to calculate the grade based on marks using this rule:
// ○ 80+ : A
// ○ 60–79 : B
// ○ 40–59 : C
// ○ Below 40 : F
// ● Create multiple student objects and display their grades.

class Student {
    int id;
    String name;
    int marks;
    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public char calculateGrade() {
        if (marks >= 80) {
            return 'A';
        } else if (marks >= 60) {
            return 'B';
        } else if (marks >= 40) {
            return 'C';
        } else {
            return 'F';
        }
    }
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks + ", Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
       
        Student s1 = new Student(101, "Manita", 85);
        Student s2 = new Student(102, "Pooja", 75);
        Student s3 = new Student(103, "Usha", 55);
        Student s4 = new Student(104, "Nischal", 35);

        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}