package DSALinearSearch;

import java.util.Arrays;

public class MaxWealth2DArray
{
    public int maxWealthIn2D(int[][] bankAcnt){
        for (int i = 0; i < bankAcnt.length; i++) {
            // Iterate over the columns
            for (int j = 0; j < bankAcnt[i].length; j++) {
                System.out.print(bankAcnt[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
        int ans = Integer.MIN_VALUE;
        for (int[] ints : bankAcnt) {
            System.out.println("Array is: "+ Arrays.toString(ints));
            // when you start a new row, take a new sum for that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            System.out.println("sum is : "+ sum);

            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans) {

                ans = sum;
                System.out.println("ans is: "+ ans);
            }
        }
        return ans;
    }
    /*
            2 3 4
            7 1 2
            1 4 4
            maxWealth2DArray : 10
     */
}
