import com.sun.source.tree.Tree;

public class ConvertedArray {

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

    private static TreeNode searchTree(int[] nums) {
        return build(nums,0,nums.length-1);
    }

    private static TreeNode build(int[] nums, int start, int end) {
        if(start > end)
            return null;
        int mid = (start + end)/2;
        TreeNode root  = new TreeNode(nums[mid]);
        root.left = build(nums,start,mid-1);
        root.right = build(nums,mid+1,end);
        return root;
    }
}
