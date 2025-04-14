import java.util.*;
import java.lang.System;

public class numIsPrime {
    public static void main(String[] args) {
        // take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();

        // set number prime for chack
        Boolean numisPrime = true;
        
        // chack for prime number
        if (num <= 1) {
            numisPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    numisPrime = false;
                    break;
                }
            }
            
        }
        if (numisPrime) {
            System.err.println("The Number is prime");
        }else{
            System.out.println("Number is not prime");
        }
        sc.close();
    }
}
