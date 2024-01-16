package LeetCode;

import java.util.*;

public class IsAnagram {
    public static boolean isAnagram(String s, String t) {
        String largest="";
        HashMap<Character,Integer> seen=new HashMap<>();
        HashMap<Character,Integer> seen2=new HashMap<>();
        for(char c:s.toCharArray()){
            seen.put(c,seen.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            seen2.put(c,seen2.getOrDefault(c,0)+1);
        }
        if(s.length()>=t.length()){
            largest=s;
        }
        else{
            largest=t;
        }
        for (int i = 0; i < largest.length(); i++) {
            if(!Objects.equals(seen.get(largest.charAt(i)), seen2.get(largest.charAt(i)))){
                return false;
            }
        }
        return true;
    }

public static boolean isAnagram2(String s, String t) {
    char[] sChars = s.toCharArray();
    char[] tChars = t.toCharArray();

    Arrays.sort(sChars);
    Arrays.sort(tChars);

    return Arrays.equals(sChars, tChars);
}

    public static void main(String[] args) {

        System.out.println( isAnagram2("rat","car"));
       
    }
}
