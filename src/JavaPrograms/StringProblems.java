package JavaPrograms;

import java.util.Arrays;
import java.util.HashMap;

public class StringProblems {
    public static void main(String[] args) {
        //String st ="3rqedfadsfafafdfvds";
        String st ="abcd";
        HashMap<String, Integer> hashMap= new HashMap<>();
        System.out.println("Chars in string : "+ Arrays.toString(st.toCharArray()));
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(char c: st.toCharArray()){
            hmap.put(c, st.indexOf(c));
        }
        System.out.println("hmap is: "+ hmap);
        for(int i=0; i<st.length(); i++){
            for(int j=i; j<= st.length();j++){
                System.out.println("substrings are: "+ st.substring(i,j));
                hashMap.put(st.substring(i,j),(st.substring(i,j).length()) );
            }
        }
        System.out.println("hashmap is: "+ hashMap);
    }
}
