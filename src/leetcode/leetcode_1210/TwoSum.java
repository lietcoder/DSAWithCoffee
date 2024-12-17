package leetcode.leetcode_1210;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    //broot force
    static int[] twoSum(int[] nums, int target){
        for(int i=0;i<nums.length;i++){
            System.out.println("value at i: "+ nums[i]);
            for(int j=1;j<nums.length;j++){
                System.out.println("value at j: "+ nums[j]);
                if(nums[i]+nums[j]==target)
                    return new int[]{i,j};
            }
        }
        return null;
    }
    //twoSum hashtable
    static int[] twoSumHash(int[] nums, int target){
        HashMap<Integer,Integer> hmap= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int r = target-nums[i];
            if(hmap.containsKey(r))
                return new int[]{hmap.get(r), i};
            else
                hmap.put(nums[i], i);
        }
        return null;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,6,9,10,11} ;
        int target =8;
        //System.out.println("two sum array: "+ Arrays.toString(twoSum(nums,target)));
        System.out.println("two sum array: "+ Arrays.toString(twoSumHash(nums, target)));

    }
}
