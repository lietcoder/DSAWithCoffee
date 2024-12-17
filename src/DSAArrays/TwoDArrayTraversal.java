package DSAArrays;

import java.util.Arrays;

public class TwoDArrayTraversal {
    public void twoDtraversal(){
        int[][] twoDint ={{1,2,3, 433},{4,5,22,433},{6,7,8,4}};
          for(int r=0; r<twoDint.length;r++){ //iterates rows
              for(int c=0; c<twoDint[r].length; c++){//iterates cols
                  System.out.print(twoDint[r][c] + " ");
              }
              System.out.println();  // Move to the next line after each row
          }
        }
        /*
        output:
                1 2 3 433
                4 5 22 433
                6 7 8 4
         */
  }

