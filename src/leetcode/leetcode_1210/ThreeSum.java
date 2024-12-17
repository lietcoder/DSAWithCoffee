package leetcode.leetcode_1210;

import java.util.Arrays;

public class ThreeSum {
    //broot force
    static int[] threeSum(int[] nums, int target){
        for(int i=0;i<nums.length;i++) {
           // System.out.println("value at i: " + nums[i]);
            for (int j = i+1; j < nums.length; j++) {
               // System.out.println("value at j: " + nums[j]);
                for (int k = j+1; k < nums.length; k++) {
                   // System.out.println("value at k: "+ nums[k]);
                    if (nums[i] + nums[j] + nums[k] == target)
                        return new int[]{i, j, k};
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,6,9,10,11} ;
        int target =17;
        System.out.println("three sum array: "+ Arrays.toString(threeSum(nums,target)));
    }
}
