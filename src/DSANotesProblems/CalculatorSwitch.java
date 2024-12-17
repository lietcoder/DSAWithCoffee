package DSANotesProblems;

import java.util.Scanner;

public class CalculatorSwitch {
    static void claculator(int i, int j, char operation){
        Scanner scan = new Scanner(System.in);
        //byte operation = scan.nextByte();
        //int i=scan.nextInt();
        //int j=scan.nextInt();
        float result=0;
       switch(operation) {
           case '+':
               result = i + j;
               break;
           case '-':
               result = i - j;
               break;
           case '*':
               result = i * j;
               break;
           case '/':
               result = i / j;
               break;
           case '%':
               result = i % j;
               break;
           case '^':
               result = i ^ j;
               break;
           case 'a':
               result = 0;
               break;
       }
        System.out.println("Result is: "+ result);
        }
    public static void main(String[] args) {
        claculator(2,4, '+');
        claculator(2,4, '*');
        claculator(2,4, '/');
        claculator(2,4, '%');
        claculator(2,4, '-');
        claculator(2,4, 'a');





    }

}

