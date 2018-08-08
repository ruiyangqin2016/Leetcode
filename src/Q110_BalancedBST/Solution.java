package Q110_BalancedBST;

public class Solution {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
//        root.left.left = new TreeNode(3);
        root.right.right = new TreeNode(7);
        root.right.left = new TreeNode(15);
//        root.left.left.left = new TreeNode(4);
//        root.right.right.right = new TreeNode(4);
        System.out.println(isBalanced(root));
    }

    public static boolean isBalanced(TreeNode root) {
        if (root != null) {
            return Math.abs(depth(root.right) - depth(root.left)) <= 1
                    && isBalanced(root.left)
                    && isBalanced(root.right);
        }
        return true;
    }

    private static int depth(TreeNode node) {
        if (node != null) {
            return Math.max(depth(node.left), depth(node.right)) + 1;
        }
        return 0;
    }
}
