package Chapter6;

import java.util.Scanner;

public class DisplayNumber {
    public static String squarial (String numbers){
        for (char i = 0; i < numbers.length(); i++) {
            char x = numbers.charAt(i);
            System.out.printf("%c   ", x);
        }
        return numbers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entry = scanner.next();
        squarial(entry);
        System.out.println();
    }
}
