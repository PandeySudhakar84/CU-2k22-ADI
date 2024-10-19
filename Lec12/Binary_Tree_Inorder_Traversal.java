package Lec12;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Inorder_Traversal {
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
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> ll=new ArrayList<>();
            Tree(root,ll);
            return ll;
        }
        public void Tree(TreeNode root,List<Integer> ll){
            if(root==null){
                return;
            }
            Tree(root.left,ll);
            ll.add(root.val);
            Tree(root.right,ll);
        }
    }
}
