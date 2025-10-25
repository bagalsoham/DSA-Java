package myqueue;

public class ClientReverseQueue {
    public static void main(String[] args) throws Exception {
        DynamicQueue queue = new DynamicQueue();

        // Enqueue elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.print("Original Queue: ");
        queue.display(); // Expected: 10 20 30 40 50

        // Reverse the queue
        ReverseQueue.reverseQueue(queue);

        System.out.print("Reversed Queue: ");
        queue.display(); // Expected: 50 40 30 20 10
    }
}
