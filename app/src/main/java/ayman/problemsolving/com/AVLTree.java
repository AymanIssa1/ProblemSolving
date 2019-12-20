package ayman.problemsolving.com;

public class AVLTree {

    /* Class AVLNode */
    class AVLNode {
        AVLNode left, right;
        int data;
        int height;

        /* Constructor */
        public AVLNode() {
            left = null;
            right = null;
            data = 0;
            height = 0;
        }

        /* Constructor */
        public AVLNode(int n) {
            left = null;
            right = null;
            data = n;
            height = 0;
        }
    }

    private AVLNode root;

    /* Constructor */
    public AVLTree() {
        root = null;
    }

    /* Function to check if tree is empty */
    public boolean isEmpty() {
        return root == null;
    }

    /* Make the tree logically empty */
    public void makeEmpty() {
        root = null;
    }

    /* Function to insert data */
//    public void insert(int data) {
//        root = insert(data, root);
//    }

    /* Function to get height of node */
    private int height(AVLNode t) {
        return t == null ? -1 : t.height;
    }

    /* Function to max of left/right node */
    private int max(int lhs, int rhs) {
        return lhs > rhs ? lhs : rhs;
    }

}
