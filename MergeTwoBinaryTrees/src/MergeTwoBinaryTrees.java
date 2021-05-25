public class MergeTwoBinaryTrees {

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

    private static TreeNode merge(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null)
            return null;
        else if(root1 == null)
            return root2;
        else if(root2 == null)
            return root1;

        TreeNode node = new TreeNode(root1.val + root2.val);
        node.left = merge(root1.left, root2.left);
        node.right = merge(root1.right, root2.right);
        return node;
    }
}
