import java.util.ArrayList;

public class SumRoot {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println(sumNumbers(root));
    }

    public static int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    private static int dfs(TreeNode root, int curr) {
        if(root == null)
            return 0;
        curr = curr * 10 + root.val;
        if(root.left == null && root.right == null)
            return curr;
        int left = dfs(root.left, curr);
        int right = dfs(root.right, curr);
        return left + right;
    }


}
