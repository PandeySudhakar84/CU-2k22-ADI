package Lec40;

public class Find_the_Index_of_the_First_Occurrence_in_a_String {
    class Solution {
        public int strStr(String haystack, String needle) {
            if(!haystack.contains(needle)){
                return -1;
            }
            return haystack.indexOf(needle);
        }
    }
}
