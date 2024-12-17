package leetcode.leetCode1212;

import java.util.ArrayList;
public class ArrayPermutations_46 {
    public static ArrayList<ArrayList<Integer>> permute(int[] nums) {
        ArrayList<ArrayList<Integer>> resultList = new ArrayList<>();
        backtrack(resultList, new ArrayList<>(), nums);
        System.out.println("Array permutations are: "+ resultList);
        return resultList;
    }
    private static void backtrack(ArrayList<ArrayList<Integer>> resultList,
                                  ArrayList<Integer> tempList, int[] nums) {
        //System.out.println("Templist is: "+ tempList);
        if (tempList.size() == nums.length) {// If we match the length, it is a permutation
            resultList.add(new ArrayList<>(tempList));
            return;
        }
        for (int number : nums) {
            if (tempList.contains(number)) //// Skip if we get same element
                continue;
            tempList.add(number); // Add the new element
           // System.out.println("templist after : "+ tempList);
            backtrack(resultList, tempList, nums); // Go back to try other element
            tempList.remove(tempList.size() - 1); // Remove the element
           // System.out.println("templist after removal : "+ tempList);
        }
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        System.out.println("array permutations are: " +permute(nums));
    }
}
