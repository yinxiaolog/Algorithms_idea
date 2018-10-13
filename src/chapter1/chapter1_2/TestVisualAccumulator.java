package chapter1.chapter1_2;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class TestVisualAccumulator {
    public static void main(String[] args) {
        int T = Integer.parseInt("2000");
        VisualAccumulator a = new VisualAccumulator(T, 1.0);
        for (int i = 0; i < T; i++) {
            a.addDateValue(StdRandom.uniform());
        }
        StdOut.println(a);
    }
}
