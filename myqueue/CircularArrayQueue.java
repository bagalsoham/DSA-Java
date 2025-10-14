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
        return this.cs == this.ms;
        
    }
    public boolean isEmpty() {
        return this.cs == 0;
    }
    public void enqueue(int data ){
        if(!this.isFull()){
            this.rear = (this.rear + 1) % this.arr.length;
            this.arr[this.rear] = data;
            this.cs++;
        }
    }
    public int dequeue(){
        if(!this.isEmpty()){
            this.front = (this.front + 1) % this.arr.length;
            this.cs= this.cs - 1;
        }
        return -1;
    }
    public int getFront(){
        if(!this.isEmpty()){
            return this.arr[this.front];
        }
        return -1;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CircularArrayQueue q = new CircularArrayQueue(5);
        for(int i = 1; i <= 5; i++){
            q.enqueue(i * 10);
        }
        q.dequeue();
        q.dequeue();
        q.enqueue(8);
        while(!q.isEmpty()){
            System.out.println(q.getFront());
            q.dequeue();
        }
    }
}