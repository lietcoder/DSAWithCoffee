package DSANotesProblems;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharInString {
    static void firstNonRepeatingChar(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            System.out.println("char is : "+c);
            if(map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            }
            else {
                map.put(c, 1);
                System.out.println("else map: "+ map);
            }
        }
        System.out.println("Map is: "+ map);
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if(entry.getValue()==1)
                System.out.println("First non repeated char is: "+ entry.getKey());
        }
    }
//    static Character firstNonRepeatingChar(String s){
//        for(int i=0; i<s.length(); i++){
//            if(s.charAt(i)!=s.charAt(i+1))
//                System.out.println(Char at i and i+1"");
//            continue;
//            else
//                s.charAt(i);
//        }
//    }

    public static void main(String[] args) {
        firstNonRepeatingChar("abccccdceeef");
        firstNonRepeatingChar("swiss");
    }
}
