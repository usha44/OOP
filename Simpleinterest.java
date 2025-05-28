public class Simpleinterest {
    private double principal;
    private double time;
    private double rate;

    public void setPrincipal(double p) {
        principal = p;
    }

    public void setTime(double t) {
        time = t;
    }

    public void setRate(double r) {
        rate = r;
    }

    public double calculateInterest() {
        return (principal * time * rate) / 100;
    }

    public void printValues() {
        System.out.println("Principal: " + principal);
        System.out.println("Time: " + time);
        System.out.println("Rate: " + rate);
        System.out.println("Simple Interest: " + calculateInterest());
    }

    public static void main(String[] args) {
        Simpleinterest si = new Simpleinterest();
        si.setPrincipal(10000);
        si.setTime(2);
        si.setRate(5);
        si.printValues();
    }
}
