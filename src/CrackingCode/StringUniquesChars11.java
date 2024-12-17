package CrackingCode;

import java.util.Arrays;
import java.util.HashSet;

public class StringUniquesChars11 {

    static boolean isUniqueChars(String s){ //This uses an additional space or ds
        HashSet set = new HashSet();
        if(s.length()==1 || s==null)
            return false;
        for(char c: s.toCharArray()){
            set.add(c);
        }
        if(s.length()!= set.size()) {
            System.out.println("String has duplicates");
            return false;
        }
        return true;
    }

    static boolean isUniqueChars1(String s){
        if(s.length()>255 || s.length()==0 || s==null)
            return false;
        boolean[] charSet = new boolean[256];
        for(int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            int val =s.charAt(i);
            System.out.printf("i, c and  val are:  "+ i+"   "+c+"   "+val);
            System.out.println();
           // System.out.println("char and val are : "+ c+"   "+ val);
            if(charSet[val]) {
                System.out.println("Bool array charset: " + Arrays.toString(charSet));
                return false;
            }
            else charSet[val]=true;
        }
        System.out.println("Bool array charset: "+ Arrays.toString(charSet));
        return true;
    }
}


