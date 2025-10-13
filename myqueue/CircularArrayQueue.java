package myqueue;
public class CircularArrayQueue {
    private int[] arr;
    private int cs;// count size
    private int ms;// max size
    private int front;
    private int rear;
    public static final int DEFAULT_CAPACITY = 10;
    CircularArrayQueue() {
        this(DEFAULT_CAPACITY);
    }
    CircularArrayQueue(int capacity) {
        this.arr = new int[capacity];
        this.cs = 0;
        this.ms = capacity;
        this.front = 0;
        this.rear = capacity - 1;
    }
    public boolean isFull() {
        
    }
}