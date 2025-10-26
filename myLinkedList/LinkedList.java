package myLinkedList;

public class LinkedList {
    private class Node {
        int data;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    // Display the linked list
    public void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Add element at the end - O(1)
    public void addLast(int item) {
        Node newNode = new Node();
        newNode.data = item;
        newNode.next = null;

        if (this.size >= 1) {
            this.tail.next = newNode;
            this.tail = newNode;
            this.size++;
        } else {
            this.head = newNode;
            this.tail = newNode;
            this.size++;
        }
    }

    // Add element at the beginning - O(1)
    public void addFirst(int item) {
        Node newNode = new Node();
        newNode.data = item;
        newNode.next = null;

        if (this.size >= 1) {
            newNode.next = this.head;
        } else {
            this.tail = newNode;
        }

        this.head = newNode;
        this.size++;
    }

    // Get first element
    public int getFirst() throws Exception {
        if (this.size == 0) {
            throw new Exception("List is empty");
        }
        return this.head.data;
    }

    // Get last element
    public int getLast() throws Exception {
        if (this.size == 0) {
            throw new Exception("List is empty");
        }
        return this.tail.data;
    }

    // Get element at specific index
    public int getAt(int idx) throws Exception {
        if (this.size == 0) {
            throw new Exception("List is empty");
        }
        if (idx < 0 || idx >= this.size) {
            throw new Exception("Invalid Index");
        }
        Node temp = this.head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    // Get node at specific index (private helper)
    private Node getNodeAt(int idx) throws Exception {
        if (this.size == 0) {
            throw new Exception("List is empty");
        }
        if (idx < 0 || idx >= this.size) {
            throw new Exception("Invalid Index");
        }
        Node temp = this.head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // Add element at specific index - O(n)
    public void addAt(int item, int idx) throws Exception {
        if (idx < 0 || idx > this.size) {
            throw new Exception("Invalid Index");
        }
        if (idx == 0) {
            addFirst(item);
        } else if (idx == this.size) {
            addLast(item);
        } else {
            Node newNode = new Node();
            newNode.data = item;
            newNode.next = null;

            Node nm1 = getNodeAt(idx - 1);
            Node np1Node = nm1.next;

            nm1.next = newNode;
            newNode.next = np1Node;
            this.size++;
        }
    }

    // Remove first element - O(1)
    public int removeFirst() throws Exception {
        if (this.size == 0) {
            throw new Exception("List is empty");
        }
        int rv = this.head.data;
        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            this.size = 0;
        } else {
            this.head = this.head.next;
            this.size--;
        }
        return rv;
    }

    // Remove last element - O(n)
    public int removeLast() throws Exception {
        if (this.size == 0) {
            throw new Exception("List is empty");
        }
        int returnValue = this.tail.data;
        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            this.size = 0;
        } else {
            Node sm2 = getNodeAt(this.size - 2);
            sm2.next = null;
            this.tail = sm2;
            this.size--;
        }
        return returnValue;
    }

    // Remove element at specific index - O(n)
    public int removeAt(int idx) throws Exception {
        if (idx < 0 || idx >= this.size) {
            throw new Exception("Invalid Index");
        }
        if (this.size == 0) {
            throw new Exception("List is empty");
        }
        if (idx == 0) {
            return removeFirst();
        } else if (idx == this.size - 1) {
            return removeLast();
        } else {
            Node nm1 = getNodeAt(idx - 1);
            Node n = nm1.next;
            Node np1 = n.next;

            nm1.next = np1;
            this.size--;
            return n.data;
        }
    }

    // Reverse by swapping data - O(n²) - FIXED: Added throws Exception
    public void reverseData() throws Exception {
        int left = 0;
        int right = this.size - 1;
        while (left < right) {
            Node leftNode = getNodeAt(left);
            Node rightNode = getNodeAt(right);
            int temp = leftNode.data;
            leftNode.data = rightNode.data;
            rightNode.data = temp;
            left++;
            right--;
        }
    }
    //reverse by changing pointers - O(n) - FIXED: Added throws Exception
    public void reversePointers(){
        Node prev = this.head;
        Node curr = prev.next; 
        while (curr !=null) {
            Node ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;

        }
        //swap head and tail
        Node temp = this.head;  
        this.head = this.tail;
        this.tail = temp;
        this.tail.next = null;        
    }
    public int mid(){
        Node slow = this.head;
        Node fast = this.head;
        while (fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
    public int size() {
        return this.size;
    }
    public boolean isEmpty() {
        return this.size == 0;
    }
}