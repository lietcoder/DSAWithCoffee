package CrackingCode;

import java.util.Arrays;

public class StringUniqueChars {
    public static boolean isUnique(String s) {
        if(s.length()==0 || s.length()==1)
            return false;
        boolean[] uniqueChars = new boolean[256];
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            int val = s.charAt(i);
            if(uniqueChars[val]==true) {
                System.out.println("str contains duplicates: "+ ch);
                return false;
            }
            else {
                uniqueChars[val] = true;
                System.out.println("uniquechars is: " + Arrays.toString(uniqueChars));
            }
        }
        System.out.println("uniquechars is: "+ Arrays.toString(uniqueChars));
        return true;
    }
}
