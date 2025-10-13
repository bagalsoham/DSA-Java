package myqueue;

public class ClientDQ {
    public static void main(String[] args) {
        try {
            DynamicQueue queue = new DynamicQueue();
            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);
            queue.enqueue(40);
            queue.enqueue(50);
            queue.enqueue(60);
            queue.enqueue(70);
            queue.enqueue(80);
            queue.enqueue(90);
            queue.enqueue(100);
            System.out.println("Queue after enqueuing 10 elements: " + queue);
            queue.dequeue();
            queue.dequeue();
            System.out.println("Queue after dequeuing 2 elements: " + queue);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
