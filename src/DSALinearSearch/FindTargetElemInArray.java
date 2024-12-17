package DSALinearSearch;

import java.util.Arrays;

public class FindTargetElemInArray {
    static boolean isTargetExists(){
        int[] in = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target=2888;
        if(in.length==0) return false;
        System.out.println(Arrays.toString(in) + "target: "+ target);
        for(int element: in){
            if(element==target)
                return true;
        }
        return false;
    }
    /*
    o/p
    [23, 45, 1, 2, 8, 19, -3, 16, -11, 28]target: 2888

     */
}
