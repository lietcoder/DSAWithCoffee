package leetcode.leetcode_1211;

import java.util.Arrays;
import java.util.HashSet;

public class ValidSudoku_36 {

    static boolean validSudoku(int[][] sud) {
        for (int i = 0; i < sud.length; i++) {
            for (int j = 0; j < sud[i].length; j++) {
                if (sud[i][j] >= 0 || sud[i][j] <= 9) {
                    System.out.println("*******");
                    System.out.println("Element at ij is: "+ sud[i][j]);
                    return true;
                }
                else
                    return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] sud = new int[][]{{1, 2, 3}, {7, 8, 9}, {1, 2, 3}};
        int[][] sud1 = new int[][]{{-1, 2, 3}, {7, 8, 9}, {1, -2, 3}};
       // System.out.println(" ** valid sudoku : "+ validSudoku(sud));
        //System.out.println("** valid sudoku1 : "+ validSudoku(sud1));
        //validSudoku();
        char[][] board = {
                {'0', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
       // System.out.println("Sudoku is valid: "+validSudoku(board));

        char[][] board1 = {
                {'6', '6', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'5', '.', '.', '.', '8', '.', '.', '7', '9'} // Duplicate '5' in the first column
        };
       // System.out.println("Sudoku is valid: "+validSudoku(board1));
        char[][] board2_full = {
                {'5', '3', '4', '6', '7', '8', '9', '1', '2'},
                {'6', '7', '2', '1', '9', '5', '3', '4', '8'},
                {'1', '9', '8', '3', '4', '2', '5', '6', '7'},
                {'8', '5', '9', '7', '6', '1', '4', '2', '3'},
                {'4', '2', '6', '8', '5', '3', '7', '9', '1'},
                {'7', '1', '3', '9', '2', '4', '8', '5', '6'},
                {'9', '6', '1', '5', '3', '7', '2', '8', '4'},
                {'2', '8', '7', '4', '1', '9', '6', '3', '5'},
                {'3', '4', '5', '2', '8', '6', '1', '7', '9'}
        };
        System.out.println("Sudoku is valid: "+validSudoku(board2_full));


    }
    static boolean validSudoku(char[][] board){
        HashSet<Character>[] r = new HashSet[9];
        HashSet<Character>[] c= new HashSet[9];
        HashSet<Character>[] in = new HashSet[9];
        for(int i=0; i<9; i++){
            r[i] = new HashSet<>();
            c[i] = new HashSet<>();
            in[i] = new HashSet<>();
        }
        System.out.println("r is: "+ Arrays.toString(r));
        System.out.println("c is: "+ Arrays.toString(c));
        System.out.println("in is: "+ Arrays.toString(in));

       for(int i=0;i<9;i++){
           for(int j=0;j<9;j++){
                char ch = board[i][j];
                int ascii = ch;
                System.out.println("ch is: "+ ch+ " ascii is   "+ ascii);
                if (ch =='.') {
                    continue;
                }
               if (r[i].contains(ch) || ascii<49 ||ascii>57 ) {
                   System.out.println("Duplicate found or char is not number "+ r[i]+ "    "+ch);
                   return false;
               }
                r[i].add(ch);
               System.out.println("r is: "+ Arrays.toString(r));
               if (c[j].contains(ch)) {
                   System.out.println("Duplicate found: "+ c[j]+ "    "+ch);
                   return false;
               }
               c[j].add(ch);
               System.out.println("c is: "+ Arrays.toString(c));

               int subbox = (i / 3) * 3 + j / 3;
               System.out.println("Subox: "+subbox);
               if(in[subbox].contains(ch)){
                   return false;
               }
               in[subbox].add(ch);
               System.out.println("in is: "+ Arrays.toString(in));

//               System.out.println("r is*** : "+ Arrays.toString(r));
//               System.out.println("c is**: "+ Arrays.toString(c));
//               System.out.println("in is*: "+ Arrays.toString(in));
           }
       }
       return true;
    }

}
