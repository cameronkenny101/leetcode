public class Cameras {

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
        TreeNode root = new TreeNode(0, new TreeNode(0, null, new TreeNode(0, new TreeNode(0, null, new TreeNode(0, new TreeNode(0), null)), null)), null);
        System.out.println(minCameraCover(root));
    }

    static int count = 0;
    enum Status {UNSECURE, CAMERA, SECURE};

    public static int minCameraCover(TreeNode root) {
        if(root.right == null && root.left == null)
            return 1;
        Status roof = DFS(root);
        if(roof == Status.UNSECURE)
            count++;
        return count;
    }

    private static Status DFS(TreeNode root) {
        if(root == null)
            return Status.SECURE;

        Status left = DFS(root.left);
        Status right = DFS(root.right);

        if(left == Status.UNSECURE || right == Status.UNSECURE) {
            count++;
            return Status.CAMERA;
        } else if(left == Status.CAMERA || right == Status.CAMERA)
            return  Status.SECURE;
        else
            return Status.UNSECURE;
    }
}
