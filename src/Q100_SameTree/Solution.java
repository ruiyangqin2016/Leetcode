package Q100_SameTree;

public class Solution {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
//        root1.left = new TreeNode(2);
//        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
//        root2.right = new TreeNode(3);

        boolean ans = isSameTree(root1, root2);
        System.out.println(ans);
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        else if (p == null || q == null) return false;
        return (p.val == q.val)
                && isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);

//        boolean same = false;
//        helper(p, q, same);
//        return same;
    }

//    private static void helper(TreeNode p, TreeNode q, boolean same) {
//        if (p == null && q == null) {
//            same = true;
//        } else if ((p != null && q == null) || (p == null && q != null)) {
//            same = false;
//        } else {
//            if (p.val == q.val) {
//                same = true;
//                helper(p.left, q.left, same);
//                helper(p.right, q.right, same);
//            }
//        }
//
////        return same;
//    }
}
