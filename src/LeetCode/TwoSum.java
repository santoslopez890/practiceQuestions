package LeetCode;

import java.util.Arrays;

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

    public static void main(String[] args) {
        int[] nums= new int[]{2,5,5,11};

        System.out.println(Arrays.toString(twoSum(nums, 10)));
    }
}
