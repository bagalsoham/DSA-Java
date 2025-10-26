package myLinkedList;
public class LL_as_Stack {
    private LinkedList stack;
    
    //constructor
    public LL_as_Stack(){
        this.stack = new LinkedList();
    }
    public int size() {
        return this.stack.size();
    }
    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    public void push(int data){
        this.stack.addFirst(data);
    }
    public int pop(){
        try {
            return this.stack.removeFirst();
        } catch (Exception e) {
            System.out.println("Stack is empty");
            return -1; // or throw an exception
        }

    }
    public int top(){
        try {
            return this.stack.getFirst();
        } catch (Exception e) {
            System.out.println("Stack is empty");
            return -1; // or throw an exception
        }
    }
    public void display(){
        this.stack.display();
    }

    

}