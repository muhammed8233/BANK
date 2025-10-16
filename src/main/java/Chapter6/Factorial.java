package Chapter6;

public class Factorial {
    public static int factorial (int number){
        int counter = 1;
        for (int i = 2; i <= number ; i++) {
            counter = counter * i;
        }
        return  counter;
    }



    public static void main(String[] args) {
        int sum = factorial(5);
        System.out.println(sum);

    }
}
