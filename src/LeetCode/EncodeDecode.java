package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeDecode {

        /*
         * @param strs: a list of strings
         * @return: encodes a list of strings to a single string.
         */
        public static String encode(List<String> strs) {
            // write your code here
            StringBuilder result=new StringBuilder();
            for (String i:strs
                 ) {
                result.append(i+":;");
            }
        return result.toString();
        }

        /*
         * @param str: A string
         * @return: decodes a single string to a list of strings
         */
        public static List<String> decode(String str) {
            String[] result =str.split(":;");
           return Arrays.stream(result).toList();
        }

        public static void main(String[] args) {
            ArrayList<String> test= new ArrayList<>(List.of("lint","code","love","you"));
            System.out.println(decode(encode(test)));
            System.out.println("hi");

        }
    }

