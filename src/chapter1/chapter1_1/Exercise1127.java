package chapter1.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise1127 {
    public static void main(String[] args) {
        StdOut.println(binomial(100, 50, 0.25));
    }

    public static double binomial(int N, int k, double p) {
        if (N == 0 && k == 0) {
            return 1.0;
        }

        if (N < 0 || k < 0) {
            return 0;
        }

        return (1.0 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
    }
}
