package Q101_SymmetricTree;

public class Solution {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        System.out.println(isSymmetric(root));
    }

    public static boolean isSymmetric(TreeNode root) {
        return symmHelper(root, root);
    }

    private static boolean symmHelper(TreeNode node1, TreeNode node2) {

        if (node1 == null && node2 == null) return true;
        if (node1 == null || node2 == null) return false;

        return (node1.val == node2.val)
                && symmHelper(node1.left, node2.right)
                && symmHelper(node1.right, node2.left);
    }
}
