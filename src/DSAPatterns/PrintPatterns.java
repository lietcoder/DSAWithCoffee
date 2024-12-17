package DSAPatterns;


public class PrintPatterns {
    public static void main(String[] args) {
        pattern2(5);
        pattern3(5);
        pattern1(5);
        pattern4(4);
        patter5(3);
        patter28(4);
        patter17(4);
    }
   static void pattern2(int n){
       for(int i =1; i<=n;i++){
           for(int j=1;j<=i; j++){
               System.out.print("* ");
           }
           System.out.println();
       }
   }

   static void pattern3(int n){
        for(int r=1;r<=n;r++){
            for(int c =1; c<= n-r+1; c++){
                System.out.print("* ");
            }
            System.out.println();
        }
   }
   static void pattern1(int n){
       System.out.println();
        for(int r=1; r<=n; r++){
            for(int c=1; c<=n;c++){
                System.out.print("* ");
            }
            System.out.println();
        }
   }
   static void pattern4(int n){
       System.out.println();
        for(int i=1; i<=n; i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
   }
   static void patter5(int n){
       System.out.println();
        for(int i=0;i<=n*2;i++){
            int totalCols= i>=n? 2*n-i:i;
            for(int j =0;j<=totalCols;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
   }
    static void patter28(int n){
        System.out.println("Pattern 28");
        for(int i=0;i<=n*2;i++){
            int totalCols= i>=n? 2*n-i:i;
            int noOfSpaces = n-totalCols;
            for(int c =0; c<noOfSpaces; c++){
                System.out.print(" ");
            }
            for(int j =0;j<=totalCols;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patter17(int n){
        System.out.println();
        for(int i=0;i<=n*2;i++){
            int totalCols= i>=n? 2*n-i:i;
            int noOfSpaces = n-totalCols;
            for(int c =1; c<noOfSpaces; c++){
                System.out.print(" ");
            }
            for(int j =0;j<=totalCols;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }


}
