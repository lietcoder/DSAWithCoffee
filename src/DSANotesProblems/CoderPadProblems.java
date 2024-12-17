package DSANotesProblems;
import java.util.*;


public class CoderPadProblems {


        public static void main(String[] args) {


            // System.out.println("Reversed String "+ reverseString("ggadgsdfadfasdf"));
            // System.out.println("is string palindrome: "+ isPalindrome("abcdefgfedcba"));
            /*int num= 535353;
            if(isPrime(num))
            System.out.println(" no is Prime: "+ num + "   "+isPrime(num));
            else
            System.out.println();
            System.out.println("No is not PRIME: "+ num+ "   "+isPrime(num));
            */
            // String str= "i.like.this...program...very.much";
            // //System.out.println("reversed str is: "+  reverseWordsInString(str));
            // System.out.println("reversed str is: "+  reverseWordsInStringRemoveTrailEnds(str));
            // System.out.println(strTOHashTable("god"));
            // System.out.println("is strings anagram: "+ isAnagramStrings("dfdsfsd", "fasdf"));
            //     System.out.println("is strings anagram: "+ isAnagramStrings("feafdsfsd", "feafdsfsd"));

            String[] strArray2 = {"geeks", "geeksforgeeks”, “gapeek”, “geezer"};
            String[] strArray ={"geeks","geeksforgeeks", "geezer", "geeeksforgeeksgeeks"};
            //String[] strArray3 = {"ba, ab, dc, cb"};


            //System.out.println("sortStrings are: "+ sortStrings(strArray2));
            //System.out.println("sortStrings are: "+ sortStrings(strArray3));
            //System.out.println("common prefix: "+ longestPrefix_leet14(strArray));
            System.out.println("count is: "+ maxOccurenceofCharInString("seeeefffcccadfd"));
            duplicateCharsInString("geeksforgeeks");
            System.out.println();
            duplicateCharsInString("seeeefffcccadfd");
            System.out.println("stringRotation: "+ stringRotation("XYZ", "ZYX"));
            System.out.println("stringRotation: "+ stringRotation("XYZ", "YZX"));


        }

