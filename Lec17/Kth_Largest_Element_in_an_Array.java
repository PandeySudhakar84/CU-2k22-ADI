package Lec17;

import java.util.PriorityQueue;

public class Kth_Largest_Element_in_an_Array {
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            PriorityQueue<Integer> sc=new PriorityQueue<>();
            for(int i=0;i<k;i++){
                sc.add(nums[i]);
            }
            for(int i=k;i<nums.length;i++){
                if(sc.peek()<nums[i]){
                    sc.remove();
                    sc.add(nums[i]);
                }
            }
            return sc.peek();
        }
    }
}
