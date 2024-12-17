package JavaPrograms;

import javax.crypto.spec.PSource;

public class NumberPrime {
    public static void main(String[] args) {
        //isPrime(99);
        whileEx(34234);
        //switchEx("apple");
    }
    static void isPrime(int i){
        System.out.println("i/10 is: "+ i/10);
        System.out.println("i%10 is: "+ i%10);
        i=i%10;
        System.out.println("i is: "+i);
        System.out.println("i is: "+i/2 + "  "+ i%2);
        System.out.println("i is: "+i/3+ "  "+ i%3);
        System.out.println("i is: "+i/5+ "  "+ i%5);

        if(i%2==0 || i%3==0 || i%5==0) {
            System.out.println("i is not a primary no");
        }
            else {
                System.out.println("no is a primary no.");
            }

    }
    static void whileEx(int i){
        System.out.println("i is: "+ i+ "  "+i/10 + "  "+ i%10);
        while(i>0){
            System.out.println(" i%10 is :"+ i/10);
            i=i/10;
        }
    }
//    static void switchEx(String st){
//        case apple{
//            System.out.println("passed fruit is: "+ apple);
//            break;
//        }
//        case orange{
//            System.out.println("passed fruit is: "+ orange);
//        }
//    }
}
