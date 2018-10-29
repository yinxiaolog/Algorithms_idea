package chapter1.chapter1_4;

public class Exercise1417 {
    public static double[] maxSub(double[] a){
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double[] result = new double[2];

        for(int i = 0;i < a.length;i++){
            if(a[i] > max){
                max = a[i];
            }
            if(a[i] < min){
                min = a[i];
            }
        }

        result[0] = min;
        result[1] = max;

        return result;
    }
}
