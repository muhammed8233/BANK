package Palindrome;

import java.util.Scanner;

public class Palindrome {
    public static String palindrome(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number or words");
        String user = input.nextLine();
        String reversed = "";

        for(int i = user.length() - 1; i >= 0; i--){
            reversed = reversed + user.charAt(i);
        }

        if(user.equalsIgnoreCase(reversed)){
            System.out.println(reversed + " it is a palindrome");
        }else {
            System.out.println(reversed + " not a palindrome");
        }
        return reversed;
    }
    public static void main(String[] args) {
        palindrome();


    }
}
