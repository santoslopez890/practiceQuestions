package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ProductExceptSelf {
    //o^2
//    public int[] productExceptSelf(int[] nums) {
//
//        int[] result =new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            int tempProduct=1;
//            for (int j = 0; j < nums.length; j++) {
//                if(i!=j) {
//                    tempProduct *= nums[j];
//                }
//            }
//            result[i]=tempProduct;
//        }
//        return result;
//    }

        public int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int[] res = new int[n];
            // Calculate lefts and store in res.
            int left = 1;
            for (int i = 0; i < n; i++) {
                if (i > 0)
                    left = left * nums[i - 1];
                res[i] = left;
            }
            // Calculate rights and the product from the end of the array.
            int right = 1;
            for (int i = n - 1; i >= 0; i--) {
                if (i < n - 1)
                    right = right * nums[i + 1];
                res[i] *= right;
            }
            return res;
        }


}
