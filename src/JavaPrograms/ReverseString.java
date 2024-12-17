package JavaPrograms;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String st2= "abcdcbaa";
       // System.out.println(" str2 is: "+isPalindrome(st2));
        String st1= "abcbaa";
        //System.out.println(" str1 is: "+isPalindrome(st1));
        //isPalindromeMidPoint(st2);
        //System.out.println("is string palindrome: "+isPalindromeMidPoint(st1));
        System.out.println("is string palindrome: "+isPalindromeMidPoint1(st1));

    }
    static boolean isPalindromeMidPoint1(String st){
        System.out.println("length: "+ st.length()); //abcdcba
        System.out.println("original str is: "+ st);
        int start=0;
        int end= st.length()-1;
        int mid =0;
        System.out.println("mid index is: "+ mid);
        while(start<=end){
            System.out.println("start and end are1111: "+ start + "  "+end);
            System.out.println("i and j are1111: "+ st.charAt(start) + "  "+st.charAt(end));
            if(st.charAt(start)!=st.charAt(end)) {
                return false;
            }
            start++;
            end --;
            System.out.println("start and end are: "+ start + "  "+end);
            System.out.println("i and j are: "+ st.charAt(start) + "  "+st.charAt(end));
            return true;

        }
        return false;
    }
    static boolean isPalindromeMidPoint(String st){
        System.out.println("length: "+ st.length()); //abcdcba
        System.out.println("original str is: "+ st);
        //int mid = st.length()/2;
        int start=0;
        int end= st.length()-1;
        int mid =0;
        System.out.println("mid index is: "+ mid);
        for(int i=start; i<=mid; i++ ){
            for(int j=mid; j>=mid; j--){
                mid =mid+(end-start-1)/2;
                System.out.println("mid is: "+ mid);
                System.out.println("i and j are: "+ i + "  "+j);
                System.out.println("i and j are: "+ st.charAt(i) + "  "+st.charAt(j));
                if (st.charAt(i)!=st.charAt(j)) {
                    System.out.println("not palindrome");
                    return false;
                }
            }
        }
        return true;
    }
    static void stringRevers(String str){
        System.out.println("length: "+ str.length());
        StringBuffer sb = new StringBuffer();
        for(int i=str.length()-1;i>=0;i--){
            System.out.println("index is: "+ i + "   "+ str.charAt(i));
            sb.append(str.charAt(i));
            System.out.println("sb is : "+ sb.toString());
        }
        System.out.println("reversed st is : "+ sb.toString());
    }
    static boolean isPalindrome(String str){
        System.out.println("length: "+ str.length());
        System.out.println("original str is: "+ str);
        StringBuffer sb = new StringBuffer();
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        String rev= sb.toString();
        System.out.println("reversed st is : "+ rev);
        System.out.println("2 "+ str.equals(rev));
        if(str.equals(rev)) {
            System.out.println("str is palindrome");
            return true;
        }
        else
            System.out.println("String is not palndrome");
            return false;
    }

}
