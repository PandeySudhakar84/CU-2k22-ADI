package Lec13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightViewUsingLevelOrderTraversal {
    //    Definition for a binary tree node.
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
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer>ll=new ArrayList<>();
            Queue<TreeNode> q=new LinkedList<>();
            if(root==null){
                return ll;
            }
            q.add(root);
            while(!q.isEmpty()){
                List<Integer>list=new ArrayList<>();
                int size=q.size();
                for(int i=0;i<size;i++){
                    TreeNode temp=q.remove();
                    list.add(temp.val);
                    if(temp.left!=null){
                        q.add(temp.left);
                    }
                    if(temp.right!=null){
                        q.add(temp.right);
                    }
                }
                int lastElement=list.get(list.size()-1);
                ll.add(lastElement);
            }
            return ll;
        }
    }
}
