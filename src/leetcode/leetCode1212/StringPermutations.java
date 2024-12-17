package leetcode.leetCode1212;

public class StringPermutations {
    static void printPermuatations(String str, String prefix){
        if(str.length()==0 || str.isEmpty()) {
            System.out.println("prefix is: "+ prefix);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curChar= str.charAt(i);
           // System.out.println("i is: "+i);
            System.out.println("curChar: "+ curChar);
            String rem = str.substring(0,i)+str.substring(i+1);
            System.out.println("rem : "+ rem);

            printPermuatations(rem, prefix+curChar);
        }
    }

    public static void main(String[] args) {
        System.out.println("Permutations of ABC are");
        printPermuatations("ABC", "");
    }
}
