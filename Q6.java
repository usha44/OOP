// 6. You are designing a calculator application. Create a class called "Calculator" with the following overloaded methods:
//a) int add(int a, int b) - This method should add two integers and return the result.
//b) double add(double a, double b) - This method should add two doubles and return the result.
//c) int add(int a, int b, int c) - This method should add three integers and return the result.
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(5, 10));
        System.out.println(c.add(2.5, 3.7));
        System.out.println(c.add(1, 2, 3));
    }
}
