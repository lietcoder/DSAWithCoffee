package leetcode.leetcode_1211;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_2Pointers
{
    //yet to complete
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Step 1: Sort the array
        for (int i = 0; i < nums.length - 2; i++) { //// Skip duplicates for the first number
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1; // Initialize the left pointer
            int right = nums.length - 1; // Initialize the right pointer
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    // Add the triplet to the result
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // Move pointers and skip duplicates
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // Increase the sum
                } else {
                    right--; // Decrease the sum
                }
            }
        }
        return result;
    }
}
