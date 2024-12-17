package leetcode.leetcode_1211;

public class ContainerWithMostWater_11 {
    static int maxAreaInArray(int[] nums){
        if(nums.length==0|| nums==null)
            return 0; int l = 0;
        int r=nums.length-1;// {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int maxArea =0;
        while(l<r){
            System.out.println("**l is less than r");
            int w = r-l;
            int area = Math.min(nums[l], nums[r])*w;
            System.out.println("** area is: "+ area);
            maxArea = Math.max(maxArea,area);
            System.out.println("** max area is: "+ maxArea);
            if(nums[l]<nums[r])
                l++;
            else r--;
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int left = 0;
        int right = height.length-1;
        int width =right-left;
        System.out.println("width is: "+ width);
        int area = Math.min(height[left], height[right])*width;
        System.out.println("area is: "+ area);
        System.out.println("math.min is: "+ Math.min(height[left], height[right]));
        System.out.println("math.max is: "+ Math.max(height[left], height[right]));

        System.out.println("***Max Area in the array : "+ maxAreaInArray(height));

    }
}
