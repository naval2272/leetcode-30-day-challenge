package week_5;

class TreeNode {
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

public class day1 {
  int result = Integer.MIN_VALUE;

  public int maxPathSum(TreeNode root) {
    maxSumHelper(root);

    return result;
  }

  public int maxSumHelper(TreeNode node) {
    // base case
    if(node == null) return 0;

    // recursive cases
    // 1. Go to the left subtree
    int leftWeight = Math.max(maxSumHelper(node.left), 0);
    // 2. Go to the right subtree
    int rightWeight = Math.max(maxSumHelper(node.right), 0);

    result = Math.max(result, node.val + leftWeight + rightWeight);

    return node.val + Math.max(leftWeight, rightWeight);
  }
}
