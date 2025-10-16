package Chapter6;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int number){
        Scanner input = new Scanner(System.in);
        number = number;

        if(number % 2 != 0 && number % 3 != 0){
            System.out.println("true");
            return true;
        }else {
            System.out.println("false");
            return false;
        }
    }

    public static void main(String[] args) {
        isPrime(4);
    }
}
