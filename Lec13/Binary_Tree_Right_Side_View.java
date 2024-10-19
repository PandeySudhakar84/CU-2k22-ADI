package Lec13;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Right_Side_View {
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
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> list=new ArrayList<>();
            RightView(root,1,list);
            return list;
        }
        int Visited=0;
        public void RightView(TreeNode root,int CurrentLevel,List<Integer> list){
            if(root==null){
                return;
            }
            if(Visited<CurrentLevel){
                list.add(root.val);
                Visited=CurrentLevel;
            }
            RightView(root.right,CurrentLevel+1,list);
            RightView(root.left,CurrentLevel+1,list);
        }
    }
}
