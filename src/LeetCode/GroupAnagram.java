package LeetCode;

import java.util.*;

public class GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        //for every word in strs
        for (String word : strs) {
            //we sort the word
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
             //it gets made into sorted word^
            //if map does not contain sorted word make a new list of words if it does add it to the anagrams list
            if (!map.containsKey(sortedWord)) {
                //put sorted word into new array list
                map.put(sortedWord, new ArrayList<>());
            }
            //for the sorted word in the key add the word
            map.get(sortedWord).add(word);
        }

        return new ArrayList<>(map.values());
    }




    public static void main(String[] args) {
        String []strs = {"eat","tea","tan","ate","nat","bat"};
        groupAnagrams(strs);

    }
}
