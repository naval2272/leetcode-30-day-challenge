package week_3;

import java.util.Arrays;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
  }

public class day6 {
  public TreeNode bstFromPreorder(int[] preorder) {
    int[] inorder = Arrays.copyOf(preorder, preorder.length);
    Arrays.sort(inorder);

    return buildTreeHelper(inorder, preorder, 0, preorder.length - 1, 0, preorder.length - 1);
  }

  public TreeNode buildTreeHelper(int[] inOrder, int[] preOrder, int preOrderStart, int preOrderEnd, int inOrderStart, int inOrderEnd) {
    if(inOrderStart > inOrderEnd) {
      return null;
    }

    int rootData = preOrder[preOrderStart];
    int rootIndex = -1;
    for(int i = inOrderStart; i <= inOrderEnd; i++) {
      if(inOrder[i] == rootData) {
        rootIndex = i;
        break;
      }
    }

    int leftPreorderStart = preOrderStart + 1;
    int leftInorderEnd = rootIndex - 1;
    int leftInorderStart = inOrderStart;
    int leftPreorderEnd = leftInorderEnd - leftInorderStart + leftPreorderStart;

    int rightPreorderStart = leftPreorderEnd + 1;
    int rightPreorderEnd = preOrderEnd;
    int rightInorderStart = rootIndex + 1;
    int rightInorderEnd = inOrderEnd;

    TreeNode root = new TreeNode(rootData);
    root.left = buildTreeHelper(inOrder, preOrder, leftPreorderStart, leftPreorderEnd, leftInorderStart, leftInorderEnd);
    root.right = buildTreeHelper(inOrder, preOrder, rightPreorderStart, rightPreorderEnd, rightInorderStart, rightInorderEnd);

    return root;
  }
}

/*
- Create inorder copy of given pre-order
- Use pre-order and inorder representation of tree to create binary tree
*/
