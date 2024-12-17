package DSANotesProblems;

import java.util.Scanner;

public class SwitchCaseExample {
    static void caseExample(String str){
       // Scanner day   = new Scanner(System.in);
        str = "eeafdfads";
        String dayName ="";
        switch(str){
            case "Monday":
                dayName = "Monday";
                break;
            case "Tuesday":
                dayName = "Tuesday";
                        break;
            case "Wen":
                dayName = "Wen";
                break;

            case "THU":
                dayName =  "THU";
                break;
            case "FRI":
                dayName =   "FRI";
                    break;
            case "SAT":
                dayName =  "SAT";
                        break;
            case "SUN":
                dayName =  "SUN";
                break;
            case "Invalid":
                    dayName =  "Invalid week";
                    break;
        }
        System.out.println("Day Name is: "+ dayName);
    }

    static void caseExScanner(){
        Scanner day = new Scanner(System.in);
        int in = day.nextInt();

        String dayName;

        switch (in){
            case 1:
                dayName="MON";
                break;
            case 2:
                dayName="TUE";
                break;
            case 3:
                dayName="WEN";
                break;
            case 4:
                dayName="THU";
                break;
            case 5:
                dayName="FRI";
                break;
            case 6:
                dayName="SAT";
                break;
            case 7:
                dayName="SUN";
                break;
            default:
                dayName = "Invalid day! Please enter a number between 1 and 7.";

        }
        System.out.println("Day entered is: "+ dayName);

    }
    public static void main(String[] args) {
        //caseExample("Monday");
        caseExScanner();
    }

}
