package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i=0;i<nums.length-1;i++){
            int j = target-nums[i];
            if(hmap.containsKey(j))
                return new int[]{hmap.get(j),i};
            hmap.put(nums[i], i);
        }
        return null;
    }
//    public static int[] twoSum(int[] nums, int target){
//        HashMap<Integer, Integer> hmap = new HashMap<>();
//        for(int i=0;i<nums.length;i++){
//            int j= target-nums[i];
//            System.out.println("complement: "+j);
//            if(hmap.containsKey(j))
//                return new int[]{hmap.get(j), i};
//            hmap.put(nums[i], i);
//            System.out.println("hmap is: "+hmap);
//        }
//        return null;
//    }
//    public static int[] twoSum(int[] nums, int target) {
//        for(int i=0; i<nums.length-1; i++){
//            for(int j=i+1;j<nums.length; j++){
//                if (nums[i]+nums[j]==target)
//                    return new int[]{i,j};
//            }
//        }
//        return null;
//    }
////    static int[] twoSum(int[] num, int target){
////
////        HashMap<Integer, Integer> hmap = new HashMap<>();
////        for(int i=0; i<num.length; i++){
////            int j = target-num[i];
////            System.out.println("J is : "+ j);
////            if(hmap.containsKey(j)){
////                return new int[]{hmap.get(j), i};
////            }
////            hmap.put(i, num[i]);
////            System.out.println("hashmap is: "+ hmap);
////        }
////
////        return null;
////    }
////public static int[] twoSum(int[] nums, int target) {
////    Map<Integer, Integer> numMap = new HashMap<>();
////    for (int i = 0; i < nums.length; i++) {
////        int complement = target - nums[i];
////        System.out.println("Comp is: "+ complement);
////        if (numMap.containsKey(complement)) {
////            System.out.println("Contains key is true");
////            return new int[]{numMap.get(complement), i};
////        }
////        System.out.println("Contains key is not true add element to map");
////        numMap.put(nums[i], i);
////        System.out.println("numMap is: " + numMap);
////    }
////
////    return null;
////}
////
////    public static int[] twoSum1 ( int[] nums, int target){
////        Map<Integer, Integer> numMap = new HashMap<>();
////        for (int i = 0; i < nums.length; i++) {
////            int complement = target - nums[i];
////            System.out.println("complement is: "+ complement);
////            if (numMap.containsValue(complement)) {
////                return new int[]{i,numMap.get(complement)};
////            }
////            numMap.put(i, nums[i]);
////            System.out.println("numMap is: " + numMap);
////        }
////        return null;
////    }
}
