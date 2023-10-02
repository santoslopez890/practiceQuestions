package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitions {

    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        func(0, s, path, res);
        return res;
    }

    public void func(int ind, String s, List<String> path, List<List<String>> res) {
        if (ind == s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = ind; i < s.length(); i++) {
            if (isPalindrome(s, ind, i)) {
                path.add(s.substring(ind, i + 1));
                func(i + 1, s, path, res);
                path.remove(path.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromePartitions pal=new PalindromePartitions();
        pal.partition("aab");
    }
    }

