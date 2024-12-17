package leetcode.leetcode_1210;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharsInString {
    public static void main(String[] args) {
        System.out.println("abcdefgh");
        //System.out.println("abcdefgghh");
       // System.out.printf("does string contains dupes: "+ duplicateCharsInString("abcdefgh"));
        System.out.printf("does string contains dupes**: "+ duplicateCharsInString("abcdefgghh"));



    }
    static boolean duplicateCharsInString(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            if(map.containsKey(c))
                map.put(c, map.get(c)+1);
            else
                map.put(c, 1);
        }
        System.out.println("map values are: "+ map);
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            System.out.println("key: "+ entry.getKey());
            System.out.println("value: "+ entry.getValue());
            if(entry.getValue()>1) {
                System.out.println("Stirng contains dupes: "+ entry.getKey()+"  "+ entry.getValue());
                return true;
            }
        }
        return false;
    }
}
