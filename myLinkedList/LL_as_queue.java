package myLinkedList;
public class LL_as_queue {
    private LinkedList queue;
    
    //constructor
    public LL_as_queue(){
        this.queue = new LinkedList();
    }
    public int size() {
        return this.queue.size();
    }
    public boolean isEmpty() {
        return this.queue.isEmpty();
    }

    public void enqueue(int data){
        this.queue.addLast(data);
    }
    public int dequeue(){
        try {
            return this.queue.removeFirst();
        } catch (Exception e) {
            System.out.println("Queue is empty");
            return -1; // or throw an exception
        }

    }
    public int front(){
        try {
            return this.queue.getFirst();
        } catch (Exception e) {
            System.out.println("Queue is empty");
            return -1; // or throw an exception
        }
    }
    public void display(){
        this.queue.display();
    }
}