package DSANotesProblems;

import java.util.Stack;

public class MatchingBracketStack {

    static boolean matchingBracket(String s){
        Stack<Character> stack = new Stack<>();
        int counter=0;
        for(char c: s.toCharArray()){
            if(c=='{'||c=='['||c=='(') {
                System.out.println("In if");
                stack.push(c);
                System.out.println("Counter: "+ counter++);
                //System.out.println("Stack is: " +stack);
            }
            else if(c=='}'||c==']'||c==')'){
               // System.out.println("In else");
                System.out.println("stack size: "+ stack.size());
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                System.out.println("isMatching: "+ top+ " "+isMatching(top, c));
                if(!isMatching(top,c)){
                    return false;
                }
            }
        }
        System.out.println("Stack after push pop is: "+ stack);
        return stack.isEmpty();
    }
    static boolean isMatching(char open, char close){
        return(open=='(' && close==')'||
                open=='{' && close =='}' ||
                open =='[' && close == ']');
    }
    public static void main(String[] args) {
        String s1 = "{[(}]}";
        String s2 = "{[[()]]}";
        //System.out.println("Is matching brackets: "+ matchingBracket(s1));
        System.out.println("Is matching brackets:  : "+matchingBracket(s2));

       // System.out.println("matching braces: "+ matchingBraces("{[(]]}"));
    }

    static boolean matchingBraces(String s){
        char[] ch= s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char c: ch){
            if(c=='[')
                stack.push(']');
            else if(c=='{')
                stack.push('}');
            else if(c=='(') {
                stack.push(')');
                System.out.println("stack.isEmpty**: "+ stack.isEmpty()+ "  stack.peek(): "+ stack.peek()+ "stack is: "+ stack);

            }
            else if(stack.isEmpty() || stack.pop()!=c) {
                System.out.println("stack.isEmpty: "+ stack.isEmpty()+ "  stack.peek(): "+ stack.peek() + "stack: "+ stack);
                return false;
            }
        }
        return true;
    }


}
