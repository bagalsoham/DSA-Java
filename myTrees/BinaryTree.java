package myTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class BinaryTree {
    private class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

    }

    private Node root;
    private int size;

    public BinaryTree() {
        Scanner s = new Scanner(System.in);
        this.root = takeInput(s, null, false);
    }

    private Node takeInput(Scanner s, Node parent, boolean isLeftorRightChild) {
        if (parent == null) {
            System.out.println("Enter the data for root node : ");

        } else {
            if (isLeftorRightChild) {
                System.out.println("Enter the data for left child of " + parent.data + " : ");
            } else {
                System.out.println("Enter the data for right child of " + parent.data + " : ");
            }

        }
        int nodeData = s.nextInt();
        Node node = new Node(nodeData, null, null);// constructing new node
        this.size++;
        boolean choice = false;
        System.out.println("Do you want to add left child for " + nodeData + " ? ");
        choice = s.nextBoolean();

        if (choice) {
            node.left = takeInput(s, node, true);
        }
        choice = false;
        System.out.println("Do you want to add right child for " + nodeData + " ? ");
        choice = s.nextBoolean();

        if (choice) {
            node.right = takeInput(s, node, false);
        }

        return node;
    }

    public void display() {
        this.display(this.root); // root is not visible outside the class
    }

    private void display(Node node) {
        String str = "";
        if (node.left != null) {
            str = str + node.left.data + " => ";
        } else {
            str = str + "END => ";
        }
        str = str + node.data;
        if (node.right != null) {
            str = str + " <= " + node.right.data;
        } else {
            str = str + " <= END";
        }
        System.out.println(str);
        if (node.left != null) {
            display(node.left);
        }
        if (node.right != null) {
            display(node.right);
        }
    }

    public int height() {
        return this.height(this.root);
    }

    private int height(Node node) {
        if (node == null) {
            return -1;
        }
        int lHeight = this.height(node.left);
        int rHeight = this.height(node.right);

        int height = Math.max(rHeight, lHeight);
        return height + 1;
    }

    public void preOrder() {
        this.preOrder(this.root);
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder() {
        this.inOrder(this.root);
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public void postOrder() {
        this.postOrder(this.root);
    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public void levelOrder() {
        this.levelOrder(this.root);
    }

    private void levelOrder(Node node) {
        LinkedList<Node> queue = new LinkedList<>();
        queue.addLast(node);
        while (!queue.isEmpty()) {
            Node rv = queue.removeFirst();
            System.out.print(rv.data + " ");
            if (rv.left != null) {
                queue.addLast(rv.left);
            }
            if (rv.right != null) {
                queue.addLast(rv.right);
            }
        }
    }

    public boolean isBST() {
        return isBST(this.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBST(Node node, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.data > max || node.data < min) {
            return false;
        } else if (!this.isBST(node.left, min, node.data)) {
            return false;
        } else if (!this.isBST(node.right, node.data, max)) {
            return false;
        }
        return true;
    }

    public boolean isBSTUsingInorder() {
        ArrayList<Integer> inorderList = new ArrayList<>();
        inOrder(this.root, inorderList);

        // Check if the inorder list is sorted
        for (int i = 1; i < inorderList.size(); i++) {
            if (inorderList.get(i) < inorderList.get(i - 1)) { // strictly increasing
                return false;
            }
        }
        return true;
    }

    private void inOrder(Node node, ArrayList<Integer> list) {
        if (node == null) {
            return;
        }
        inOrder(node.left, list);
        list.add(node.data);
        inOrder(node.right, list);
    }
    public int sumLeaf(){
        return sumLeaf(this.root);
    }
    private int sumLeaf(Node node){
        if(node ==null){
            return 0;
        }
        if(node.left == null && node.right == null){
            return node.data;
        }
        int lsum = sumLeaf(node.left);
        int rsum = sumLeaf(node.right);
        return lsum + rsum;

    }

}