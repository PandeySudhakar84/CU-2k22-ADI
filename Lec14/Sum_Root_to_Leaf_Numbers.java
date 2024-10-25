package Lec14;
public class Sum_Root_to_Leaf_Numbers {
     // Definition for a binary tree node.
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
        public int sumNumbers(TreeNode root) {
            return Tree(root,0);
        }
        public static int Tree(TreeNode root,int sum){
            if(root==null){
                return 0;
            }
            if(root.left==null && root.right==null){
                return sum*10+root.val;
            }
            int left=Tree(root.left,sum*10+root.val);
            int right=Tree(root.right,sum*10+root.val);
            return left+right;
        }
    }
}
