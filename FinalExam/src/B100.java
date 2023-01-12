public class B100 {
    public static void main(String[] args) {
        TreeNode nodeTwo = new TreeNode(2);
        TreeNode nodeThree = new TreeNode(3);
        TreeNode nodeOne = new TreeNode(1,nodeTwo,nodeThree);
        TreeNode nodeFour = new TreeNode(2);
        TreeNode nodeFive = new TreeNode(3);
        TreeNode nodeOne1 = new TreeNode(1,nodeFour,nodeFive);
    }
    public static class TreeNode {
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

    public class Solution {
        public   boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null && q == null) return true;// nếu 2 cây rỗng return true .. vừa là th đặc biệt vừa là Điểm dừng
            if (p == null || q == null) return false; //1 trong 2 là null ==>> 2 cây k có cùng node
            if (p.val != q.val) return false; // khác giá trị tại cùng 1 vị trí khi duyệt
            // dùng đệ quy để duyệt từ đầu đến hết cây
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right); // duyệt từ gốc đến hết
        }
    }
    // Độ phực tạp không gian : O(h) , h là chiều cao của cây
}
