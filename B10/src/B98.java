import java.util.LinkedList;
import java.util.List;

public class B98 {
    LinkedList<Integer> res = new LinkedList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        postOder(root);
        return res;
    }
// Đệ quy
    public int postOder(TreeNode root) {
        if (root == null) {
            return 0;
        }
        postOder(root.left);
        postOder(root.right);
        res.add(root.val);
        return 0;
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
