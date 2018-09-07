package ayman.problemsolving.com;

public class MaximumDepthOfBinaryTree {

    // https://leetcode.com/problems/maximum-depth-of-binary-tree/description/

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        return 1 + Math.max(maxDepth(root.right), maxDepth(root.left));
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
