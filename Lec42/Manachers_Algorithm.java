package Lec42;

public class Manachers_Algorithm {
    public class Solution {
        public String longestPalindrome(String s) {
            if (s == null || s.length() == 0) {
                return "";
            }
           // transform and wrap the staring with #
            StringBuilder t = new StringBuilder();
            t.append("#");
            for (int i = 0; i < s.length(); i++) {
                t.append(s.charAt(i)).append("#");
            }
            int[] p = new int[t.length()];
            int center = 0, right = 0;
            int maxCenter = 0, maxRadius = 0;

            for (int i = 0; i < t.length(); i++) {
                int mirror = 2 * center - i;
                if (i < right) {
                    p[i] = Math.min(right - i, p[mirror]);
                }
                while (i + p[i] + 1 < t.length() && i - p[i] - 1 >= 0 &&
                        t.charAt(i + p[i] + 1) == t.charAt(i - p[i] - 1)) {
                    p[i]++;
                }

                // Update the center and right boundary if the palindrome at i expands beyond the current right boundary
                if (i + p[i] > right) {
                    center = i;
                    right = i + p[i];
                }
                if (p[i] > maxRadius) {
                    maxRadius = p[i];
                    maxCenter = i;
                }
            }
            int start = (maxCenter - maxRadius) / 2;  // original string me convert kro
            return s.substring(start, start + maxRadius);
        }
    }
}
