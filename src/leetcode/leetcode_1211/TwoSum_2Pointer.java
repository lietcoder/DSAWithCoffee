package leetcode.leetcode_1211;

import java.util.Arrays;

public class TwoSum_2Pointer {
    static int[] twoSumtwoPointer(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int[] twoSum = new int[2];
        System.out.println("Array before sort: "+ Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("Array before sort: "+ Arrays.toString(nums));
        while(left<=right){
            System.out.println("left and right are: "+ left+"   "+ right);
            //System.out.println("left is less than right");
            int sum=nums[left]+nums[right];
            if(sum==target) {
                twoSum = new int[]{nums[left], nums[right]};
            }
            else if(sum<target)
                right--;
            else if(sum>target)
                left++;
        }
        System.out.println("Two sum array is: "+ Arrays.toString(twoSum));
        return twoSum;
    }

    public static void main(String[] args) {
        int[] nums = {10,1,2,6,9,10,11} ;
        int target =8;
        twoSumtwoPointer(nums, target);
    }
}
