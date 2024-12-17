package DSALinearSearch;

public class SearchCharInString {
    static boolean searchInString(String s, char c){
        if(s.length()<=0)
            return false;
        if(s == null)
            return false;
        int count=0;
        System.out.println("String length: "+ s.length());
        for(int i=0; i<s.length();i++){
            char c1=s.charAt(i);
            if(c1==c) {
               // System.out.println("c1 and c are: "+ c1+"  "+c);
                count++;
            }
        }
        System.out.println("No of occurences of c:" + count);

        if(count>1)
            return true;
        return false;
    }
}
