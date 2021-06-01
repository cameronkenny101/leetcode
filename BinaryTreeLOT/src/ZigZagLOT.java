import java.util.*;

public class ZigZagLOT {

    public List<List<Integer>> levelOrder(LOT.TreeNode root) {
        boolean zigzag = false;
        if(root == null)
            return new ArrayList<>();
        List<java.util.List<Integer>> list = new ArrayList<>();
        Queue<LOT.TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> levelList = new ArrayList<>();
            for(int i = 0; i < size; i++) {
                LOT.TreeNode node = queue.poll();
                levelList.add(node.val);
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
            }
            if(zigzag) {
                Collections.reverse(levelList);
                zigzag = false;
            } else
                zigzag = true;
            list.add(levelList);
        }
        return list;
    }
}
