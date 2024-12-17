package DSANotesProblems;

import java.util.Scanner;
import java.util.Stack;

public class StackExampleUsingJDK {
    static void stackOperations(){
        Stack<String> stack = new Stack<>();
//        Scanner scan = new Scanner(System.in);
        stack.push("nani");
        stack.push("teja");
        stack.push("bambi");
        stack.push("sanju");
        stack.push("nanna");
        stack.push("amma");
        stack.push("maamma");
        stack.push("babai");
        System.out.println("Stack items are: "+ stack);
        System.out.println("Peek of stack***: "+ stack.peek());
        System.out.println("is stack empty** : "+ stack.isEmpty() + "  "+ stack.size());

        for(int i =stack.size()-1; i>=0; i--)

        while(!stack.isEmpty()){ //This is popping all elements from stack
            System.out.println("popping: " +stack.pop()); //
        }
        System.out.println("is stack empty: "+ stack.isEmpty() + "  "+ stack.size());
        for (int i=0;i<stack.size();i++){
            System.out.println("i is: "+i);
            System.out.println("Pop stack : "+ stack.pop());
//            System.out.println("Peek of stack: "+ stack.peek());
        }
        System.out.println("is stack empty: "+ stack.isEmpty() + "  "+ stack.size());
    }
    public static void main(String[] args) {
        stackOperations();
    }
}
