package DSAArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MultiLevelArrayList {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        ArrayList<ArrayList<Integer>> multiAlist = new ArrayList<>();
//        //initialize
//        for (int i=0;i<3;i++){
//            multiAlist.add(new ArrayList<>());
//        }
//        //add values
//        for(int i=0;i<3; i++){
//            for (int j=0; j<3;j++){
//                multiAlist.get(i).add(in.nextInt());
//            }
//        }
//        System.out.println("multi level array list: "+ multiAlist);
//    }
    public static void printMultiLevelAL(){
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> multiAlist = new ArrayList<>();
        //initialize
        for (int i=0;i<2;i++){
            multiAlist.add(new ArrayList<>());
        }
        //add values
        for(int i=0;i<2; i++){
            for (int j=0; j<2;j++){
                multiAlist.get(i).add(in.nextInt());
            }
        }
        System.out.println("multi level array list: "+ multiAlist);
    }
    /*
    o/p
            1
            1
            1
            11
            1
            1
            11
            11
            11
            1
            11
            1
            multi level array list: [[1, 1, 1, 11], [1, 1, 11, 11], [11, 1, 11, 1]]
     */
}
