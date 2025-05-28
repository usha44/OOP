public class Qno{
    private String productName;
    private String productId;
    private double price;
    private int stock;

    // Setter for product name
    public void setProductName(String name) {
        productName = name;
    }

    // Getter for product name
    public String getProductName() {
        return productName;
    }

    // Setter for product ID
    public void setProductId(String id) {
        productId = id;
    }

    // Getter for product ID
    public String getProductId() {
        return productId;
    }

    // Setter for price (price must be non-negative)
    public void setPrice(double p) {
        if (p >= 0) {
            price = p;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Method to purchase product (reduce stock)
    public void purchase(int quantity) {
        if (quantity > 0 && quantity <= stock) {
            stock -= quantity;
        } else {
            System.out.println("Invalid purchase quantity.");
        }
    }

    // Method to restock product (increase stock)
    public void restock(int quantity) {
        if (quantity > 0) {
            stock += quantity;
        } else {
            System.out.println("Invalid restock quantity.");
        }
    }

    // Getter for stock
    public int getStock() {
        return stock;
    }

    // Main method to test the class
    public static void main(String[] args) {
        Qno product = new Qno();

        // Setting product details
        product.setProductName("Laptop");
        product.setProductId("L123");
        product.setPrice(55000);

        // Managing stock
        product.restock(10);
        product.purchase(2);

        // Printing details
        System.out.println("Product Name: " + product.getProductName());
        System.out.println("Product ID: " + product.getProductId());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Stock Left: " + product.getStock());
    }
}

