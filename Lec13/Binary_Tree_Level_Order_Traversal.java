package Lec13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary_Tree_Level_Order_Traversal {
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
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> list=new ArrayList<>();
            Queue<TreeNode> q=new LinkedList<>();
            if(root==null){
                return list;
            }
            q.add(root);
            while(!q.isEmpty()){
                List<Integer> level=new ArrayList<>();
                int size=q.size(); //
                for(int i=0;i<size;i++){
                    TreeNode temp=q.remove();
                    level.add(temp.val);
                    if(temp.left!=null){
                        q.add(temp.left);
                    }
                    if(temp.right!=null){
                        q.add(temp.right);
                    }
                }
                list.add(level);
            }
            return list;
        }
    }
}
