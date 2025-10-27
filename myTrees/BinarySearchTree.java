package myTrees;

public class BinarySearchTree {
    private class Node{
        int data;
        Node left;
        Node right;

    }
    private Node root;
    public BinarySearchTree( int[] arr) {
        this.root = construct(arr,0,arr.length -1);

    }
    private Node construct(int[] arr,int lo,int hi){
        //find mid
        if(lo>hi){
            return null;
        }
        int mid = (lo + hi) / 2;
        //create node
        Node node = new Node();
        node.data = arr[mid];

        //left subtree
        node.left = construct(arr, lo, mid - 1);
        //right subtree
        node.right = construct(arr, mid + 1, hi);
        
        return node;
    }
    
}
