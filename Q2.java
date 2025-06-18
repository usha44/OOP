//2. You are working on an e-commerce application where different payment methods are supported, including credit card, PayPal, and bank transfer. Each payment method has its own validation and transaction process. Implement a Java program using polymorphism to process payments using different payment methods.
abstract class PaymentMethod {
    abstract void processPayment();
}

class CreditCard extends PaymentMethod {
    void processPayment() {
        System.out.println("Processing credit card payment...");
    }
}

class PayPal extends PaymentMethod {
    void processPayment() {
        System.out.println("Processing PayPal payment...");
    }
}

class BankTransfer extends PaymentMethod {
    void processPayment() {
        System.out.println("Processing bank transfer...");
    }
}

public class Q2 {
    public static void main(String[] args) {
        PaymentMethod[] methods = {
            new CreditCard(),
            new PayPal(),
            new BankTransfer()
        };

        for (PaymentMethod pm : methods) {
            pm.processPayment();
        }
    }
}

