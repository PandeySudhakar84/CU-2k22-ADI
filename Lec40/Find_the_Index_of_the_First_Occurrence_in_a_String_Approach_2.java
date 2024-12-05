package Lec40;
public class Find_the_Index_of_the_First_Occurrence_in_a_String_Approach_2 {
    class Solution {
        public int strStr(String haystack, String needle) {
            if (haystack.length() < needle.length()) {
                return -1; // Needle cannot fit in haystack
            }
            for (int i = 0; i <= haystack.length() - needle.length(); i++) {
                if (haystack.substring(i, i + needle.length()).equals(needle)) {
                    return i;
                }
            }
            return -1;
        }
    }
}
