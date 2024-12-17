package leetcode.leetcode_1211;

public class MaxArea_11 {
    public static int maxArea(int[] height) { //[6, 2, 5, 4, 8]
        int l=0;
        int r=height.length-1;
        int max = 0;
        while(l<r){
            int w = r-l;
            int area = (Math.min(height[l], height[r]))*w;
            max = Math.max(max, area); //16, 12, 10
            if(height[l]<height[r])
                l++;
            else
                r--;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{6, 2, 5, 4, 8};
        System.out.println("Max area in nums is: "+ maxArea(nums));
    }
}
