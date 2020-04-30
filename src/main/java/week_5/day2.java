package week_5;

public class day2 {
  public boolean isValidSequence(TreeNode root, int[] arr) {
    if(root == null) return arr.length == 0;

    return dfsHelper(root, arr, 0);
  }

  public boolean dfsHelper(TreeNode node, int[] arr, int index) {
    // Base case
    if(node.val != arr[index]) {
      return false;
    }
    if(index == arr.length - 1) {
      return node.left == null && node.right == null;
    }

    // Recursive case
    return (node.left != null && dfsHelper(node.left, arr, index + 1)) || (node.right != null && dfsHelper(node.right, arr, index + 1));
  }
}
