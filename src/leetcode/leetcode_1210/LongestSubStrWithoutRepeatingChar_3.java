package leetcode.leetcode_1210;

import java.util.HashSet;

public class LongestSubStrWithoutRepeatingChar_3 {

    public static void main(String[] args) {
        System.out.println("long substr hash :"+ longestSubStrLenHash("abcddefghijkk"));
    }

    static int longestSubStrLenHash(String s){
        HashSet<Character> set = new HashSet<>();
        int l=0;
        int maxLenght = 0;
        for (int r=0; r<s.length();r++){
            char curChar = s.charAt(r);
            while(set.contains(curChar)) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(curChar);
            maxLenght = Math.max(maxLenght, (r-l)+1);
        }
        return maxLenght;
    }
}
