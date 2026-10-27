package Tree;

public class MinimumDepthInBST {

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

    public int MinDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(MinDepth(root.left), MinDepth(root.right));
    }

}
