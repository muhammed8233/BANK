package Array;

import java.util.Arrays;

public class Array {
    public static int [] populateArray(int[] x){
        for(int i = 0; i < x.length; i++){
            x[i] = i;
        }

        return x;
    }

    public static int array(){
        int sum = 0;
        int [] m = {1,3,45,65,76,97,43,12,43};
        for(int i = 0; i < m.length; i++){
            sum += m[i];

        }
        return sum;
    }

    public static State[] states(State[] x){
            x [0] = State.LAGOS;
            x [1] = State.KANO;

        return x;
    }
    public static int[] multiple(){
        int[] z = new int[10];
        int[] x = {3, 17, 20, 1, 0, 18, 2, 4, 5, 10};
        for(int i = 0; i < z.length; i++){
            z[i] = x[i] * 2;
        }
        System.out.println(Arrays.toString(x));
        return z;
    }
}