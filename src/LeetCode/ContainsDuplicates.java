package LeetCode;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicates {

        public boolean containsDuplicate(int[] nums) {
            if (Arrays.stream(nums).distinct().count()== nums.length){
                return true;
            }
            return false;
        }

    public boolean containsDuplicateHash(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num))
                return true;
            seen.add(num);
        }
        return false;
    }


}
