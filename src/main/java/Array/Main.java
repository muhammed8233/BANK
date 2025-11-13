package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] y = new int [100];
        System.out.println(Arrays.toString(Array.populateArray(y)));
        System.out.println();
        System.out.println(Array.array());
        System.out.println();
        State[] x = new State[2];
        System.out.println(Arrays.toString(Array.states(x)));
        System.out.println();
        System.out.println(Arrays.toString(Array.multiple()));
    }
}
