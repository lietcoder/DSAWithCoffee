package DSANotesProblems;

import java.util.ArrayList;
import java.util.Vector;

public class FindSubstringsOfString {
    static Vector findSubString(String s){
        Vector<String> str= new Vector<>();
        int counter=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                counter++;
                //System.out.println("i and j , counter are: "+ i+"  "+j+ "  "+counter);
                //System.out.println("substring to be added is: "+ s.substring(i,j));
                str.add(s.substring(i,j));
            }
        }
        System.out.println("counter is: "+ counter);
        System.out.println("Substrings are: "+ str);
        return str;
    }
    static String findSubStringsRecursion(String s, int index, String subStr) {
        Vector<String> str = new Vector<>();
        String sub = null;
        int counter = 0;
        for (int i = 0; i < s.length(); i++){
            System.out.println("Substring is: "+ findSubStringsRecursion(s, i + 1, subStr));
            return findSubStringsRecursion(s, i + 1, subStr) ;
    }
        return null;
    }

    public static void printSubstrings(String str, int index, String currentSubstring) {
        // Base case: if the index reaches the length of the string, stop recursion
        if (index == str.length()) {
            return;
        }

        // Print the current substring
        System.out.println("currentSubstring: "+currentSubstring);

        // Start a loop to explore substrings starting at the current index
        for (int i = index; i < str.length(); i++) {
            // Include the character at index i and call the recursive function for the next character
            printSubstrings(str, i + 1, currentSubstring + str.charAt(i));
        }
    }



    public static void main(String[] args) {
        //findSubString("abcdefg");
        String s="abc";
        //findSubStringsRecursion(s,0, "");
        printSubstrings(s, 0, "");


    }
}
