package DSAStacksQueues;

import java.util.Arrays;

public class DSADynamicCustomeStack extends DSACustomeStackImple {
    int size;
    public DSADynamicCustomeStack() {
        super();
    }
    public DSADynamicCustomeStack(int size) {
        this.size= size;

       // super(size);
    }

    @Override
    public boolean push(int value) throws StackCustomException{
        DSADynamicCustomeStack dynamicStack = new DSADynamicCustomeStack();
        if(isFull()){
            System.out.println("stack size: "+ stack.length);
           int[] temp = new int[stack.length*2];
            System.out.println("temp size: "+ temp.length);


            for(int i=0;i<stack.length;i++){
               temp[i] = stack[i];
           }
            System.out.println("stack is: "+ Arrays.toString(stack));
           stack = temp;
            System.out.println("temp is: "+ Arrays.toString(temp));

        }

        return super.push(value);
    }
//    @Override
//    public int pop() {
//        return 0;
//    }

    public static void main(String[] args) throws StackCustomException {
        DSADynamicCustomeStack stack = new DSADynamicCustomeStack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println( stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println( stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.pop());

        System.out.println(stack.pop());

        // System.out.println(stack.pop());


    }
}
