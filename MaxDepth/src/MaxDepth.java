public class MaxDepth {

    public class TreeNode {
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

    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        return Math.max(longestBranch(root.left, 1), longestBranch(root.right, 1));
    }

    public int longestBranch(TreeNode node, int count) {
        if(node == null)
            return count;
        else
            return Math.max(longestBranch(node.left, count + 1), longestBranch(node.right, count + 1));

    }
}
