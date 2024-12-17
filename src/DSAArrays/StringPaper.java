package DSAArrays;

public class StringPaper {
    /*
    String s="abcdcba"
    int i=0; int j=s.lenth()-1
    while(i<=j)
    if(s.charAt[0]==s.charAt[j]
    i++; j--;
    else
    false;
    return ture;
     */
    public static void main(String[] args) {
        System.out.println("Is String palindrome: "+ isPalindrome("abcdcbaa"));

    }
    //revisit this why while is not working
//    static boolean isPalindrome(String s) {
//        int i = 0;
//        int j = s.length() - 1;
//        whlie(i < j) {
//            if (s.charAt(i) == s.charAt(j)) {
//                i++;
//                j--;
//            }
//            else {
//                return false;
//            }
//        };
//        return true;
//    }
    static boolean isPalindrome(String s){
        for(int i=0;i<s.length();i++){
            for(int j=s.length()-1; j<=0;j--){
                if (s.charAt(i)!=s.charAt(j))
                    return false;
            }
        }
        return true;
    }

}
