package LeetCode;

public class validPalino {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder result2= new StringBuilder(result.toLowerCase());
        return result2.toString().contentEquals(result2.reverse());
    }
}
