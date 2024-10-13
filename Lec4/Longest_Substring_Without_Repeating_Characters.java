package Lec4;
import java.util.HashSet;
public class Longest_Substring_Without_Repeating_Characters {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            HashSet<Character> set=new HashSet<>();
            int ei=0;
            int si=0;
            int ans=0;
            while(ei<s.length()){
                if(!set.contains(s.charAt(ei))){
                    set.add(s.charAt(ei));
                    ans=Math.max(ans,set.size());
                    ei++;
                }
                else{
                    set.remove(s.charAt(si));
                    si++;
                }
            }
            return ans;
        }
    }
}
