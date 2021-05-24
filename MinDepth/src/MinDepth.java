import java.util.LinkedList;
import java.util.Queue;

public class MinDepth {

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

    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int min = 1;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                if(curr.left == null && curr.right == null)
                    return min;
                if(curr.right != null)
                    queue.offer(curr.right);
                if(curr.left != null)
                    queue.offer(curr.left);
            }
            min++;
        }
        return min;
    }

}
