package Q111_MinDepthBST;

public class Solution {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        root.right.right.right = new TreeNode(11);
        root.right.right.left = new TreeNode(18);
        root.right.right.right.right = new TreeNode(5);
        System.out.println(minDepth(root));
    }

    public static int minDepth(TreeNode root) {
        return helper(root);
    }

    private static int helper(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            int left = helper(node.left);
            int right = helper(node.right);
            if (left == 0 || right == 0) {
                return left + right + 1;
            } else {
                return Math.min(left, right) + 1;
            }
        }
    }
}








