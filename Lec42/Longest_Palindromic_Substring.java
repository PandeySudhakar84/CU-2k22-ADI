package Lec42;

public class Longest_Palindromic_Substring {
    class Solution {
        public String longestPalindrome(String s) {
            if (s == null || s.length() == 0) {
                return "";
            }
            int max = 0;
            int start = 0;
            int n = s.length();

            // Check odd length palindromes
            for (int i = 0; i < n; i++) {
                int k = 0;
                while (i - k >= 0 && i + k < n && s.charAt(i - k) == s.charAt(i + k)) {
                    k++;
                }
                k--;
                if ((i + k) - (i - k) + 1 > max) {
                    max = (i + k) - (i - k) + 1;
                    start = i - k;
                }
            }

            // Check even length palindromes
            for (double i = 0.5; i < n; i++) {
                double k = 0.5;
                while (i - k >= 0 && i + k < n && s.charAt((int)(i - k)) == s.charAt((int)(i + k))) {
                    k++;
                }
                k--;
                if ((i + k) - (i - k) + 1 > max) {
                    max = (int)((i + k) - (i - k) + 1);
                    start = (int)(i - k);
                }
            }

            return s.substring(start, start + max);
        }
    }
}
