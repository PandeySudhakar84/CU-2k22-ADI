package Lec4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
public class Group_Anagrams {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String,List<String>> map=new HashMap<>();
            for(String word:strs){
                char chars[]=word.toCharArray();
                Arrays.sort(chars);
                String SortedArray=new String(chars);
                if(!map.containsKey(SortedArray)){
                    map.put(SortedArray,new ArrayList<>());
                }
                map.get(SortedArray).add(word);
            }

            return new ArrayList<>(map.values());
        }
    }
}
