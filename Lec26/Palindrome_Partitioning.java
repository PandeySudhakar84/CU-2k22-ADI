package Lec26;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {
    class Solution {
        public List<List<String>> partition(String s) {
            List<List<String>> ans = new ArrayList<>();
            Partition(s, ans, new ArrayList<>(), 0, s.length());
            return ans;
        }
        public static void Partition(String s, List<List<String>> ans, List<String> list, int i, int j) {
            if (i == j) {
                ans.add(new ArrayList<>(list));
                return;
            }

            for (int k = i; k < j; k++) {
                if (IsPalindrome(s, i, k)) {
                    list.add(s.substring(i, k + 1));
                    Partition(s, ans, list, k + 1, j);
                    list.remove(list.size() - 1);
                }
            }
        }
        public static boolean IsPalindrome(String s, int i, int j) {
            while (i < j) {
                if (s.charAt(i) != s.charAt(j)) return false;
                i++;
                j--;
            }
            return true;
        }
    }
}
