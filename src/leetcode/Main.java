package leetcode;

public class Main {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] num ={1,2,3,4,5,6};
        //System.out.println("two sum is : "+ Arrays.toString(twoSum.twoSum(num, 9)));
        LongestSubString_3 longestSubString3 = new LongestSubString_3();
        //String s = "abcabcbb";
        String s =  "abcabcbb";//"bbbbb";//"abcabbcabcbcbb";
       // String s =  "bbbbbbbb";

        System.out.println("long substr is: " +   longestSubString3.longSubString(s));
        IsPalindrome longestPalindrome5 = new IsPalindrome();
        //longestPalindrome5.isPalindrome1("isPalindrome: "+ longestPalindrome5.isPalindrome1("abcba"));
        PalindromeNumber_9 palindromeNumber9 = new PalindromeNumber_9();
        long i =1234321;
        System.out.println("is no palindrome: "+palindromeNumber9.isPalindrome(i));
    }

}
