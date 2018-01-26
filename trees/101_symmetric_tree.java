/*
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
    1
   / \
  2   2
 / \ / \
3  4 4  3

But the following [1,2,2,null,3,null,3] is not:
    1
   / \
  2   2
   \   \
   3    3

Challenge:
    Solve it both recursively and iteratively. 
*/

/*
Thought process:
    1. Recursive solution:
           Base case: return true when both nodes are null.
           Recursive steps: check equality of the left child of the left subtree and the right child of the right subtree, and the equality of the right child of the left subtree and the left child of the right subtree.  
    2. Iterative solution: (BFS)
           Push node into the stack, according to the following order: left.left - right.right - left.right - right.left. 
           Pop the top two nodes and compare.     
*/

// recursive
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root == null || isSymmetricHelp(root.left, root.right);
    }

    private boolean isSymmetricHelp(TreeNode left, TreeNode right){
        if (left == null || right == null) return left == right;
        if (left.val != right.val) return false;
        return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
    }
}

// iterative
public boolean isSymmetric(TreeNode root) {
    if (root==null)  return true;   
    Stack<TreeNode> stack = new Stack<>();
    TreeNode left = null, right = null;
    if (root.left != null){
        if (root.right == null) return false;
        stack.push(root.left);
        stack.push(root.right);
    } else if (root.right != null) {
        return false;
    }
        
    while (!stack.empty()){
        if (stack.size() % 2 != 0) return false;
        right = stack.pop();
        left = stack.pop();
        if (right.val != left.val) return false;
        if (left.left != null) {
            if (right.right == null)   return false;
            stack.push(left.left);
            stack.push(right.right);
        } else if (right.right != null) {
            return false;
        }
        if (left.right != null) {
            if (right.left == null) return false;
            stack.push(left.right);
            stack.push(right.left);
        } else if (right.left != null) {
            return false;
        }
    }
    return true;
}
