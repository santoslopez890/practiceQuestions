package LeetCode;

import java.util.Arrays;

public class ContainsDuplicates {

        public boolean containsDuplicate(int[] nums) {
            if (Arrays.stream(nums).distinct().count()== nums.length){
                return true;
            }
            return false;
        }


}
