package CrackingCode;

public class CharCountString15 {
    public static String charCountString(String str){
        ///aaabbccde   -- a3b2c2d1e1
        //abcddee -- a1b1c1d2e2
        if(str == null || str.length()==0)
            return null;
        char ch = str.charAt(0);
        int count =1;

        StringBuffer sb = new StringBuffer();
        sb.append(ch);
        for(int i=1; i<str.length(); i++){
           if(str.charAt(i)==ch) {
               count++;
           }
           else{
               sb.append(count);
               ch= str.charAt(i);
               sb.append(ch);
               count =1;
           }
        }
        sb.append((1));
        System.out.println("final ch count str is: "+ sb.toString());
        if(str.length()==sb.length()) {
            System.out.println("Strings are equal");
            return str;
        }
        else{
        System.out.println("Strings are NOT equal");
        return null;
        }
    }

    public static void main(String[] args) {
        //System.out.println("compressed string is: "+ charCountString("aaabbccde"));
        System.out.println("compressed string is: "+ compressString("aaabbduxuwm..}ccdeeefa"));
    }

    static String compressString(String s){
        if(s==null || s.length()==0)
            return null;
        if(s.length()==1)
            return s.concat("1");

        StringBuffer sb = new StringBuffer();
        int counter=1;
        char ch = s.charAt(0);
        for(int i=1;i <s.length();i++){
            if(ch == s.charAt(i))
                counter++;
            else{
                sb.append(ch);
                sb.append(counter);
                ch = s.charAt(i);
                counter=1;
                System.out.println("compressed str is: "+ sb.toString());
            }
        }
        sb.append(ch);
        sb.append(counter);
        return sb.toString();
    }
}
