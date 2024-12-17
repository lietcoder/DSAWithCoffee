package DSANotesProblems;

public class FibonacciSequence {

    static void fibonacci(int n){
        int a=0; int b=1;
        System.out.println(a);
        System.out.println(b);
        int next =0;
        while (a<=n){
            next =a+b;
            System.out.println(next);
            a=b; b=next;
        }
    }
    static void fibonacciFor(int n){
        int a=0; int b=1; int temp;
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<n;i++){
            temp=a+b;
            System.out.println(temp);
            a=b; b=temp;
        }
    }

    public static void main(String[] args) {
        fibonacci(10);
        System.out.println();
        fibonacciFor(10);

    }
}
