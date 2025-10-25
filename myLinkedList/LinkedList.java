package myLinkedList;

public class LinkedList {
    private class Node {// only accessible with LinkedList class
        int data; // data member of Node class
        Node next; // reference to the next node
    }

    private Node head;
    private Node tail;
    private int size;

    public void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addLast(int item) {
        Node newNode = new Node();
        newNode.data = item;
        newNode.next = null;

        if (this.size >= 1) {
            this.tail.next = newNode; // ✅ attach new node
            this.tail = newNode; // ✅ move tail
            this.size++;
        } else {
            this.head = newNode;
            this.tail = newNode;
            this.size++;
        }
    }

    public void addFirst(int item) {
        Node newNode = new Node();
        newNode.data = item;
        newNode.next = null;

        if (this.size >= 1) {
            newNode.next = this.head; // attach old head
        } else {
            this.tail = newNode; // first node, tail also points here
        }

        this.head = newNode; // move head to new node
        this.size++;
    }
    public int getFirst() throws Exception {
        if (this.size == 0) {
            throw new Exception("List is empty");
        }
        return this.head.data;
    }
    public int getLast() throws Exception {
        if (this.size == 0) {
            throw new Exception("List is empty");
        }
        return this.tail.data;
    }
    public int getAt (int idx)throws Exception {
        if(this.size ==0){
            throw new Exception("List is empty");
        }
        if(idx < 0 || idx >= this.size){
            throw new Exception("Invalid Index");
        }
        Node temp = this.head;
        for(int i=0;i<idx;i++){
            temp = temp.next;
        }
        return temp.data;
    }
    private Node getNodeAt (int idx)throws Exception {
        if(this.size ==0){
            throw new Exception("List is empty");
        }
        if(idx < 0 || idx >= this.size){
            throw new Exception("Invalid Index");
        }
        Node temp = this.head;
        for(int i=0;i<idx;i++){
            temp = temp.next;
        }
        return temp;
    }
    //complexity O(n)
    public void addAt(int item , int idx) throws Exception {
        if(idx<0 || idx>this.size){
            throw new Exception("Invalid Index");
        }
        if(idx == 0){
            addFirst(item);
        } else if (idx == this.size) {
            addLast(item);
        } else {
            //create a new node
            Node newNode = new Node();
            newNode.data = item;
            newNode.next = null;
            //attach
            Node nm1 = getNodeAt(idx - 1);
            Node np1Node = nm1.next;

            nm1.next = newNode;
            newNode.next = np1Node;
            //summary update size
            this.size++;
        }
    }
    //complexity O(1)
    public int removeFirst(){
        if(this.size == 0) throw new RuntimeException("List is empty");
        int rv = this.head.data;//data to be returned value
        if(this.size ==1){
            this.head = null;
            this.tail = null;
            this.size =0;
        } else {
            this.head = this.head.next;
            this.size--;
        }
        return rv;
    }
    public int removeLast() throws Exception{
        if(this.size ==0 ){
            throw new Exception("List is empty");
        }
        int returnValue = this.tail.data;
        if(this.size ==1){
            this.head = null;
            this.tail = null;
            this.size =0;
        } else {
            Node sm2 = getNodeAt(this.size -2);
            sm2.next = null;// second last node's next is null now
            this.tail = sm2;// update tail
            this.size--;
        }
        return returnValue;
    }
}