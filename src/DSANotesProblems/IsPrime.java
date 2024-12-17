package DSANotesProblems;

import java.util.Scanner;

public class IsPrime {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
    String str=null;

    if (isPrime(number)) {
        System.out.println(number + " is a prime number.");
    } else {
        System.out.println(number + " is not a prime number.");
    }
}

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers <= 1 are not prime
        }

        // Check divisors from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            System.out.println("looping ");
            System.out.println("** n and i are: "+ num+"  "+i +"  "+ Math.sqrt(num));
            if (num % i == 0) {
                System.out.println(" n and i are: "+ num+"  "+i+  "  "+Math.sqrt(num));
                System.out.println("num % i : "+num % i );
                System.out.println("num / i : "+num / i );

                return false; // Found a divisor
            }
        }
        return true; // No divisors found, number is prime
    }
}
