// 1. Write a Java program that demonstrates constructor overloading.
// ● Create a Product class with attributes like id, name, and price.
// ● Provide multiple constructors to initialize these attributes differently.
// ● Display the product details using a method.


class Product {
    int id;
    String name;
    double price;
    Product() {
        id = 0;
        name = "Book";
        price = 0.0;
    }
    Product(int id, String name) {
        this.id = id;
        this.name = name;
        this.price = 0.0;
    }

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Price: " + price);
    }
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product(101, "Pen");
        Product p3 = new Product(102, "Notebook", 49.99);

        p1.display();
        p2.display();
        p3.display();
    }
}