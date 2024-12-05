package Lec40;
import java.util.*;
    public class Z_Algo {
        public static ArrayList<Integer> search(String pattern, String text) {
            String concat = pattern + "$" + text;
            ArrayList<Integer> result = new ArrayList<>();
            int length = concat.length();
            int[] Z = new int[length];
            getZarr(concat, Z);

            for (int i = 0; i < length; ++i) {
                if (Z[i] == pattern.length()) {
                    result.add(i - pattern.length() - 1);
                }
            }
            return result;
        }
        private static void getZarr(String str, int[] Z) {
            int n = str.length();
            int L = 0, R = 0;
            for (int i = 1; i < n; ++i) {
                if (i > R) {
                    L = R = i;
                    while (R < n && str.charAt(R - L) == str.charAt(R)) {
                        R++;
                    }
                    Z[i] = R - L;
                    R--;
                } else {
                    // Case when i is within the current Z-box
                    int k = i - L;
                    if (Z[k] < R - i + 1) {
                        Z[i] = Z[k];
                    } else {
                        L = i;
                        while (R < n && str.charAt(R - L) == str.charAt(R)) {
                            R++;
                        }
                        Z[i] = R - L;
                        R--;
                    }
                }
            }
        }

        // Main method for testing
        public static void main(String[] args) {
            String pattern = "abc";
            String text = "abcabdabcabcabd";
            ArrayList<Integer> result = search(pattern, text);
            System.out.println(result);
        }
    }
