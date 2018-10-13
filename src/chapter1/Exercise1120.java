package chapter1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise1120 {
    public static void main(String[] args){
        StdOut.println(ln(1000));
    }

    public static double ln(int N) {
        if (N == 1)
            return 0;
        return ln(N - 1) + Math.log(N);
    }
}
