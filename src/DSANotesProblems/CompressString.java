package DSANotesProblems;

import java.util.HashMap;
import java.util.Map;

public class CompressString {

    static String strCompression(String s){
        //String s = "aaabbbbbbccd" //a3b5c2d1
        if(s.length()==1||s==null)
            return s;
        StringBuffer sb= new StringBuffer();
        int counter=1;
        char temp;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                System.out.println("in if ");
                sb.append(s.charAt(i));
                sb.append(counter);
            }
            else{
                System.out.println("in if ");
                counter++;
                sb.append(s.charAt(i+1));
                sb.append(counter);
            }
            counter=1;
            System.out.println("counter: "+ counter);

            System.out.println("original str: "+ s);
            System.out.println("Sb is: "+ sb);
        }
        return sb.toString();
    }

    static void strCompressionMap(String s){
        Map<Character, Integer> map= new HashMap<>();
        StringBuffer sb= new StringBuffer();
        for(Character c: s.toCharArray()){
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else map.put(c,1);
        }
        System.out.println("map is: "+map);
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            sb.append(entry.getKey());
            sb.append(entry.getValue());
        }
        System.out.println("compressed string is: "+map);
    }
    static int compress(char[] chars) {
            String s="";
            int cnt=1,n=chars.length,j=0;
            if(n==1)
                return 1;
            for(int i=0;i<n-1;i++)
            {
                j++;
                if(chars[i]==chars[i+1])
                    cnt++;
                else
                {
                    s+=chars[i]+"";
                    StringBuilder ans= new StringBuilder();
                    if(cnt>1)
                    {
                        while(cnt!=0)
                        {
                            ans.append(cnt%10+"");
                            cnt=cnt/10;
                        }
                    }
                    ans.reverse();
                    s+=ans.toString();
                    cnt=1;
                }
            }
            s+=chars[j]+"";
            StringBuilder ans= new StringBuilder();
            if(cnt>1)
            {
                while(cnt!=0)
                {
                    ans.append(cnt%10+"");
                    cnt=cnt/10;
                }
            }
            ans.reverse();
            s+=ans.toString();
            for(int i=0;i<s.length();i++)
                chars[i]=s.charAt(i);
            return s.length();
        }

    public static void main(String[] args) {
        //System.out.println("str compresion : "+ strCompression("aabbcccc"));
        //System.out.println("str compresion : "+ strCompression("aabbcde"));
        //strCompressionMap("aaaabbbbdd");


        System.out.printf("compress string: "+ compress("dfaertrqewfdvfasdfasdf".toCharArray()));
    }


}
