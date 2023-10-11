package LeetCode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> intMap = new LinkedHashMap<>();
        for (Integer i : nums) {
            intMap.put(i, intMap.getOrDefault(i, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> topKEntries = intMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .skip(intMap.size() - k)
                .collect(Collectors.toList());
        // Extract the keys from the top k entries into an Integer array
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = topKEntries.get(i).getKey();
        }
        return result;
    }
    }


// Skip the first entry (index 0);

//        List<Map.Entry<Integer, Integer>> topKEntries = intMap.entrySet().stream()
//                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
//                .limit(k)
//                .collect(Collectors.toList());
