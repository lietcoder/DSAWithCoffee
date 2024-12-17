package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Queue;

public class TwoSum_1 {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        twoSum(nums, target);
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        System.out.println("map is: " + map);
        for (int i = 0; i < nums.length; i++) {
            int r=target-nums[i];
            if(map.containsKey(r)){
                System.out.println(map.get(r));
                System.out.println("two sum indexes are: "+ Arrays.toString(new int[]{i, map.get(r)}));
                //return new int[]{map.get(r),i};

                result[0] = i;
                result[1] = map.get(r);
                return result;

            }
        }
        //Queue
        return null;
    }
}
