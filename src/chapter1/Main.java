package chapter1;

import edu.princeton.cs.algs4.StdOut;

public class Main {



    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, 0);
    }

    public static int rank(int key, int[] a, int low, int high, int depth) {
        for (int i = 0; i < depth; i++) {
            StdOut.print("\t");
        }

        StdOut.println("depth: " + depth + " low: " + low + " high: " + high);

        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;
        if (key < a[mid]) {
            return rank(key, a, low, mid + 1, depth + 1);
        } else if (key > a[mid]) {
            return rank(key, a, low + 1, high, depth + 1);
        } else {
            return mid;
        }
    }

    public static double ln(int N) {
        if (N == 1)
            return 0;
        return ln(N - 1) + Math.log(N);
    }
}
