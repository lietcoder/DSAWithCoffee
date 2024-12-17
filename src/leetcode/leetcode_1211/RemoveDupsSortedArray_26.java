package leetcode.leetcode_1211;

import java.util.Arrays;

public class RemoveDupsSortedArray_26 {

    static int removeDups(int[] numArray) {
        int counter = 0;
        System.out.println("nums lenght: " + numArray.length);
        Arrays.sort(numArray);
        if (numArray.length == 0 || numArray == null)
            return 0;
        for (int i = 0; i < numArray.length - 1; i++) {
            if (numArray[i] == numArray[i + 1]) {
                System.out.println("Dup element is: " + numArray[i] + "   " + numArray[i + 1]);
                counter++;
            }
        }
        return counter;
    }

    static int removeDupsInplace(int[] nums) {//{0,0,1,2,2,3,4,5,5,5,6};
        if (nums.length == 0 || nums == null)//{0, 1, 1,2, 2, 5,}
            return 0;
        int nextIndex = 1;
        System.out.println("nums lenght: " + nums.length);
        Arrays.sort(nums);
        System.out.println("sorted array : " + Arrays.toString(nums));
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                System.out.println("nextindex and i are: "+ nextIndex+"   "+i);
                nums[nextIndex] = nums[i];
                System.out.println("Array at this point is: "+ Arrays.toString(nums));
                nextIndex++;
                System.out.println("nextIndex: " + nextIndex);
            }
        }
        return nextIndex;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 1,2, 2, 5,};
        int remove = removeDupsInplace(nums);
        for (int i = 0; i < remove; i++) {
            System.out.print(nums[i] + " ");

        }
    }
}
