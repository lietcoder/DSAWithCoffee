package DSALinearSearch;

import java.util.Arrays;

public class MinMaxElementInArray {

    static void minMaxIntInArray(){
        int[] in = {12, 18, 7, 3, 14, 11, 28, 545};
        System.out.println("input array: "+ Arrays.toString(in));
        int min=in[0];
        int max= in[0];
        for(int i=0;i<in.length-1;i++){
            if(in[i+1]<min) {
                min =in[i+1];
                System.out.println("min is**: "+min);
            }
            else if(in[i+1]>max) {
                max = in[i + 1];
                System.out.println("max is**: " + max);
            }

        }
        System.out.println("min is: "+ min);
        System.out.println("max is: "+ max);
    }
    /*
    o/p
            input array: [18, 12, 7, 3, 14, 28]
            min element in array: 3
            max is: 28
     */
}
