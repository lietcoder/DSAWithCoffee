package DSAArrays;

import java.util.Arrays;
import java.util.Collections;

public class ArrayPaper {
    public static void main(String[] args) {
//        int[] i={545,1,32343,232,331,6,64,0,3221,323434343};
//        System.out.println("print i: "+ Arrays.toString(i));
//       // Arrays.sort(i);
//        System.out.println("sort and print i: "+ Arrays.toString(i));
//        System.out.println("min is: "+ i[0]);
//        System.out.println("max is: "+ i[1]);
//
//        System.out.println("max is: "+ i[i.length-1]);
//        if(i[0]>i[1]) {
//            System.out.println("Array i is not sorted");
//        }
        int[] j={1,2,3,4,7,5,6,8,9};
        System.out.println("Array j sorted: "+isArraySorted(j));
        int[] i={1,2,3,4,5,6,7,8,9, 10, 11, 12};
        System.out.println("Array i sorted: "+isArraySorted(i));
        System.out.println("binary search element exists: "+binarySearch(i, 10));

    }
    static boolean isArraySorted(int[] j){
        for(int a=0;a<j.length-1;a++){
            if(j[a]>j[a+1])
                return false;
        }
        return true;
    }
    static boolean binarySearch(int[] i, int j) {
        if (i.length <= 0)
            return false;
        int k = i.length / 2;
        if (j < i[k]) {
            System.out.println("Find it in first half ");
            for (int m = 0; m <= k; m++) {
                System.out.println("Searching in first half: "+m);
                if (i[m] == j)
                    return true;
            }
        } else {
            System.out.println("Find it in second half ");
            for (int m = k; m < i.length - 1; m++) {
                System.out.println("Searching in second half: "+m);
                if (i[m] == j)
                    return true;
            }
        }
        return false;
    }
}


