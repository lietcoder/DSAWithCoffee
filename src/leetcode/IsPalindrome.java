package leetcode;

public class IsPalindrome {
    static boolean isPalindrome(String s){
        for(int i=0;i<s.length();i++){
            for(int j=s.length();j<=0;j--) {
                if (s.charAt(i) != s.charAt(j)) ;
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("isPalindrome: "+ isPalindrome("abcba"));

    }
}