        static int maxOccurenceofCharInString(String s){
            HashMap<Character, Integer> map = new HashMap<>(); //ddgggee
            for(char c: s.toCharArray()){
                if(map.containsKey(c))
                    map.put(c, map.get(c)+1);
                else map.put(c,1);
            }
            System.out.println("map is: "+ map);
            System.out.println("char with max occurences: "+Collections.max(map.values()));
            //for(Map.entry<Character, Integer> entry : map.entrySet()){
            int max = Integer.MIN_VALUE;
            char maxChar='a';
            int maxValue=0;
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if(entry.getValue()>max){
                    if(entry.getValue()>max){
                        maxChar = entry.getKey();
                        maxValue = entry.getValue();
                    }
                    System.out.println("Max Key is: "+ maxChar+ " Max Value is: "+ maxValue);

                }
                return Collections.max(map.values());
            }
            return Collections.max(map.values());
        }

        static boolean stringRotation(String s, String t){
            String st=s+s; //xyz+zyx - xyzxyz
            //if(st.contains(t))
            String si = "+123";
            System.out.println("Convert string to int: "+ Integer.parseInt(si));
            System.out.println("concat: "+st);
            String st1=s.concat(s); //xyz+zyx - xyzzyx
            //if(st.contains(t))
            System.out.println("concat: "+st1);
            System.out.println("st.indexOf(t): "+ st.indexOf(t));
            if(st.indexOf(t)!=-1)
                return true;
            else
                return false;
        }



        static void duplicateCharsInString(String s){
            HashMap<Character, Integer> map = new HashMap<>(); //ddgggee
            for(char c: s.toCharArray()){
                if(map.containsKey(c))
                    map.put(c, map.get(c)+1);
                else map.put(c,1);
            }

            for(Map.Entry<Character,Integer> entry : map.entrySet()){
                if(entry.getValue()>1)
                    System.out.println("Duplicate chars are: "+entry.getKey() + "   "+ entry.getValue());

            }

        }

        static String longestPrefix_leet14(String[] arr){
            if(arr.length==0)
                return " ";
            for(String s: arr)
                System.out.println("String : "+ s);
            // Arrays.sort(arr);
            // for(String s: arr)
            // System.out.println("String sort: "+ s);
            String prefix = arr[0];
            for(int i=1;i<arr.length;i++)
            {
                System.out.println("index of: "+arr[i].indexOf(prefix));
                while(arr[i].indexOf(prefix)!=0){
                    System.out.println("Entering while");
                    System.out.println(arr[i].indexOf(prefix)!=0);
                    prefix.substring(0, prefix.length()-1);
                }
                return prefix;

            }
            return null;
        }
        static ArrayList<String> sortStrings(String[] str){
            System.out.println("str array: "+ str);
            for(String s: str)
                System.out.println("String is: "+s);
            Arrays.sort(str);
            for(String s1: str)
                System.out.println("String s1 is: "+s1); //Why String sroting is not sorting the strings
            int[] arr ={5,4,2,3,654,1};
            for(int i: arr)
                System.out.println("i is: "+ i);
            Arrays.sort(arr);
            for(int i: arr)
                System.out.println("i is: "+ i);
            return null;

        }/*
  static boolean isAnagramStrings(String s, String t){
    System.out.println("s to map: "+ strTOHashTable(s));
      System.out.println("t to map: "+ strTOHashTable(t));
      System.out.println("==: "+ (strTOHashTable(s)==strTOHashTable(t)));
      System.out.println("==: "+ strTOHashTable(s).equals(strTOHashTable(t)));

    if(strTOHashTable(s).equals(strTOHashTable(t))){
      System.out.println("s to map: "+ strTOHashTable(s));
      System.out.println("t to map: "+ strTOHashTable(t));

    return true;
    }
    return false;
  }
  */
        /*convert str to hashtable
        static HashMap strTOHashTable(String str){
          HashMap<Character, Integer> map = new HashMap<>();
          for(char c: str.toCharArray()){
            int count=0;
            //System.out.println("Char is: "+c);
            //map.put(c, count++);
            if(map.get(c)!=null)
            map.put(c,map.get(c)+1);
            else
            map.put(c, 1);
            //System.out.println("map: "+map);


          }

        return map;
        }
        */
        static String reverseWordsInStringRemoveTrailEnds(String str){
            if(str==null || str.length()<=1){
                return null;
            }
            StringBuffer sb = new StringBuffer();
            String[] strSplit = str.split("\\.");
            ArrayList<String> list = new ArrayList<>();
            System.out.println("split length: "+strSplit.length);
            for(String s: strSplit){
                if(!s.isEmpty())
                    list.add(s);
            }
            System.out.println("list of words are: "+ String.join(".", list));
            Collections.reverse(list);
            System.out.println("Reverse list of words are: "+ String.join(".", list));
            return String.join(".", list);
        }

        static String reverseWordsInString(String str){
            if(str==null || str.length()<=1){
                return null;
            }
            StringBuffer sb = new StringBuffer();
            String[] strSplit = str.split("\\.");
            System.out.println("split length: "+strSplit.length);
            //for(String s: strSplit){
            for(int i=strSplit.length-1;i>0;i--){
                System.out.println("last string is: "+ strSplit[i]);
                sb.append(strSplit[i]+".");
            }
            sb.append(strSplit[0]);
            System.out.println("sb string is: ");
            return sb.toString();
        }

  /* String reversal
  static String reverseString(String str){

      StringBuffer sb = new StringBuffer();
      for(int j=str.length()-1;j>=0;j--)
      sb.append(str.charAt(j));
      System.out.println("original string: "+ str);
      System.out.println("reverse String: "+ sb.toString());
      return sb.toString();

  }
  */
  /*String Palindrome
  static boolean isPalindrome(String str){
  int start=0;
  int middle = str.length()/2;
  int end =str.length()-1;
  while(start<=middle){
  if(str.charAt(start)!= str.charAt(end))
  return false;
  start++;
  end--;

  }
  return true;
  }
  */
  /*Is no Prime
  public static boolean isPrime(int num) {
        // Base case: numbers less than or equal to 1 are not prime
        if (num <= 1) {
            return false;
        }
        // Check divisors from 2 to sqrt(num)
        for (int i = 2; i <= Math.sqrt(num); i++) {
          System.out.println("i num and sqrt are: "+i + "   "+num+"  "+Math.sqrt(num));
            if (num % i == 0) {
              System.out.println("num % i: "+ num % i + "   "+i);
                return false; // Found a divisor, so it's not prime
            }
        }
        return true; // No divisors found, so it's prime
    }
    */
  /*
  static boolean isPrime(int num){
      if(num<=1)
      return false;
      int j=0;
      for(j=2; j<=Math.sqrt(num); j++);
      {
        System.out.println("sqrt value of i: "+ Math.sqrt(num));
        if(num%j==0)
        return false;
      }
      return true;
    }
    */
    /*
    Find if number is Prime.. not so optimistic as it is considering 2 and 3 as prime
    System.out.println("Check if no is prime or not");
    int i=3;
    if(i==0 || i==1 ){
    System.out.println("no is a compositie number");
    }
    else if(i%2==0||i%3==0||i%5==0){
    System.out.println("Condition 2");
    System.out.println("No is not Prime");
    }
    else
    System.out.println("No is PRIME: "+ i);
   */





    /* Is no Armstrong
    int i=3711;
    int j =i;
    int arm=0;
    while(i>0){
      int c =i%10;
      System.out.println("c is: "+c );
      arm=(c*c*c)+arm;
      System.out.println("arm: "+arm);
      i=i/10;
      System.out.println("i is: "+i);
    }
    System.out.println("final arm: "+arm);
    if(j==arm)
    System.out.println("no is armstrong");
    else
    System.out.println("not armstrong");
    */


    }

