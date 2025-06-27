import java.util.Scanner;

public class SupermarketQueue {
    private static final int MAX = 100;
    private String[] queue = new String[MAX];
    private int front = 0, rear = 0;

    public void addCustomer(String name) {
        if (rear == MAX) {
            System.out.println("Queue Full!");
            return;
        }
        queue[rear++] = name;
    }

    public void serveCustomer() {
        if (isEmpty()) {
            System.out.println("Queue Empty!");
            return;
        }
        System.out.println("Serving: " + queue[front++]);
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public int queueSize() {
        return rear - front;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SupermarketQueue queue = new SupermarketQueue();
        while (true) {
            System.out.println("\n1. Add Customer\n2. Serve Customer\n3. Display Queue\n4. Queue Size\n5. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = sc.nextLine();
                    queue.addCustomer(name);
                    break;
                case 2:
                    queue.serveCustomer();
                    break;
                case 3:
                    queue.displayQueue();
                    break;
                case 4:
                    System.out.println("Total Customers: " + queue.queueSize());
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
