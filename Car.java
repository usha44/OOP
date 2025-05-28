public class Car {
    private String make;
    private String model;
    private double pricePerDay;
    private boolean available = true;

    public Car(String mk, String mdl, double price) {
        make = mk;
        model = mdl;
        pricePerDay = price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setPricePerDay(double price) {
        pricePerDay = price;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void rentCar() {
        if (available) {
            available = false;
        }
    }

    public void returnCar() {
        available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 50);
        car.rentCar();

        System.out.println("Model: " + car.getMake() + " " + car.getModel());
        System.out.println("Available: " + car.isAvailable());
    }
}
