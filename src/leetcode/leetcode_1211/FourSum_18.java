package leetcode.leetcode_1211;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum_18 {
    static List<ArrayList<Integer>> fourSum(int[] nums, int target){
        List<List<Integer>> fourSum = new ArrayList<>();
        for(int i=0;i<nums.length-3; i++){
            for(int j=i+1; j<nums.length-2;j++){
                for(int k=j+1; k<nums.length-1;k++){
                    for(int m=k+1; m<nums.length;m++){
                     if(target==nums[i]+nums[j]+nums[k]+nums[m]){
                         List<Integer> four =  Arrays.asList(nums[i],nums[j],nums[k],nums[m]);
                         four.sort(Integer::compareTo);
                         if(!fourSum.contains(four))
                             fourSum.add((ArrayList<Integer>) four);
                     }

                    }
                }
            }
        }
        System.out.println("Foursum are: "+ fourSum);
        return null;
    }
    public static void main(String[] args) {
        int[] nums =new int[] {1,0,-1,0,-2,2};
        int target = 0;
        fourSum(nums, target);
    }

}
