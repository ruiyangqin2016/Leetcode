package Q112_PathSum;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
//        TreeNode root = new TreeNode(3);
//        root.left = new TreeNode(9);
//        root.right = new TreeNode(20);
//        root.right.left = new TreeNode(15);
//        root.right.right = new TreeNode(7);
//        root.right.right.right = new TreeNode(11);
//        root.right.right.left = new TreeNode(18);
//        root.right.right.right.right = new TreeNode(5);
//        int sum = 37;
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.left.left = new TreeNode(5);
//        root.left = new TreeNode(2);
        int sum = 6;
        boolean result = hasPathSum(root, sum);
        System.out.println(result);
    }

    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        Set<Integer> tempSet = new HashSet<>();
        if (root.left != null && root.right !=null) {
            helper(root, tempSet, 0, sum);
            if (tempSet.contains(sum)) {
                return true;
            } else {
                return false;
            }
        } else {
            if (root.right == null && root.left == null) {
                return sum == root.val;
            } else {
                if (root.left != null) {
                    helper(root.left, tempSet, root.val, sum);
                } else {
                    helper(root.right, tempSet, root.val, sum);
                }
                if (tempSet.contains(sum)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }

    private static void helper(TreeNode node, Set<Integer> tempSet,int
            tempSum, int sum) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            tempSet.add(tempSum + node.val);
            if (tempSum + node.val == sum) {
                return;
            }
        }
        if (node != null) {
            helper(node.left, tempSet, tempSum + node.val, sum);
            helper(node.right, tempSet, tempSum + node.val, sum);
        }
    }
}

