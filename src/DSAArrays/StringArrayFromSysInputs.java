package DSAArrays;

import java.util.Arrays;
import java.util.Scanner;

public class StringArrayFromSysInputs {
    public static void strArraySysInput(){
        Scanner in = new Scanner(System.in);
        String[] str = new String[3];
        for (int i=0;i<str.length;i++){
            str[i]= in.next();
        }
        System.out.println(Arrays.toString(str));
        str[2]= "TEST";
        System.out.println(Arrays.toString(str));
        /* o/p
            S
            S1
            S2
            [S, S1, S2]
            [S, S1, TEST]
         */

    }
}
