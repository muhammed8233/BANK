package Chapter6;

import java.util.Scanner;

public class SumOfDigit {
    public static int factorial (int number){
        int counter = 1;
        for (int i = 2; i <= number ; i++) {
            counter = counter * i;
        }
        return  counter;
    }

public static String squarial (String numbers){
    for (char i = 0; i < numbers.length(); i++) {
        char x = numbers.charAt(i);
        System.out.printf("%c     ", x);
    }
    return numbers;
}

public static String objet(String number){
        char digit;
        for (char i = 0; i < number.length(); i++){
            digit = number.charAt(i);
            System.out.print(digit);
        }
    for (int j = 0; j < number.length() - 12; j++) {
        System.out.print("#");
    }
    return number;
}

    public static void main(String[] args) {
       int sum = factorial(5);
        System.out.println(sum);
        Scanner scanner = new Scanner(System.in);
        String entry = scanner.next();
        squarial(entry);
        System.out.println();
        objet("123672457826236");
    }
}