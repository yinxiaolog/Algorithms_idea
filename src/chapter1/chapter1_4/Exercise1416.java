package chapter1.chapter1_4;

import java.util.Arrays;

public class Exercise1416 {
    public static double[] maxSub(double[] a){
        Arrays.sort(a);
        double[] result = new double[2];
        double minSub = Double.MAX_VALUE;
        for(int i = 0;i < a.length - 1;i++){
            double sub = a[i + 1] - a[i];
            if(sub < minSub){
                minSub = sub;
                result[0] = a[i];
                result[1] = a[i+1];
            }
        }

        return result;
    }
}
