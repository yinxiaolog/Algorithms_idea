package chapter1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise1124 {
    public static void main(String[] args) {
        int p = StdIn.readInt();
        int q = StdIn.readInt();
        StdOut.println(euclid(p, q));
    }

    public static int euclid(int p, int q) {
        StdOut.println(p + " " + q);
        if (p < q) {
            return euclid(q, p);
        }

        if (p % q == 0) {
            return q;
        }

        p = p % q;

        return euclid(q, p);
    }
}
