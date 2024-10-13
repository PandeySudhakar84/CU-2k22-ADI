package Lec4;
import java.util.HashMap;
public class Valid_Anagram {
    class Solution {
        public boolean isAnagram(String s, String t) {
            HashMap<Character,Integer> map=new HashMap<>();
            HashMap<Character,Integer> map1=new HashMap<>();
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(map.containsKey(ch)){
                    int count=map.get(ch);
                    map.put(ch,count+1);
                }
                else{
                    map.put(ch,1);
                }
            }
            for(int i=0;i<t.length();i++){
                char ch=t.charAt(i);
                if(map1.containsKey(ch)){
                    int count=map1.get(ch);
                    map1.put(ch,count+1);
                }
                else{
                    map1.put(ch,1);
                }
            }
            if(!map.equals(map1)){
                return false;
            }
            return true;
        }
    }
}
