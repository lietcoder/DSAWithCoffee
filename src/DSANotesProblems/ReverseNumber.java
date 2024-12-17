package DSANotesProblems;

public class ReverseNumber {
    static int reverseNum(int n){//536
        int rev=0;
        int rem=0;
        if(n<=9)
            return n;
        while(n>0){
           // System.out.println("no is greater than 9");
            rem=n%10;
            rev =(rev*10)+rem;
            System.out.println("rev: "+rev);
            n=n/10;
            System.out.println("rev and n are:: "+rev+"  "+n);
        }
        return rev;
    }

    public static void main(String[] args) {
        //System.out.println("reverse no: "+ reverseNum(9));
        System.out.println("reverse no: "+ reverseNum(536));//635

    }

}
