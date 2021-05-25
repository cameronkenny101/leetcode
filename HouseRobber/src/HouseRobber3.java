public class HouseRobber3 {

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
        TreeNode root = new TreeNode(4, new TreeNode(1, new TreeNode(2, new TreeNode(3, null, null), null), null), null);
        rob(root);
    }

    private static int rob(TreeNode root) {
        int[] leftPair = dfs(root.left);
        int[] rightPair = dfs(root.right);

        return Math.max(root.val + leftPair[1] + rightPair[1], Math.max(leftPair[0], leftPair[1]) + Math.max(rightPair[0], rightPair[1]));
    }

    private static int[] dfs(TreeNode root) {
        if(root == null) {
            return new int[]{0, 0};
        }

        int[] leftPair = dfs(root.left);
        int[] rightPair = dfs(root.right);

        return new int[]{root.val + leftPair[1] + rightPair[1], Math.max(leftPair[0], leftPair[1]) + Math.max(rightPair[0], rightPair[1])};
    }
}
