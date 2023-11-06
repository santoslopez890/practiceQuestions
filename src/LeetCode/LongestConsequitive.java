package LeetCode;

import java.util.*;

public class LongestConsequitive {

        public static int longestConsecutive(int[] nums) {
            if(nums.length==0){
                return 0;
            }
            int checker=0;
            int length=0;
            Set<Integer> seen=new LinkedHashSet<>();
            ArrayList<Integer> consecutive=new ArrayList<Integer>();
            Arrays.sort(nums);
            for (int sorted:nums) {
                seen.add(sorted);
            }
            for (int i:seen) {
                if(i==checker+1 || length==0 ){
                    checker=i;
                    length++;
                    consecutive.add(length);
                }
                else{
                    checker=i;
                    length=1;
                }
            }
            Collections.sort(consecutive);
            return consecutive.get(consecutive.size()-1);
        }
public int sokfokf(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
        set.add(num);
    }
    int maxStreak = 0;
    for (int num : set) {
        int currentStreak = 1;
        if (set.contains(num + 1)) {
            currentStreak += 1;
        } else {
            while (set.contains(num - 1)) {
                currentStreak += 1;
                num -= 1;
            }
        }
        maxStreak = Math.max(currentStreak, maxStreak);
    }
    return maxStreak;
}

    public static void main(String[] args) {
        int[] test={9,1,4,7,3,-1,0,5,8,-1,6};
        System.out.println(longestConsecutive(test));

    }
    }

