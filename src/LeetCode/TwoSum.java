package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] twosum=new int[2];
        boolean flag=false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
            if((nums[i]+nums[j])==target && !flag){
                twosum[0]=j;
                twosum[1]=i;
                flag=true;
            }
            }
        }
        return twosum;
    }
    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (prevMap.containsKey(diff)) {
                return new int[] { prevMap.get(diff), i };
            }

            prevMap.put(num, i);
        }

        return new int[] {};
    }




    public static void main(String[] args) {
        int[] nums= new int[]{2,5,5,11};

        System.out.println(Arrays.toString(twoSum(nums, 10)));
    }
}
