package chapter1.chapter1_2;

import edu.princeton.cs.algs4.StdOut;

public class Exercise1206 {
    public static void main(String[] args) {
        String s = args[0];
        String t = args[1];

        int index = s.indexOf(t.charAt(0));

        if (t.equals(s.substring(index, s.length()) + s.substring(0, index))) {
            StdOut.println(true);
        } else {
            StdOut.println(false);
        }
    }
}
