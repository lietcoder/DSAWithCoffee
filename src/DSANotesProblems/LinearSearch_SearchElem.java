package DSANotesProblems;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearch_SearchElem {
    static boolean linearSearch(int[] a, int target){
//        if(a.length<1 || a==null)
//            return 0;
        for(int i=0;i<a.length;i++){
            //System.out.println("Value at a[i]: "+a[i]);
            if(a[i] ==target)
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a= {32,343,1,64,134, 55534,4343}; int target =354;
         int target1 =343;

        System.out.println("Target found  "+ linearSearch(a, target));
        System.out.println("Target found : "+ linearSearch(a, target1));
        System.out.println("noofDigits in: "+ noOfDigitsInNumber(3456));
        System.out.println("noofDigits in: "+ noOfDigitsInNumber(52454536));
        System.out.println("noof Even Digits in: "+ noOfEvenDigitsInArray(a));
        System.out.println("noof Even Digits in and array: "+ noOfEvenDigitsInArray1(a));
        System.out.println("noof Odd Digits in and array: "+ noofOddDigits(a));


    }
    static int noOfEvenDigitsInArray(int[] a){
        int noOfEven =0;
        for(int i =0;i<a.length;i++){
            System.out.println("Array element: "+a[i]);
            if(noOfDigitsInNumber(a[i])%2==0)
                noOfEven++;
        }
        return noOfEven;
    }

    static ArrayList<Integer> noOfEvenDigitsInArray1(int[] a){
        //int[] noOfEven = new int[];
        ArrayList<Integer> add =new ArrayList();
        for(int i =0;i<a.length;i++){
            System.out.println("Array element: "+a[i]);
            if(noOfDigitsInNumber(a[i])%2==0)
                add.add(a[i]);
        }
        return add;
    }

    static ArrayList<Integer> noofOddDigits(int[] a){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0;i<a.length;i++){
            if(noOfDigitsInNumber(a[i])%2!=0)
                list.add(a[i]);
        }
        return list;
    }
    static int noOfDigitsInNumber(int n){
        int count =0;

        while(n>0) {
            if (n / 10 >= 0)
                count++;
            n = n / 10;
        }
          return count;
        }

}
