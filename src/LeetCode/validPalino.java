package LeetCode;

public class validPalino {
    public boolean isPalindrome(String s) {
        //Using regex to replace all special characters and spaces with nothing to check if a sentence is valid
        //"[]"
        String result = s.replaceAll("[^a-zA-Z0-9]", "");
        //using string builder to use the reverse functionality that regular strings dont have
        StringBuilder result2= new StringBuilder(result.toLowerCase());
        return result2.toString().contentEquals(result2.reverse());
    }
}
