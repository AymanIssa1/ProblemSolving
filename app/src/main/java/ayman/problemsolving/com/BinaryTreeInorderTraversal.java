package ayman.problemsolving.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {

    // recursive
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        addElementInorderTraversal(root, list);
        return list;
    }

    public void addElementInorderTraversal(TreeNode root, List<Integer> list) {
        if (root != null) {
            addElementInorderTraversal(root.left, list);
            list.add(root.val);
            addElementInorderTraversal(root.right, list);
        }
    }

    // iterative
    public List<Integer> inorderTraversal2(TreeNode root) {
        if (root == null)
            new ArrayList<Integer>();

        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        TreeNode current = root;

        while (current != null || stack.size() > 0) {
            // Reach the left most Node
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            // current must be null at this point
            current = stack.pop();

            list.add(current.val);

            // we have visited the node and it's left subtree.
            // Now, it's right subtree's turn
            current = current.right;
        }
        return list;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
