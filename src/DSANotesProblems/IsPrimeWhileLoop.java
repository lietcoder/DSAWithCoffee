package DSANotesProblems;

public class IsPrimeWhileLoop {
    public static void main(String[] args) {
//        System.out.println("isPrime: "+isPrime(25));
//        System.out.println("isPrime: "+isPrime(27));
//        System.out.println("isPrime: "+isPrime(23));
//        System.out.println("isPrimeWhile: "+isPrimeWhile(25));
//        System.out.println("isPrimeWhile: "+isPrimeWhile(27));
        System.out.println("isPrimeWhile: "+isPrimeWhile(9));
        System.out.println("isPrimeWhile: "+isPrimeWhile(11));

        System.out.println("isPrimeWhile: "+isPrimeWhile(19));
        System.out.println("isPrimeWhile: "+isPrimeWhile(21));



    }
    static boolean isPrime(int num){
        if(num<=1)
            return false;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
    static boolean isPrimeWhile(double n){
        if(n<=1)
            return false;
        double sqrt = Math.sqrt(n);
        int i=2;
        System.out.println("sqrt and i are: "+ sqrt+"   "+i);
       while(sqrt>=i){
           if(n%i==0){
               System.out.println("** sqrt and i are: "+ sqrt+"   "+i);
               return false;
           }

           i++;
       }
        System.out.println("** $$ sqrt and i are: "+ sqrt+"   "+i);
       return true;
    }
}
