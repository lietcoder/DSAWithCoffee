package DSANotesProblems;

import java.util.Scanner;

public class IsArmstrongNumber {
    static boolean isArmstrong(){
        Scanner scan = new Scanner(System.in);
        int arms = scan.nextInt();
        int arms1 = arms;
        int temp=0;
        int result =0;
        int quo = arms/10;
        int rem = arms%10;
        while(arms>0){
           temp = arms/10;
            System.out.println("Rem: "+ arms/10+ " quo : "+ arms%10+ " arms: "+arms) ;
           result = (arms%10)*(arms%10)*(arms%10)+result;
            System.out.println(" Result is: "+ result   );
            arms =temp;
            System.out.println("arms after temp is: "+ arms);

        }
        if(result==arms1)
        return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println("isArmstrong() " + isArmstrong());
    }
}
