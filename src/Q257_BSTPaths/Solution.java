package Q257_BSTPaths;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(9);
        root.left.right = new TreeNode(10);
        for (String print: binaryTreePaths(root)) {
            System.out.println(print);
        }
    }

    private static List<String> list = new ArrayList<>();
    public static List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        if (root.left == null && root.right == null) {
            list.add(Integer.toString(root.val));
        } else {
            dfs(root.right, root.val + "");
            dfs(root.left, root.val + "");
        }
        return list;
    }
    private static void dfs(TreeNode node, String str) {
        if (node == null) return;
        str += "->" + node.val;
        if (node.left == null && node.right == null) list.add(str);
        dfs(node.left, str);
        dfs(node.right, str);
    }
}
