package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaImpConversions {
    static List<Integer> numarrayToList(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
             list = Arrays.asList(nums[i]);
            //return list;
        }
        System.out.println("List is: " + list);
        return list;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,-1,0,5,3,6};
        numarrayToList(nums);
    }

}
