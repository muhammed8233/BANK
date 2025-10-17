package SumOfDigit;

import java.util.Scanner;

public class SumOfDigit {
   public static int sumOf( int number ) {
       int sum = 0;
       while (number != 0) {
           int digit = number % 10;
           sum += digit;
           number /= 10;
       }
       System.out.println(sum);
       return sum;
   }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter digit");
        int number = input.nextInt();
        sumOf(number);
    }
}