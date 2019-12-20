package ayman.problemsolving.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {

    // recursive
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        addElementInorderTraversal(root, list);
        return list;
    }

    public void addElementInorderTraversal(TreeNode root, List<Integer> list) {
        if (root != null) {
            list.add(root.val);
            addElementInorderTraversal(root.left, list);
            addElementInorderTraversal(root.right, list);
        }
    }

    // iterative
    public List<Integer> preorderTraversal2(TreeNode root) {
        if (root == null)
            return new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.empty()) {
            TreeNode current = stack.pop();
            list.add(current.val);

            if (current.right != null)
                stack.push(current.right);
            if (current.left != null)
                stack.push(current.left);

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
