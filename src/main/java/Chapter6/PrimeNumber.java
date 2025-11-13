package Chapter6;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean Prime(int number){
       boolean isPrime = true;


       if (number <= 1) {
           isPrime = false;
           System.out.println("false");
       }else {
           for(int i = 2; i < number / 2; i++) {
               if (number % i == 0) {
                   isPrime = false;
                   System.out.println("false");
                   break;
               }
           }
       }
        if(isPrime){
            System.out.println("true");
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        Prime(number);
    }
}
