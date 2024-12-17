package leetcode;

import java.util.HashSet;

public class LongestSubString_3 {
    //abccded
    static long longSubString(String s) {
        HashSet set = new HashSet<>();
        int start = 0, end = 0;
        int max = 0;
        while (end < s.length()) {
            if (set.contains(s.charAt(end))) {
                set.remove(s.charAt(start));
                start++;
            } else {
                set.add(s.charAt(end));
                max = Math.max(max, end - start + 1);
                end++;
            }
        }
        System.out.println("set is: "+ set);
        return max;
    }

    public static void main(String[] args) {
        System.out.println("longest substring: "+ longSubString("abcd"));
    }
}
