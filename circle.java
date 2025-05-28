public class circle {
    private double radius;

    public void setRadius(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea() {
        return 3.14 * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * 3.14 * radius;
    }

    public static void main(String[] args) {
        circle c = new circle();
        c.setRadius(5);

        System.out.println("Radius: " + c.getRadius());
        System.out.println("Area: " + c.calculateArea());
        System.out.println("Circumference: " + c.calculateCircumference());
    }
}
