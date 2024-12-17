package StringStringBufferExamples;

public class Main {
    public static void main(String[] args) {
        StringIntro stringIntro= new StringIntro();
       stringIntro.compareStrings();
        StringPalindrome stringPalindrome=new StringPalindrome();
        System.out.println("is palindrome: "+stringPalindrome.isPalidrome("abcbdefggfedbcba"));
    }
}
