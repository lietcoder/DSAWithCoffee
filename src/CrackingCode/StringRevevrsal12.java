package CrackingCode;

public class StringRevevrsal12 {
    static StringBuffer sb = new StringBuffer();
    static String reverseString(String s){
        for(int j=s.length()-1; j>=0; j--){
            sb.append(s.charAt(j));
        }
        System.out.println("original : "+ s);
        System.out.println("original : "+ sb);
        return sb.toString();
    }

    //without using a ds
    static String reverseStringNoSpace(StringBuffer s){
        int i=0;
        int j=s.length()-1;
        System.out.println("i and j are: "+ i+"   "+j);
        while(i<=j){
            System.out.println("in while block");
            char temp = s.charAt(i);
            s.setCharAt(i, s.charAt(j));
            s.setCharAt(j, temp);
            i++; j--;
            System.out.println("i and j are: "+ i+"   "+j);
        }
        return s.toString();
    }
}
