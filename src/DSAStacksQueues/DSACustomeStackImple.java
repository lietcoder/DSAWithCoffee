package DSAStacksQueues;

public class DSACustomeStackImple {
    protected int[] stack;
    private static final int Default_size = 6;
    int pntr = -1;

    public DSACustomeStackImple() {
        this(Default_size);
    }

    public DSACustomeStackImple(int size) {
        this.stack = new int[5];
    }

    public boolean push(int i) throws StackCustomException {
        System.out.println("Calling push");
        if (isFull()) {
            System.out.println("Stack is full");
            throw new StackCustomException("Stack is full");
        }
        pntr++;
        stack[pntr] = i;
        return true;
    }

    public int pop() throws StackCustomException {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            throw new StackCustomException("Stack is empty");
        }
        return stack[pntr--];
    }

    public int peek() throws StackCustomException {
        if (isEmpty()) {
            System.out.println("Stack is empty, can't peek from an empty stack");
            throw new StackCustomException("Stack is empty, can't peek from an empty stack");
        }
        return stack[pntr];
    }

    public boolean isFull() {
        return pntr == stack.length - 1;
    }

    public boolean isEmpty() {
        return pntr == -1;
    }

    public static void main(String[] args) throws StackCustomException {
        try {
            DSACustomeStackImple stacks = new DSACustomeStackImple(5);
            stacks.push(1);
//        stacks.push(2);stacks.push(3);stacks.push(4);
            stacks.push(5);
            stacks.push(6);
            stacks.push(7);
            stacks.push(8);

            System.out.println(stacks.peek());
            System.out.println(stacks.peek());
            System.out.println(stacks.peek());
            System.out.println(stacks.peek());
            System.out.println(stacks.peek());

            stacks.push(10);
            //stacks.push(11);
            System.out.println(stacks.pop());
            System.out.println(stacks.pop());
            System.out.println(stacks.pop());
            System.out.println(stacks.pop());
            System.out.println(stacks.pop());
           // System.out.println(stacks.pop());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
