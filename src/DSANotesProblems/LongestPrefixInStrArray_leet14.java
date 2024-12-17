package DSANotesProblems;

import java.util.Arrays;

public class LongestPrefixInStrArray_leet14 {

    static String longestPrefix_leet14(String[] arr) {
        Arrays.sort(arr);
        String first= arr[0];
        StringBuffer sb = new StringBuffer();
        String last =arr[arr.length-1];
        for(int i=0;i<first.length(); i++){
            if(first.charAt(i)!=last.charAt(i))
                break;
            else{
                sb.append(first.charAt(i));
                System.out.println("sb is: " + sb);
            }
        }
       return sb.toString();
    }
    static String longestSuffix(String[] s){ //some cases are failing. Works only if all strings are of equal length
        Arrays.sort(s);
        String first= s[0];
        System.out.println("first: "+ first);
        StringBuffer sb = new StringBuffer();
        String last =s[s.length-1];
        System.out.println("last: "+ last);

        for(int i=last.length()-1;i>0;i--){
            System.out.println("checking last chars: "+ i+
                    "   "+"first: "+first+"   "+first.charAt(i) + " last: "+last+"   "+last.charAt(i));
            if(first.charAt(i)!=last.charAt(i))
                break;
            else {
                sb.append(first.charAt(i));
                System.out.println("sb is: " + sb);
            }
        }
        return sb.reverse().toString();
    }

    static String longestSuffix1(String[] s){ //this is wrong
        Arrays.sort(s);
        String first= s[0];
        System.out.println("first: "+ first);
        StringBuffer sb = new StringBuffer();
        String last =s[s.length-1];
        System.out.println("last: "+ last);

        for(int i=0;i<first.length();i++){
            System.out.println("checking last chars: "+ i+
                    "   "+"first: "+first+"   "+first.charAt(i) + " last: "+last+"   "+last.charAt(i));
            if(first.charAt(i)==last.charAt(i))
                break;
            else sb.append(first.charAt(i));
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
       String[] strArray ={"geeks","geeksforgeeks", "geekssser", "geeksforgeeksgeeks"};
        System.out.println("longest prefix is: "+longestPrefix_leet14(strArray));
//        System.out.println("longest suffix is: "+longestSuffix(strArray));

//        String[] strArray1 ={"deefg","abefg", "avdfg", "andfg"};
//        System.out.println("longest suffix1 is: "+longestSuffix(strArray1));
//        System.out.println("longest suffix1 is: "+longestSuffix1(strArray1));



    }
}
