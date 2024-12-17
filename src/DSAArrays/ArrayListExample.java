package DSAArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void printArray(){
        Scanner in = new Scanner(System.in);
        ArrayList<String> listStr = new ArrayList();
        listStr.add(in.next());
        listStr.add(in.next());
        listStr.add(in.next());

        System.out.println("listStr: "+ listStr);
        listStr.add("Bhanu");
        listStr.set(0,"test");
        System.out.println("listStr:: "+ listStr);
        System.out.println("value at index 2: "+ listStr.get(2));
        listStr.remove(2);
        System.out.println("value at index 2:: "+ listStr.get(2));
        listStr.remove(2);
        System.out.println("listStr:: "+ listStr);
        System.out.println();
        /*
        o/p
            N
            N1
            N2
            listStr: [N, N1, N2]
            listStr:: [test, N1, N2, Bhanu]
            value at index 2: N2
            value at index 2:: Bhanu
            listStr:: [test, N1]
         */
    }
}
