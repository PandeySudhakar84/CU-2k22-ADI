package Lec14;

public class Diameter_of_Binary_Tree {
     //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public int diameterOfBinaryTree(TreeNode root) {
            if(root==null){
                return 0;
            }
            int left=diameterOfBinaryTree(root.left);
            int right=diameterOfBinaryTree(root.right);
            int leftHeight=Height(root.left);
            int rightHeight=Height(root.right);
            int s=(leftHeight+rightHeight)+2;
            return Math.max(s,Math.max(left,right));
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
