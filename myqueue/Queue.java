package myqueue;

public class Queue {
    protected int[] data;
    protected int front;
    protected int size;

    public Queue() {
        this(5); // call parameterized constructor
    }

    public Queue(int capacity) {
        data = new int[capacity];
        front = 0;
        size = 0;
    }

    public void enqueue(int item) throws Exception {
        if (isFull()) {
            throw new Exception("Queue is full");
        }
        int idx = (front + size) % data.length;
        data[idx] = item;
        size++;
    }

    public int dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        int temp = data[front];
        data[front] = 0;
        front = (front + 1) % data.length;
        size--;
        return temp;
    }

    public int getFront() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[front];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % data.length;
            System.out.print(data[idx] + " ");
        }
        System.out.println();
    }
    @Override
    public String toString() {  
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % data.length;
            sb.append(data[idx]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
