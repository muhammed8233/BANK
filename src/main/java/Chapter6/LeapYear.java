package Chapter6;

import java.util.Scanner;

public class LeapYear {

    public static boolean isLeapYears(int user){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter year");
        user = input.nextInt();
        if(user % 4 == 0 && user % 100 != 0){
            System.out.println(user +" is a leap Year");
        }else {
            System.out.println(user + " is not a leap Year");
        }
        return true;
    }
    public static void main(String[] args) {
       isLeapYears(2011);
    }
}
