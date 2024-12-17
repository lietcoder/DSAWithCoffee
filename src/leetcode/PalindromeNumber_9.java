package leetcode;

public class PalindromeNumber_9 {
    static boolean isPalindrome(long in){
        String s= String.valueOf(in);
        System.out.println("Integer String is: "+ s);
        StringBuffer sb = new StringBuffer();
        int len =s.length()-1;
        System.out.println("length of s is: "+ len);
        for(int i=len;i>=0;i--){
            System.out.println("Entering loop: "+ i);
            sb.append(s.charAt(i));
        }
        String rev= sb.toString();
        System.out.println("reversed and orginal string are: "+ sb.toString()+ "    "+ s);
        if(s.equals(rev))
            return true;
        else
        return false;
    }
//    static boolean isNoPalindrome(int i){
//
//    }
}
