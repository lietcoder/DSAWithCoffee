package DSALinearSearch;

import java.util.Arrays;

public class FindEvenOddDigitsInArray {
    public static void findEvenOddNosAndPrint(){
        int[] nums ={12,345,2,6,7896};
        System.out.println("nums arrays is: "+ Arrays.toString(nums));
        int[] oddInts ;
        int evenCount=0;
        int oddCount=0;
        for(int num: nums){
            if(isNoEvenOdd(num)) evenCount++;
            else oddCount++;
        }
        System.out.println("even count: "+ evenCount);
        System.out.println("odd count: "+ oddCount);

    }
    static boolean isNoEvenOdd(int i){
        int count=0;
        while(i>0){
             i=i/10;
            System.out.println("i is: "+ i);
            count++;
            System.out.println("count is: "+count);
            }
        if(count%2==0) return true;
        else return false;
    }
    static int isNoEvenUsingMathLog(int i){
        if(i<0) i=i*-1;
        return (int)(Math.log10(i))+1;
    }
    /*
    o/p
            even or odd:isNoEvenOdd(555) false
            even or odd:isNoEvenOdd(5555) true
            nums arrays is: [12, 345, 2, 6, 7896]
            even count: 2
            odd count: 3
            isNoEvenUsingMathLog: 7
     */


}
