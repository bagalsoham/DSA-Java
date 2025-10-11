import myqueue.Queue;
public class QueueImplementation {
    public static void main(String[] args) {
        Queue q = new Queue();
        try {
            q.enqueue(10);
            q.enqueue(20);
            q.enqueue(30);
            q.enqueue(40);
            q.enqueue(50);
            System.out.println(q.dequeue());
            System.out.println(q.dequeue());
            q.display();
            q.enqueue(60); 
            q.display();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
