package Lec14;

public class Balanced_Binary_Tree {
    //   Definition for a binary tree node.
    public class TreeNode {
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

    class Solution {
        public boolean isBalanced(TreeNode root) {
            if(root==null){
                return true;
            }
            boolean left=isBalanced(root.left);
            boolean right=isBalanced(root.right);
            int leftHeight=Height(root.left);
            int rightHeight=Height(root.right);
            boolean self=Math.abs(leftHeight-rightHeight)<=1;

            return left && right && self;

        }
        public static int Height(TreeNode root){
            if(root==null){
                return -1;
            }
            int left=Height(root.left);
            int right=Height(root.right);
            return Math.max(left,right)+1;
        }
    }
}
