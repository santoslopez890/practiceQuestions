package LeetCode;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindAllDupsInAnArray {
    class Solution {
        public List<Integer> findDuplicates(int[] nums) {
            Map<Integer, Integer> intMap = new LinkedHashMap<>();
            for (Integer i : nums) {
                intMap.put(i, intMap.getOrDefault(i, 0) + 1);
            }
            //then used a stream to sort them by values and then skip the ones we dont want and then collect them to a list
            List<Integer> result = intMap.entrySet().stream()
                    .filter(k->k.getValue()>1)
                    .map(Map.Entry::getKey)
                    .toList();
            // Extract the keys from the top k entries into an Integer array
            return result;
        }
    }
}
