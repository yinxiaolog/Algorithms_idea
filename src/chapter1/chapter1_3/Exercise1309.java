package chapter1.chapter1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise1309 {
    public static void main(String[] args) {
        Stack<String> ops = new Stack<String>();
        Stack<String> vals = new Stack<String>();

        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if (s.equals("+")) {
                ops.push(s);
            } else if (s.equals("-")) {
                ops.push(s);
            } else if (s.equals("*")) {
                ops.push(s);
            } else if (s.equals("/")) {
                ops.push(s);
            } else if (s.equals(")")) {
                String op = ops.pop();
                String v = vals.pop();

                if (op.equals("+")) {
                    v = "( " + vals.pop() + " " + "+" + " " + v + " )";
                } else if (op.equals("-")) {
                    v = "( " + vals.pop() + " " + "+" + " " + v + " )";
                } else if (op.equals("*")) {
                    v = "( " + vals.pop() + " " + "+" + " " + v + " )";
                } else if (op.equals("/")) {
                    v = "( " + vals.pop() + " " + "+" + " " + v + " )";
                }

                vals.push(v);
            } else {
                vals.push(s);
            }
        }
        StdOut.println(vals.pop());
    }
}
