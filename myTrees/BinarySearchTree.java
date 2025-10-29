package myTrees;

public class BinarySearchTree {

    private class Node {
        int data;
        Node left;
        Node right;
    }

    private Node root;

    // Constructor: builds a balanced BST from a sorted array
    public BinarySearchTree(int[] arr) {
        this.root = construct(arr, 0, arr.length - 1);
    }

    private Node construct(int[] arr, int lo, int hi) {
        if (lo > hi) {
            return null;
        }

        int mid = (lo + hi) / 2;

        Node node = new Node();
        node.data = arr[mid];

        node.left = construct(arr, lo, mid - 1);
        node.right = construct(arr, mid + 1, hi);

        return node;
    }

    // ------------------ Display ------------------
    public void display() {
        display(this.root);
    }

    private void display(Node node) {
        if (node == null) {
            return;
        }

        String str = "";

        if (node.left == null) {
            str += ".";
        } else {
            str += node.left.data;
        }

        str += " => " + node.data + " <= ";

        if (node.right == null) {
            str += ".";
        } else {
            str += node.right.data;
        }

        System.out.println(str);

        if (node.left != null) {
            display(node.left);
        }
        if (node.right != null) {
            display(node.right);
        }
    }

    // ------------------ Find ------------------
    public boolean find(int value) {
        return find(this.root, value);
    }

    private boolean find(Node node, int value) {
        if (node == null) {
            return false;
        }

        if (value > node.data) {
            return find(node.right, value);
        } else if (value < node.data) {
            return find(node.left, value);
        } else {
            return true;
        }
    }

    // ------------------ Max ------------------
    public int max() {
        return max(this.root);
    }

    private int max(Node node) {
        if (node.right != null) {
            return max(node.right);
        } else {
            return node.data;
        }
    }

    // ------------------ Add (Fixed Version) ------------------
    public void add(int value) {
        this.root = add(this.root, value);
    }

    private Node add(Node node, int value) {
        // base case
        if (node == null) {
            Node nn = new Node();
            nn.data = value;
            return nn;
        }

        if (value > node.data) {
            node.right = add(node.right, value);// recursive call to right subtree 
        } else {
            node.left = add(node.left, value);
        }

        return node;
    }
    
    public void remove(int item) {
        this.root = remove(this.root, item);
    }
    
    private Node remove(Node node, int item) {
        if (node == null) {
            return null; //item not found
        }
        
        if (item > node.data) {
            node.right = remove(node.right, item);
        } else if (item < node.data) {
            node.left = remove(node.left, item);
        } else {
            //item found  
            //case 1 : node with 0 children
            if (node.left == null && node.right == null) {
                return null;
            }
            //case 2 : node with 1 child (only right)
            else if (node.left == null && node.right != null) {
                return node.right;
            }
            //case 3: node with 1 child (only left)
            else if (node.left != null && node.right == null) {
                return node.left;
            }
            //case 4 : node with 2 children
            else {
                int max = max(node.left);
                node.data = max;
                node.left = remove(node.left, max);
            }
        }
        return node;
    }
}