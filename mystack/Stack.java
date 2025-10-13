package mystack;
        
public class Stack {
    protected int[] data;
    protected int tos;

    public Stack() {
        data = new int[5]; // default capacity
        tos = -1;
    }
    public Stack(int capacity) {
        data = new int[capacity];// custom capacity
        tos = -1;
    }
    public void push(int item) throws Exception {
        if (isFull()) {
            throw new Exception("Stack is full");
        }   
        tos++;
        data[tos] = item;
    }
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        int rv = data[tos];
        data[tos] = 0;
        tos--;
        return rv;
    }
    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return data[tos];
    }
    public int size() {
        return tos + 1;
    }
    public boolean isEmpty() {
        return size() == 0;
    }
    public boolean isFull() {
        return size() == data.length;
    }
    public void display() {
        for (int i = tos; i >= 0; i--) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
