package DSANotesProblems;

import java.util.ArrayList;

public class PalindromeString {
    static boolean isPalindrome(String s){
        if(s==null || s.length()==1)
            return false;
        s.toLowerCase();
        for(int i=0;i<s.length()/2;i++){
            char start=s.charAt(i);
            int end=s.charAt(s.length()-1-i);
            System.out.println("start, end and i are: "+ start+ "   "+ end+"   "+i);
            if(start!=end) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("is string palindrome: "+ isPalindrome("abcdcba"));
        System.out.println("is string palindrome: "+ isPalindrome("fadfdsafsf"));
        float a= 535.5353F;
        System.out.println("Formatted number is:  %2f"+a);
        System.out.println("kunal"+ new ArrayList<>());
    }
}
