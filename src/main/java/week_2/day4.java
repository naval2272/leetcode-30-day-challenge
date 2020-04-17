package week_2;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }

public class day4 {
  public int diameterOfBinaryTree(TreeNode root) {
    if(root == null) return 0;

    int leftHeight = getHeight(root.left);
    int rightHeight = getHeight(root.right);

    int leftDiameter = diameterOfBinaryTree(root.left);
    int rightDiameter = diameterOfBinaryTree(root.right);

    return Math.max(leftHeight + rightHeight, Math.max(leftDiameter, rightDiameter));
  }

  private int getHeight(TreeNode root) {
    if(root == null) return 0;
    else {
      return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }
  }
}
