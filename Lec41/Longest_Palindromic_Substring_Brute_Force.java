package Lec41;

public class Longest_Palindromic_Substring_Brute_Force {
    class Solution {
        public String longestPalindrome(String s) {
            if (s == null || s.length() == 0) {
                return "";
            }

            // Initial check for single character input
            if (s.length() == 1) {
                return s;
            }

            String ans = "";
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j <= s.length(); j++) {
                    String P = s.substring(i, j);
                    if (IsPallindrome(P)) {
                        if (P.length() > ans.length()) {
                            ans = P;
                        }
                    }
                }
            }
            return ans;
        }

        public static boolean IsPallindrome(String s) {
            int low = 0;
            int high = s.length() - 1;
            while (low <= high) {
                if (s.charAt(low) != s.charAt(high)) {
                    return false;
                }
                low++;
                high--;
            }
            return true;
        }
    }
}
