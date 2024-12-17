package StringStringBufferExamples;

public class StringPalindrome {
    static boolean isPalidrome(String s){
        String t = s.toLowerCase();
        int l =t.length()-1;
        int i=0;
        while(i<=l){
            if(t.charAt(i)==t.charAt(l)) {
                i++;
                l++;
                return true;
            }
            else return false;
        }
        return false;
    }
}
