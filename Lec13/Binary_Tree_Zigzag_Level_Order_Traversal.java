package Lec13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary_Tree_Zigzag_Level_Order_Traversal {
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
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> ll =new ArrayList<>();
            Queue<TreeNode> q=new LinkedList<>();
            boolean LeftToRight=true;
            if(root==null){
                return ll;
            }
            q.add(root);
            while(!q.isEmpty()){
                List<Integer> level=new ArrayList<>();
                int size=q.size();
                for(int i=0;i<size;i++){
                    TreeNode Node=q.remove();
                    if(LeftToRight){
                        level.add(Node.val);
                    }
                    else{
                        level.add(0,Node.val);
                    }
                    if(Node.left!=null){
                        q.add(Node.left);
                    }
                    if(Node.right!=null){
                        q.add(Node.right);
                    }
                }
                ll.add(level);
                LeftToRight= !LeftToRight;
            }
            return ll;
        }
    }
}
