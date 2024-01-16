package LeetCode;

public class TwoSum2 {

        public int[] twoSum(int[] numbers, int target) {
            Boolean flag=false;
            int right=numbers.length-1;
            int left=0;
            while(!flag){
                if((numbers[left]+numbers[right])==target){
                    flag=true;
                    break;
                }
                else if ((numbers[left]+numbers[right])<target){
                    left++;
                }
                else if ((numbers[left]+numbers[right])>target){
                    right--;
                }

            }
            int[] arr={left+1,right+1};
            return arr;
        }

}
