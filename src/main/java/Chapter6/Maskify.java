package Chapter6;

import java.util.Arrays;

public class Maskify {
    public static String objet(String number){
        char digit = 0;
        for (char i = 0; i < number.length(); i++){
            if(i <= 6) {
                System.out.print("#");
            }
            if (i > 7) {
                digit = number.charAt(i);
                System.out.print(digit);
            }
        }

        return number;
    }

    public static void main(String[] args) {
        objet("6889451276454309978546567");
    }
}
