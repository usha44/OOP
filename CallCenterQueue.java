import java.util.Scanner;

public class CallCenterQueue {
    private static final int MAX = 100;
    private String[] calls = new String[MAX];
    private int front = 0, rear = 0;

    public void addCall(String callId) {
        if (rear == MAX) {
            System.out.println("Call queue full!");
            return;
        }
        calls[rear++] = callId;
    }

    public void handleCall() {
        if (isEmpty()) {
            System.out.println("No calls to handle.");
            return;
        }
        System.out.println("Handling call: " + calls[front++]);
    }

    public void showQueue() {
        if (isEmpty()) {
            System.out.println("Call queue is empty.");
            return;
        }
        System.out.print("Pending calls: ");
        for (int i = front; i < rear; i++) {
            System.out.print(calls[i] + " ");
        }
        System.out.println();
    }

    public int pendingCalls() {
        return rear - front;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CallCenterQueue queue = new CallCenterQueue();

        while (true) {
            System.out.println("\n1. Add Call\n2. Handle Call\n3. Show Queue\n4. Pending Calls\n5. Exit");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    System.out.print("Enter call ID: ");
                    String callId = sc.nextLine();
                    queue.addCall(callId);
                    break;
                case 2:
                    queue.handleCall();
                    break;
                case 3:
                    queue.showQueue();
                    break;
                case 4:
                    System.out.println("Pending Calls: " + queue.pendingCalls());
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