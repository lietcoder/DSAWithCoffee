package CrackingCode;

import java.util.ArrayList;

public class StringPermutation13 {
    public static boolean ispermutation(String s, String t){
        String st = s+t;
        System.out.println("Combined string is: "+st);
        if(st.contains(t))
        return true;
        else return false;
    }
    //Revistit this
    public ArrayList<String> printPermutations(String s){
        //abc -- a, ab, ac, b, bc,
        for(int i=0;i<s.length(); i++){

        }
        return null;
    }

    public static void main(String[] args) {
        printStringPermutation("abcd");
    }
    static void printStringPermutation(String s){
        ArrayList<String> list = new ArrayList<>();
        int counter=0;
        System.out.println("Substring** : "+ s.substring(0, 0));
        for(int i=0; i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                counter++;
                System.out.println("i and j are: "+ i + "   "+j+ " counter: "+ counter);
                //System.out.println("SubString is: "+ s.substring(i,j));
                System.out.println("SubString is**: "+ s.substring(i));

            }
        }
    }
}
